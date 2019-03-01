package typings
package pathfindingLib.pathfindingMod.PathfindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpPointFinderOptions extends Heuristic {
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.undefined
}

object JumpPointFinderOptions {
  @scala.inline
  def apply(
    diagonalMovement: DiagonalMovement = null,
    heuristic: js.Function2[/* dx */ scala.Double, /* dy */ scala.Double, scala.Double] = null
  ): JumpPointFinderOptions = {
    val __obj = js.Dynamic.literal()
    if (diagonalMovement != null) __obj.updateDynamic("diagonalMovement")(diagonalMovement)
    if (heuristic != null) __obj.updateDynamic("heuristic")(heuristic)
    __obj.asInstanceOf[JumpPointFinderOptions]
  }
}

