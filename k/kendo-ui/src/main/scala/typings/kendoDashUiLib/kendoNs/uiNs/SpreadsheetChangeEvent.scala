package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetChangeEvent extends SpreadsheetEvent {
  var range: js.UndefOr[kendoDashUiLib.kendoNs.spreadsheetNs.Range] = js.undefined
}

object SpreadsheetChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    range: kendoDashUiLib.kendoNs.spreadsheetNs.Range = null
  ): SpreadsheetChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SpreadsheetChangeEvent]
  }
}

