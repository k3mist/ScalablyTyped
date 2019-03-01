package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPlotAreaHoverEvent extends ChartEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var x: js.UndefOr[js.Any] = js.undefined
  var y: js.UndefOr[js.Any] = js.undefined
}

object ChartPlotAreaHoverEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Chart,
    category: js.Any = null,
    element: js.Any = null,
    originalEvent: js.Any = null,
    value: js.Any = null,
    x: js.Any = null,
    y: js.Any = null
  ): ChartPlotAreaHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (category != null) __obj.updateDynamic("category")(category)
    if (element != null) __obj.updateDynamic("element")(element)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (value != null) __obj.updateDynamic("value")(value)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ChartPlotAreaHoverEvent]
  }
}

