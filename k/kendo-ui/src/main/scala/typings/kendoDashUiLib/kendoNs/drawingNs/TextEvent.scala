package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Text
  def isDefaultPrevented(): scala.Boolean
}

object TextEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Text): TextEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[TextEvent]
  }
}

