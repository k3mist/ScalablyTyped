package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerLayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MarkerLayer
  def isDefaultPrevented(): scala.Boolean
}

object MarkerLayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: MarkerLayer): MarkerLayerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MarkerLayerEvent]
  }
}

