package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Map
  def isDefaultPrevented(): scala.Boolean
}

object MapEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: Map): MapEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MapEvent]
  }
}

