package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeEvent extends js.Object {
  var preventDefault: js.Function
  var sender: LinearGauge
  def isDefaultPrevented(): scala.Boolean
}

object LinearGaugeEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: LinearGauge): LinearGaugeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[LinearGaugeEvent]
  }
}

