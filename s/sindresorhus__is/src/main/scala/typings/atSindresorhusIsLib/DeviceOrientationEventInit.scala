package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOrientationEventInit extends EventInit {
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  var alpha: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var beta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var gamma: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object DeviceOrientationEventInit {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    alpha: scala.Int | scala.Double = null,
    beta: scala.Int | scala.Double = null,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    gamma: scala.Int | scala.Double = null
  ): DeviceOrientationEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationEventInit]
  }
}

