package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ProgressBar
  def isDefaultPrevented(): scala.Boolean
}

object ProgressBarEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: ProgressBar): ProgressBarEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ProgressBarEvent]
  }
}

