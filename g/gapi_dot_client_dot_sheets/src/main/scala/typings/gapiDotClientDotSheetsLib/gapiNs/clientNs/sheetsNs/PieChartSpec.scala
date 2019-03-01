package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartSpec extends js.Object {
  /** The data that covers the domain of the pie chart. */
  var domain: js.UndefOr[ChartData] = js.undefined
  /** Where the legend of the pie chart should be drawn. */
  var legendPosition: js.UndefOr[java.lang.String] = js.undefined
  /** The size of the hole in the pie chart. */
  var pieHole: js.UndefOr[scala.Double] = js.undefined
  /** The data that covers the one and only series of the pie chart. */
  var series: js.UndefOr[ChartData] = js.undefined
  /** True if the pie is three dimensional. */
  var threeDimensional: js.UndefOr[scala.Boolean] = js.undefined
}

object PieChartSpec {
  @scala.inline
  def apply(
    domain: ChartData = null,
    legendPosition: java.lang.String = null,
    pieHole: scala.Int | scala.Double = null,
    series: ChartData = null,
    threeDimensional: js.UndefOr[scala.Boolean] = js.undefined
  ): PieChartSpec = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition)
    if (pieHole != null) __obj.updateDynamic("pieHole")(pieHole.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series)
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional)
    __obj.asInstanceOf[PieChartSpec]
  }
}

