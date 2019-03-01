package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the chart axes.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxesLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisLoadOptions] = js.undefined
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisLoadOptions] = js.undefined
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisLoadOptions] = js.undefined
}

object ChartAxesLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    categoryAxis: ChartAxisLoadOptions = null,
    seriesAxis: ChartAxisLoadOptions = null,
    valueAxis: ChartAxisLoadOptions = null
  ): ChartAxesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis)
    if (seriesAxis != null) __obj.updateDynamic("seriesAxis")(seriesAxis)
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis)
    __obj.asInstanceOf[ChartAxesLoadOptions]
  }
}

