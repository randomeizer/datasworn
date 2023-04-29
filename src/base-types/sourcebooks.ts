import {
	type Regions,
	type Metadata,
	type DelveSites,
	type Rarities,
	type Encounters,
	type Truths,
	type Oracles,
	type Moves,
	type Assets
} from '@base-types'

interface Sourcebook<T extends Metadata.Ruleset> {
	// TODO: '_source' prop when in yaml format only
	ruleset: T
	_source: Metadata.Source
	oracles?: Record<string, Oracles.OracleCollection>
	moves?: Record<string, Moves.MoveCategory>
	assets?: Record<string, Assets.AssetType>
}

export interface StarforgedSourcebook extends Sourcebook<'starforged'> {
	encounters?: Record<string, Encounters.EncounterStarforged>
	setting_truths?: Record<string, Truths.SettingTruth>
}
export interface ClassicSourcebook extends Sourcebook<'classic'> {
	regions?: Record<string, Regions.RegionEntry>
	encounters?: Record<string, Encounters.EncounterCollectionClassic>
	rarities?: Record<string, Rarities.Rarity>
	delve_sites?: Record<string, DelveSites.DelveSite>
	site_themes?: Record<string, DelveSites.DelveSiteTheme>
	site_domains?: Record<string, DelveSites.DelveSiteDomain>
	world_truths?: Record<string, Truths.WorldTruth>
}