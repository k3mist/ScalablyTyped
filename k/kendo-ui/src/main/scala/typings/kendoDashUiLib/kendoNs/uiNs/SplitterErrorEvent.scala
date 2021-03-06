package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterErrorEvent extends SplitterEvent {
  var status: js.UndefOr[java.lang.String] = js.undefined
  var xhr: js.UndefOr[kendoDashUiLib.JQueryXHR] = js.undefined
}

object SplitterErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Splitter,
    status: java.lang.String = null,
    xhr: kendoDashUiLib.JQueryXHR = null
  ): SplitterErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (status != null) __obj.updateDynamic("status")(status)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[SplitterErrorEvent]
  }
}

