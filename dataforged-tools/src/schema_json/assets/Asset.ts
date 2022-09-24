import type { AssetAbility , AssetAttachment , AssetState , AssetType , AssetUsage,ConditionMeter, Display, HasAliases, HasDisplay, HasId, HasSource, HasTitle, InputClock, InputNumber, InputSelect , InputText } from "@schema_json";

/**
 * An interface representing an *Ironsworn: Starforged* asset card.
 * @public
 */
export interface Asset extends HasId,  HasDisplay, HasSource, Partial<HasAliases>, HasTitle {
  /**
   * @example "Starforged/Assets/Path/Bounty_Hunter"
   * @pattern ^(Starforged|Ironsworn)/Assets/[A-z_-]+/[A-z_-]+$
   */
  $id: string;
  Display: Display;
  /**
   * Describes any states that the asset might have, such as "Broken". Some states may disable the asset entirely.
   */
  States?: AssetState[] | undefined;
  /**
   * The ID of the asset's parent AssetType
   * @example "Starforged/Assets/Path"
   */
  "Asset Type": AssetType["$id"];
  /**
   * Information on the asset's usage, such as whether its abilities are shared amongst the player characters.
   */
  Usage: AssetUsage;
  /**
   * Details on what attachments (other assets) are accepted by this asset.
   */
  Attachments?: AssetAttachment | undefined;
  /**
   * Data describing the Input controls that should be embedded in the card. Inputs embedded in specific asset abilities appear as keys of the corresponding ability object, instead.
   */
  Inputs?: (InputNumber| InputClock| InputText| InputSelect)[] | undefined;
  /**
   * An optional markdown string representing the requirement text that appears at the top of some asset cards.
   * @markdown
   * @localize
   * @example "If you wear your finely crafted set of personal armor..."
   */
  Requirement?: string | undefined;
  /**
   * The asset's abilities.
   */
  Abilities: [AssetAbility, AssetAbility, AssetAbility];
  /**
   * Information on this asset's condition meter, if any.
   */
  "Condition Meter"?: ConditionMeter | undefined;

  Tags?: string[] | undefined;
}