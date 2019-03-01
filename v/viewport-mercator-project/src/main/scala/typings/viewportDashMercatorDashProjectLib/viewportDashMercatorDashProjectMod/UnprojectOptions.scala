package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprojectOptions extends ProjectOptions {
  var targetZ: js.UndefOr[scala.Double] = js.undefined
}

object UnprojectOptions {
  @scala.inline
  def apply(targetZ: scala.Int | scala.Double = null, topLeft: js.UndefOr[scala.Boolean] = js.undefined): UnprojectOptions = {
    val __obj = js.Dynamic.literal()
    if (targetZ != null) __obj.updateDynamic("targetZ")(targetZ.asInstanceOf[js.Any])
    if (!js.isUndefined(topLeft)) __obj.updateDynamic("topLeft")(topLeft)
    __obj.asInstanceOf[UnprojectOptions]
  }
}

