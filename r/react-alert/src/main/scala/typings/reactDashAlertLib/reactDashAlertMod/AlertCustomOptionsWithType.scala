package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertCustomOptionsWithType extends AlertCustomOptions {
  var `type`: js.UndefOr[AlertType] = js.undefined
}

object AlertCustomOptionsWithType {
  @scala.inline
  def apply(
    onClose: js.Function0[js.UndefOr[scala.Nothing]] = null,
    onOpen: js.Function0[js.UndefOr[scala.Nothing]] = null,
    timeout: scala.Int | scala.Double = null,
    `type`: AlertType = null
  ): AlertCustomOptionsWithType = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AlertCustomOptionsWithType]
  }
}

