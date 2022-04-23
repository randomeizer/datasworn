import type { Gamespace } from "@json_out/common/Gamespace.js";
import type { IHasDescription , IHasDisplay , IHasSource } from "@json_out/index.js";
import type { IDisplay } from "@json_out/meta/IDisplay.js";
import type { IHasId, IHasName } from "@json_out/meta/IHas.js";
import type { IMove } from "@json_out/moves/IMove.js";

/**
 * @public
 */
export type MoveCategoryTitle = `${MoveCategoryName} Moves`;

/**
 * "Assets" is also valid, technically, but it's only used in IDs, so it's omitted here.
 * @public
 */
export enum MoveCategoryName {
    Session = "Session",
    Adventure = "Adventure",
    Quest = "Quest",
    Connection = "Connection",
    Exploration = "Exploration",
    Combat = "Combat",
    Suffer = "Suffer",
    Recover = "Recover",
    Threshold = "Threshold",
    Legacy = "Legacy",
    Fate = "Fate",
}


/**
 * @public
 */
export type MoveCategoryId = `${Gamespace}/${MoveCategoryIdBase}`;
/**
 * @public
 */
export type MoveCategoryIdBase = `Moves/${MoveCategoryName|"Assets"}`;

/**
 * Represents a category of moves such as "Session Moves" or "Combat Moves", and serves as a container for moves within that category.
 * @public
 */
export interface IMoveCategory extends IHasId<MoveCategoryId>, IHasName, IHasSource, IHasDescription, IHasDisplay<IDisplay> {
  /**
   * @example "Moves/Adventure"
   */
  $id: MoveCategoryId;
  /**
   * @example "Adventure"
   */
  Name: MoveCategoryName;
  Moves: IMove[];
}