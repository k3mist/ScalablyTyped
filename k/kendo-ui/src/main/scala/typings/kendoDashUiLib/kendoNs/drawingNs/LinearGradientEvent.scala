package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientEvent extends js.Object {
  var preventDefault: js.Function
  var sender: LinearGradient
  def isDefaultPrevented(): scala.Boolean
}

object LinearGradientEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: LinearGradient
  ): LinearGradientEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[LinearGradientEvent]
  }
}

