package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPdfExportEvent extends EditorEvent {
  var promise: js.UndefOr[kendoDashUiLib.JQueryPromise[_]] = js.undefined
}

object EditorPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Editor,
    promise: kendoDashUiLib.JQueryPromise[_] = null
  ): EditorPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[EditorPdfExportEvent]
  }
}

