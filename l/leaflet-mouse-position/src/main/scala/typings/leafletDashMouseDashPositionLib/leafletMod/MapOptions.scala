package typings
package leafletDashMouseDashPositionLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var positionControl: js.UndefOr[scala.Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(positionControl: js.UndefOr[scala.Boolean] = js.undefined): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(positionControl)) __obj.updateDynamic("positionControl")(positionControl)
    __obj.asInstanceOf[MapOptions]
  }
}

