import Ajv from 'ajv'
import addFormats from 'ajv-formats'
import { log } from 'scripts/logger'

// Initialize AJV

const ajv = new Ajv({
	logger: log,
	passContext: true,
	removeAdditional: true,
	strict: 'log',
	strictSchema: 'log',
	strictTypes: 'log',
	useDefaults: true,
	validateFormats: true,
	verbose: true
})
	.addKeyword({
		keyword: 'releaseStage',
		metaSchema: {
			description:
				"Indicates the release status of this schema.  Non-'release' schema may be stripped from the output.",
			enum: ['unstable', 'experimental', 'release'],
			default: 'release'
		}
	})
	.addKeyword({
		keyword: 'i18n',
		type: 'string',
		metaSchema: {
			description:
				'Indicates that a string value is localizable, and should be included with internationalization (A.K.A. i18n) data.',
			type: 'boolean',
			default: false
		}
	})
	.addKeyword({
		keyword: 'macro',
		metaSchema: {
			description:
				'Indicates that this schema is used for compiling data, but is not included in the final data output.',
			type: 'boolean',
			default: false
		}
	})
	.addFormat('markdown', true)

addFormats(ajv)

export default ajv