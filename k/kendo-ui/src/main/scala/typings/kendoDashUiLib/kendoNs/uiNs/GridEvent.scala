package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Grid
  def isDefaultPrevented(): scala.Boolean
}

object GridEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: Grid): GridEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[GridEvent]
  }
}

