package typings
package webvrDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRDisplayEventInit
  extends stdLib.EventInit {
  var display: VRDisplay
  var reason: js.UndefOr[VRDisplayEventReason_dt_alias] = js.undefined
}

object VRDisplayEventInit {
  @scala.inline
  def apply(
    display: VRDisplay,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    reason: VRDisplayEventReason_dt_alias = null
  ): VRDisplayEventInit = {
    val __obj = js.Dynamic.literal(display = display)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[VRDisplayEventInit]
  }
}

