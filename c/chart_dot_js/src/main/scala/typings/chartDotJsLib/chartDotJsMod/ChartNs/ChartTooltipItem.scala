package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipItem extends js.Object {
  var datasetIndex: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var xLabel: js.UndefOr[java.lang.String] = js.undefined
  var yLabel: js.UndefOr[java.lang.String] = js.undefined
}

object ChartTooltipItem {
  @scala.inline
  def apply(
    datasetIndex: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    xLabel: java.lang.String = null,
    yLabel: java.lang.String = null
  ): ChartTooltipItem = {
    val __obj = js.Dynamic.literal()
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (xLabel != null) __obj.updateDynamic("xLabel")(xLabel)
    if (yLabel != null) __obj.updateDynamic("yLabel")(yLabel)
    __obj.asInstanceOf[ChartTooltipItem]
  }
}

