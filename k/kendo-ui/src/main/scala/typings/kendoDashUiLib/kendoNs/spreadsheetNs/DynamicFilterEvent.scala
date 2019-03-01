package typings
package kendoDashUiLib.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: DynamicFilter
  def isDefaultPrevented(): scala.Boolean
}

object DynamicFilterEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: DynamicFilter
  ): DynamicFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[DynamicFilterEvent]
  }
}

