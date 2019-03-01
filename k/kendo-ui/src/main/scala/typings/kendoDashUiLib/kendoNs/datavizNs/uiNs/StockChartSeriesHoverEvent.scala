package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesHoverEvent extends StockChartEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var percentage: js.UndefOr[js.Any] = js.undefined
  var series: js.UndefOr[StockChartSeriesHoverEventSeries] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object StockChartSeriesHoverEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: StockChart,
    category: js.Any = null,
    dataItem: js.Any = null,
    element: js.Any = null,
    percentage: js.Any = null,
    series: StockChartSeriesHoverEventSeries = null,
    value: js.Any = null
  ): StockChartSeriesHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (category != null) __obj.updateDynamic("category")(category)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (element != null) __obj.updateDynamic("element")(element)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage)
    if (series != null) __obj.updateDynamic("series")(series)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StockChartSeriesHoverEvent]
  }
}

