package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteEvent extends js.Object {
  var preventDefault: js.Function
  var sender: AutoComplete
  def isDefaultPrevented(): scala.Boolean
}

object AutoCompleteEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: AutoComplete): AutoCompleteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[AutoCompleteEvent]
  }
}

