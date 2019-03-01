package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramAddEvent extends DiagramEvent {
  var connection: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Connection] = js.undefined
  var shape: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape] = js.undefined
}

object DiagramAddEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    connection: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Connection = null,
    shape: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape = null
  ): DiagramAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[DiagramAddEvent]
  }
}

