package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListEvent extends js.Object {
  var preventDefault: js.Function
  var sender: DropDownList
  def isDefaultPrevented(): scala.Boolean
}

object DropDownListEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: DropDownList): DropDownListEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[DropDownListEvent]
  }
}

