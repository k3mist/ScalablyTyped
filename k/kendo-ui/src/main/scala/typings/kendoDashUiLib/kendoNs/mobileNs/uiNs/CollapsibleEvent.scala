package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Collapsible
  def isDefaultPrevented(): scala.Boolean
}

object CollapsibleEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: Collapsible): CollapsibleEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[CollapsibleEvent]
  }
}

