package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreeEvent extends js.Object {
  var preventDefault: js.Function
  var sender: DropDownTree
  def isDefaultPrevented(): scala.Boolean
}

object DropDownTreeEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: DropDownTree): DropDownTreeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[DropDownTreeEvent]
  }
}

