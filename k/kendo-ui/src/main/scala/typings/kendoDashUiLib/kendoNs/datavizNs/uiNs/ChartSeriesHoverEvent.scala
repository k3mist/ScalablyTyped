package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesHoverEvent extends ChartEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var categoryPoints: js.UndefOr[js.Any] = js.undefined
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var percentage: js.UndefOr[js.Any] = js.undefined
  var series: js.UndefOr[ChartSeriesHoverEventSeries] = js.undefined
  var stackValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartSeriesHoverEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Chart,
    category: js.Any = null,
    categoryPoints: js.Any = null,
    dataItem: js.Any = null,
    element: js.Any = null,
    originalEvent: js.Any = null,
    percentage: js.Any = null,
    series: ChartSeriesHoverEventSeries = null,
    stackValue: js.Any = null,
    value: js.Any = null
  ): ChartSeriesHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (category != null) __obj.updateDynamic("category")(category)
    if (categoryPoints != null) __obj.updateDynamic("categoryPoints")(categoryPoints)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (element != null) __obj.updateDynamic("element")(element)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage)
    if (series != null) __obj.updateDynamic("series")(series)
    if (stackValue != null) __obj.updateDynamic("stackValue")(stackValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartSeriesHoverEvent]
  }
}

