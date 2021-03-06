package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericTextBoxEvent extends js.Object {
  var preventDefault: js.Function
  var sender: NumericTextBox
  def isDefaultPrevented(): scala.Boolean
}

object NumericTextBoxEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: NumericTextBox): NumericTextBoxEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[NumericTextBoxEvent]
  }
}

