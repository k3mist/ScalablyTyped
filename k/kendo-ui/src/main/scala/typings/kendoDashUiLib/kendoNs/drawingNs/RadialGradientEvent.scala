package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientEvent extends js.Object {
  var preventDefault: js.Function
  var sender: RadialGradient
  def isDefaultPrevented(): scala.Boolean
}

object RadialGradientEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: RadialGradient
  ): RadialGradientEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[RadialGradientEvent]
  }
}

