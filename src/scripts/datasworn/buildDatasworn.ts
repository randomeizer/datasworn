import fastGlob from 'fast-glob'
import fs from 'fs-extra'
import jsYaml from 'js-yaml'
import { merge, omit, pick } from 'lodash-es'
import path from 'path'
import * as Prettier from 'prettier'
import { pascalCase } from '../../schema/datasworn/common/utils.js'
import { Datasworn as DataswornBuilder } from '../../builders/datasworn.js'
import { type SourceHaver, transform } from '../../builders/transformer.js'
import type { In, Out } from '../../types/index.js'
import ajv from '../validation/ajv.js'
import { log } from '../utils/logger.js'
import { writeJSON } from './readWrite.js'
import { type DataPackageConfig } from '../../schema/tools/build/index.js'
import { ROOT_OUTPUT } from '../const.js'
import * as jsc from '../validation/jsc.js'
import JsonPointer from 'json-pointer'
import { walkObjectWithSchema } from '../utils/walk.js'
import { readSource } from './readWrite.js'

/** Builds all YAML files for a given package in {@link ROOT_DATA_IN}, and writes them to a directory in {@link ROOT_DATA_OUT} */
export async function buildSourcebook({ id, paths }: DataPackageConfig) {
	const sourcebook: Record<string, Record<string, unknown>> = {}

	const tempDir = path.join(ROOT_OUTPUT, id)

	const yamlFilesIn = await fastGlob(`${paths.source}/**/*.yaml`)

	const oldJsonFiles = await fastGlob(`${tempDir}/*.json`)
	log.info(`Found ${yamlFilesIn?.length ?? 0} YAML files in ${paths.source}`)

	if (yamlFilesIn?.length === 0)
		throw new Error(
			`Could not find any YAML files with the glob ${paths.source}/**/*.yaml`
		)

	if (oldJsonFiles?.length > 0) {
		log.info(`Deleting ${oldJsonFiles?.length} old JSON files`)
		// flush old files from outdir
		for await (const filePath of oldJsonFiles) await fs.unlink(filePath)
	}
	for await (const filePath of yamlFilesIn) {
		const data = await buildFile(filePath)

		merge(sourcebook, data)
	}
	const metadataKeys = ['source', 'id']

	const sourcebookMetadata = omit(pick(sourcebook, metadataKeys), 'source.page')

	// exclude certain keys which are still in development
	// FIXME there's probably a more elegant way to do this, by looking at the json schema's releaseFlag
	const experimentalKeys = ['augment_asset']

	// exclude metadata keys
	for await (const [k, v] of Object.entries(sourcebook)) {
		if (metadataKeys.includes(k)) continue
		if (v == null || Object.keys(v)?.length === 0) continue

		const jsonOut = { ...sourcebookMetadata, [k]: v }

		// TODO: rewrite this using keywords and Draft.each() from json-schema-library

		ajv.validate('Datasworn', jsonOut)

		const pointersToDelete: string[] = []

		jsc.input.each(jsonOut, (schema, data, pointer) => {
			const sep = '/'
			const key = pointer.split(sep)?.pop()
			if (
				key?.startsWith('_') ??
				//  experimentalKeys.includes(key as any) ||
				schema?.macro
			)
				pointersToDelete.push(pointer)
		})

		for (const pointer of pointersToDelete)
			if (JsonPointer.has(jsonOut, pointer))
				JsonPointer.remove(jsonOut, pointer)

		/** Transforms JSON -- removes macro/meta properties, which are prefixed with underscores */
		const replacer = (k: string, v: unknown) =>
			k.startsWith('_') ? undefined : v

		const outPath = path.join(tempDir, `${k}.json`)

		log.info(`Writing to ${outPath}`)

		await fs.ensureFile(outPath)
		await writeJSON(outPath, jsonOut, { replacer })
	}
}

/** Builds from the contents of a single YAML or JSON file */
async function buildFile(filePath: string) {
	log.info(`Building from ${filePath}`)
	const sourceData = await readSource(filePath)

	const baseSchemaName = 'Datasworn'

	const transformer = DataswornBuilder

	const schemaIdIn = `${pascalCase(baseSchemaName)}Input`
	const schemaIdOut = pascalCase(baseSchemaName)

	if (!ajv.validate<In.Datasworn>(schemaIdIn, sourceData)) {
		log.error(`${JSON.stringify(ajv.errors, undefined, '\t')}`)
		throw new Error(
			`YAML data in ${filePath} doesn't match the ${schemaIdIn} schema`
		)
	}

	const builtData = transform<In.Datasworn, Out.Datasworn>(
		sourceData,
		sourceData.id as string,
		sourceData as In.Datasworn & SourceHaver,
		transformer as any
	)

	if (!ajv.validate<Out.Datasworn>(schemaIdOut, builtData)) {
		log.error(`${JSON.stringify(ajv.errors, undefined, '\t')}`)

		const errorPath = path.join(
			ROOT_OUTPUT,
			path.dirname(filePath),
			path.basename(filePath, '.yaml') + `.error.json`
		)

		await fs.writeJSON(errorPath, builtData, { spaces: '\t' })
		throw new Error(
			`Transformed data doesn't match the ${schemaIdOut} schema. Dumping invalid JSON to: ${errorPath}`
		)
	}
	return builtData
}