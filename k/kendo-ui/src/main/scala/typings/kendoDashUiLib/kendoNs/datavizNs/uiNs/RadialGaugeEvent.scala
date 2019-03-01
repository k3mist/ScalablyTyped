package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugeEvent extends js.Object {
  var preventDefault: js.Function
  var sender: RadialGauge
  def isDefaultPrevented(): scala.Boolean
}

object RadialGaugeEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: RadialGauge): RadialGaugeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[RadialGaugeEvent]
  }
}

