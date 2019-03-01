package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationHideEvent extends NotificationEvent {
  var element: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object NotificationHideEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Notification,
    element: kendoDashUiLib.JQuery = null
  ): NotificationHideEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[NotificationHideEvent]
  }
}

