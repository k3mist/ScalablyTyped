package typings
package pathfindingLib.pathfindingMod.PathfindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpPointFinderBaseOptions extends Heuristic {
  var trackJumpRecursion: js.UndefOr[scala.Boolean] = js.undefined
}

object JumpPointFinderBaseOptions {
  @scala.inline
  def apply(
    heuristic: js.Function2[/* dx */ scala.Double, /* dy */ scala.Double, scala.Double] = null,
    trackJumpRecursion: js.UndefOr[scala.Boolean] = js.undefined
  ): JumpPointFinderBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (heuristic != null) __obj.updateDynamic("heuristic")(heuristic)
    if (!js.isUndefined(trackJumpRecursion)) __obj.updateDynamic("trackJumpRecursion")(trackJumpRecursion)
    __obj.asInstanceOf[JumpPointFinderBaseOptions]
  }
}

