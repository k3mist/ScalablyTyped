package typings
package kendoDashUiLib.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Sheet
  def isDefaultPrevented(): scala.Boolean
}

object SheetEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Sheet): SheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[SheetEvent]
  }
}

