package typings
package kendoDashUiLib.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Workbook
  def isDefaultPrevented(): scala.Boolean
}

object WorkbookEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: Workbook): WorkbookEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[WorkbookEvent]
  }
}

