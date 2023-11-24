import { Type, type Static } from '../../../typebox/index.js'
import { type SpecialTrackType } from '../common/Progress.js'
import {
	type MoveOutcomes,
	type ProgressRollMethod,
	type SpecialTrackRollMethod
} from './common.js'
import { Move, MoveEnhancement } from './utils.js'
import {
	Trigger,
	TriggerCondition,
	TriggerConditionEnhancement,
	TriggerEnhancement
} from './Trigger.js'
import * as Generic from '../utils/Generic.js'
import { ProgressTrackTypeInfo } from '../common/Progress.js'

export const ProgressRollOption = Type.Object(
	{
		using: Type.Literal('progress_track')
	},
	{ $id: '#/$defs/ProgressRollOption' }
)
export type ProgressRollOption = Static<typeof ProgressRollOption>

export const TriggerProgressRollCondition = TriggerCondition(
	Type.Ref<typeof ProgressRollMethod>('#/$defs/ProgressRollMethod', {
		default: 'progress_roll'
	}),
	Type.Array(Type.Ref<typeof ProgressRollOption>('#/$defs/ProgressRollOption')),
	{ $id: '#/$defs/TriggerProgressRollCondition' }
)

export type TriggerProgressRollCondition = Static<
	typeof TriggerProgressRollCondition
>

export const TriggerProgressRoll = Trigger(
	Type.Array(Type.Ref(TriggerProgressRollCondition)),
	{
		$id: '#/$defs/TriggerProgressRoll'
	}
)

export type TriggerProgressRoll = Static<typeof TriggerProgressRoll>

export const MoveProgressRoll = Generic.Flatten(
	[
		Move(
			'progress_roll',
			Type.Ref<typeof TriggerProgressRoll>('#/$defs/TriggerProgressRoll'),
			Type.Ref<typeof MoveOutcomes>('#/$defs/MoveOutcomes')
		),
		Type.Object({
			// is_progress_move: Type.Literal(true, { default: true }),
			tracks: Type.Ref(ProgressTrackTypeInfo, {
				description:
					'Describes the common features of progress tracks associated with this move.'
			})
		})
	],
	{
		title: 'Progress Move',
		description:
			'A progress move that rolls on a standard progress track type (defined by the move object).',
		$id: '#/$defs/MoveProgressRoll'
	}
)

export type MoveProgressRoll = Static<typeof MoveProgressRoll>

// AUGMENTS

export const TriggerProgressRollConditionEnhancement =
	TriggerConditionEnhancement(TriggerProgressRollCondition, {
		$id: '#/$defs/TriggerProgressRollConditionEnhancement'
	})
export type TriggerProgressRollConditionEnhancement = Static<
	typeof TriggerProgressRollConditionEnhancement
>

export const TriggerProgressRollEnhancement = TriggerEnhancement(
	Type.Array(
		Type.Ref<typeof TriggerProgressRollConditionEnhancement>(
			'#/$defs/TriggerProgressRollConditionEnhancement'
		)
	),
	{
		$id: '#/$defs/TriggerProgressRollEnhancement'
	}
)
export type TriggerProgressRollEnhancement = Static<
	typeof TriggerProgressRollEnhancement
>

export const MoveProgressRollEnhancement = MoveEnhancement(
	'progress_roll',
	Type.Ref(TriggerProgressRollEnhancement),
	{
		$id: '#/$defs/MoveProgressRollEnhancement'
	}
)
export type MoveProgressRollEnhancement = Static<
	typeof MoveProgressRollEnhancement
>

// SPECIAL TRACK

export const TriggerSpecialTrackConditionOption = Type.Object(
	{
		using: Type.Ref<typeof SpecialTrackType>('#/$defs/SpecialTrackType')
	},
	{ $id: '#/$defs/TriggerSpecialTrackConditionOption' }
)
export type TriggerSpecialTrackConditionOption = Static<
	typeof TriggerSpecialTrackConditionOption
>

export const TriggerSpecialTrackCondition = TriggerCondition(
	Type.Ref<typeof SpecialTrackRollMethod>('#/$defs/SpecialTrackRollMethod'),
	Type.Array(
		Type.Ref<typeof TriggerSpecialTrackConditionOption>(
			'#/$defs/TriggerSpecialTrackConditionOption'
		)
	),
	{ $id: '#/$defs/TriggerSpecialTrackCondition' }
)
export type TriggerSpecialTrackCondition = Static<
	typeof TriggerSpecialTrackCondition
>

export const TriggerSpecialTrack = Trigger(
	Type.Array(Type.Ref(TriggerSpecialTrackCondition)),
	{
		$id: '#/$defs/TriggerSpecialTrack'
	}
)

export type TriggerSpecialTrack = Static<typeof TriggerSpecialTrack>

export const MoveSpecialTrack = Move(
	'special_track',
	// is_progress_move: Type.Literal(true, { default: true }),
	Type.Ref<typeof TriggerSpecialTrack>('#/$defs/TriggerSpecialTrack'),
	Type.Ref<typeof MoveOutcomes>('#/$defs/MoveOutcomes'),

	{
		title: 'Progress Move (special track roll)',
		$id: '#/$defs/MoveSpecialTrack'
	}
)

export type MoveSpecialTrack = Static<typeof MoveSpecialTrack>

export const TriggerSpecialTrackConditionEnhancement =
	TriggerConditionEnhancement(TriggerSpecialTrackCondition, {
		$id: '#/$defs/TriggerSpecialTrackConditionEnhancement',
		description:
			'A progress move that rolls on one or more special tracks, like Bonds (classic Ironsworn), Failure (Delve), or Legacy (Starforged).'
	})
export type TriggerSpecialTrackConditionEnhancement = Static<
	typeof TriggerSpecialTrackConditionEnhancement
>

export const TriggerSpecialTrackEnhancement = TriggerEnhancement(
	Type.Array(
		Type.Ref<typeof TriggerSpecialTrackConditionEnhancement>(
			'#/$defs/TriggerSpecialTrackConditionEnhancement'
		)
	),
	{
		$id: '#/$defs/TriggerSpecialTrackEnhancement'
	}
)
export type TriggerSpecialTrackEnhancement = TriggerEnhancement<
	TriggerSpecialTrackConditionEnhancement[]
>

export const MoveSpecialTrackEnhancement = MoveEnhancement(
	'special_track',
	Type.Ref(TriggerSpecialTrackEnhancement),
	{
		$id: '#/$defs/MoveSpecialTrackEnhancement'
	}
)
export type MoveSpecialTrackEnhancement = Static<
	typeof MoveSpecialTrackEnhancement
>