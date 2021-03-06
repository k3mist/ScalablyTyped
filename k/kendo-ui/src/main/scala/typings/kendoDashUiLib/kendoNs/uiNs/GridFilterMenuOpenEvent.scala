package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFilterMenuOpenEvent extends GridEvent {
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object GridFilterMenuOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Grid,
    container: kendoDashUiLib.JQuery = null,
    field: java.lang.String = null
  ): GridFilterMenuOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[GridFilterMenuOpenEvent]
  }
}

