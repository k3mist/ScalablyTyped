package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceTooltipCloseEvent extends SurfaceEvent {
  var element: js.UndefOr[Element] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object SurfaceTooltipCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Surface,
    element: Element = null,
    target: Element = null
  ): SurfaceTooltipCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[SurfaceTooltipCloseEvent]
  }
}

