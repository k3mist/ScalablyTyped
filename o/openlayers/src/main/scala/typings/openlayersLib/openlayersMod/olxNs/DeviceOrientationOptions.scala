package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOrientationOptions extends js.Object {
  var tracking: js.UndefOr[scala.Boolean] = js.undefined
}

object DeviceOrientationOptions {
  @scala.inline
  def apply(tracking: js.UndefOr[scala.Boolean] = js.undefined): DeviceOrientationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tracking)) __obj.updateDynamic("tracking")(tracking)
    __obj.asInstanceOf[DeviceOrientationOptions]
  }
}

