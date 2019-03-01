package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalViewBeforeOpenEvent extends ModalViewEvent {
  var target: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object ModalViewBeforeOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ModalView,
    target: kendoDashUiLib.JQuery = null
  ): ModalViewBeforeOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ModalViewBeforeOpenEvent]
  }
}

