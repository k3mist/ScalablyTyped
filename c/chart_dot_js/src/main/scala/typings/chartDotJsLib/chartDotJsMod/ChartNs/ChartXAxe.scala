package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartXAxe extends CommonAxe {
  var barPercentage: js.UndefOr[scala.Double] = js.undefined
  var categoryPercentage: js.UndefOr[scala.Double] = js.undefined
  var distribution: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.linear | chartDotJsLib.chartDotJsLibStrings.series
  ] = js.undefined
}

object ChartXAxe {
  @scala.inline
  def apply(
    afterBuildTicks: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    afterCalculateTickRotation: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    afterDataLimits: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    afterFit: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    afterSetDimension: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    afterTickToLabelConversion: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    afterUpdate: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    barPercentage: scala.Int | scala.Double = null,
    barThickness: scala.Double | chartDotJsLib.chartDotJsLibStrings.flex = null,
    beforeBuildTicks: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeCalculateTickRotation: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeDataLimits: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeFit: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeSetDimension: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeTickToLabelConversion: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeUpdate: /* scale */ js.UndefOr[js.Any] => scala.Unit = null,
    bounds: java.lang.String = null,
    categoryPercentage: scala.Int | scala.Double = null,
    display: js.UndefOr[scala.Boolean] = js.undefined,
    distribution: chartDotJsLib.chartDotJsLibStrings.linear | chartDotJsLib.chartDotJsLibStrings.series = null,
    gridLines: GridLineOptions = null,
    id: java.lang.String = null,
    maxBarThickness: scala.Int | scala.Double = null,
    offset: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    scaleLabel: ScaleTitleOptions = null,
    stacked: js.UndefOr[scala.Boolean] = js.undefined,
    ticks: TickOptions = null,
    time: TimeScale = null,
    `type`: ScaleType | java.lang.String = null
  ): ChartXAxe = {
    val __obj = js.Dynamic.literal()
    if (afterBuildTicks != null) __obj.updateDynamic("afterBuildTicks")(js.Any.fromFunction1(afterBuildTicks))
    if (afterCalculateTickRotation != null) __obj.updateDynamic("afterCalculateTickRotation")(js.Any.fromFunction1(afterCalculateTickRotation))
    if (afterDataLimits != null) __obj.updateDynamic("afterDataLimits")(js.Any.fromFunction1(afterDataLimits))
    if (afterFit != null) __obj.updateDynamic("afterFit")(js.Any.fromFunction1(afterFit))
    if (afterSetDimension != null) __obj.updateDynamic("afterSetDimension")(js.Any.fromFunction1(afterSetDimension))
    if (afterTickToLabelConversion != null) __obj.updateDynamic("afterTickToLabelConversion")(js.Any.fromFunction1(afterTickToLabelConversion))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction1(afterUpdate))
    if (barPercentage != null) __obj.updateDynamic("barPercentage")(barPercentage.asInstanceOf[js.Any])
    if (barThickness != null) __obj.updateDynamic("barThickness")(barThickness.asInstanceOf[js.Any])
    if (beforeBuildTicks != null) __obj.updateDynamic("beforeBuildTicks")(js.Any.fromFunction1(beforeBuildTicks))
    if (beforeCalculateTickRotation != null) __obj.updateDynamic("beforeCalculateTickRotation")(js.Any.fromFunction1(beforeCalculateTickRotation))
    if (beforeDataLimits != null) __obj.updateDynamic("beforeDataLimits")(js.Any.fromFunction1(beforeDataLimits))
    if (beforeFit != null) __obj.updateDynamic("beforeFit")(js.Any.fromFunction1(beforeFit))
    if (beforeSetDimension != null) __obj.updateDynamic("beforeSetDimension")(js.Any.fromFunction1(beforeSetDimension))
    if (beforeTickToLabelConversion != null) __obj.updateDynamic("beforeTickToLabelConversion")(js.Any.fromFunction1(beforeTickToLabelConversion))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction1(beforeUpdate))
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (categoryPercentage != null) __obj.updateDynamic("categoryPercentage")(categoryPercentage.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxBarThickness != null) __obj.updateDynamic("maxBarThickness")(maxBarThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scaleLabel != null) __obj.updateDynamic("scaleLabel")(scaleLabel)
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (time != null) __obj.updateDynamic("time")(time)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartXAxe]
  }
}

