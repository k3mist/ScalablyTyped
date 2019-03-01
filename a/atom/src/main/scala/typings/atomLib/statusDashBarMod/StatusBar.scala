package typings
package atomLib.statusDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBar extends js.Object {
  /**
    *  Add a tile to the left side of the status bar. Lower priority tiles are placed
    *  further to the left.
    */
  def addLeftTile(options: AddTileOptions): Tile
  /**
    *  Add a tile to the right side of the status bar. Lower priority tiles are placed
    *  further to the right.
    */
  def addRightTile(options: AddTileOptions): Tile
  /** Retrieve all of the tiles on the left side of the status bar. */
  def getLeftTiles(): js.Array[Tile]
  /** Retrieve all of the tiles on the right side of the status bar. */
  def getRightTiles(): js.Array[Tile]
}

object StatusBar {
  @scala.inline
  def apply(
    addLeftTile: js.Function1[AddTileOptions, Tile],
    addRightTile: js.Function1[AddTileOptions, Tile],
    getLeftTiles: js.Function0[js.Array[Tile]],
    getRightTiles: js.Function0[js.Array[Tile]]
  ): StatusBar = {
    val __obj = js.Dynamic.literal(addLeftTile = addLeftTile, addRightTile = addRightTile, getLeftTiles = getLeftTiles, getRightTiles = getRightTiles)
  
    __obj.asInstanceOf[StatusBar]
  }
}

