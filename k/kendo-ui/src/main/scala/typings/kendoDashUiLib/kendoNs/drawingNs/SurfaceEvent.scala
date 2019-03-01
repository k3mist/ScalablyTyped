package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Surface
  def isDefaultPrevented(): scala.Boolean
}

object SurfaceEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Surface): SurfaceEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[SurfaceEvent]
  }
}

