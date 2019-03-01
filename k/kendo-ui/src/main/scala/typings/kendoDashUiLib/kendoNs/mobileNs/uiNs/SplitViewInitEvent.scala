package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitViewInitEvent extends SplitViewEvent {
  var view: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object SplitViewInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: SplitView,
    view: kendoDashUiLib.JQuery = null
  ): SplitViewInitEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SplitViewInitEvent]
  }
}

