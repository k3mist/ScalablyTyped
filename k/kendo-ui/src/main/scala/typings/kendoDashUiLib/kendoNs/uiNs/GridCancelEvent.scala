package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCancelEvent extends GridEvent {
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
}

object GridCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Grid,
    container: kendoDashUiLib.JQuery = null,
    model: kendoDashUiLib.kendoNs.dataNs.Model = null
  ): GridCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[GridCancelEvent]
  }
}

