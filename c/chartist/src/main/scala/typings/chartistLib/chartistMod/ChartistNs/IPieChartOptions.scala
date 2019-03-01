package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPieChartOptions extends IChartOptions {
  /**
    * Padding of the chart drawing area to the container element and labels as a number or padding object {top: 5, right: 5, bottom: 5, left: 5}
    */
  var chartPadding: js.UndefOr[IChartPadding | scala.Double] = js.undefined
  /**
    * Override the class names that are used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[IPieChartClasses] = js.undefined
  /**
    * If specified the donut CSS classes will be used and strokes will be drawn instead of pie slices.
    */
  var donut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If specified the donut segments will be drawn as shapes instead of strokes.
    */
  var donutSolid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the donut stroke width, currently done in javascript for convenience. May move to CSS styles in the future.
    * This option can be set as number or string to specify a relative width (i.e. 100 or '30%').
    */
  var donutWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * If true empty values will be ignored to avoid drawing unncessary slices and labels
    */
  var ignoreEmptyValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Label direction can be 'neutral', 'explode' or 'implode'.  Default is 'neutral'.  The labels anchor will be positioned based on those settings as well as the fact if the labels are on the right or left side of the center of the chart. Usually explode is useful when labels are positioned far away from the center.
    */
  var labelDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An interpolation function for the label value
    */
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  /**
    * Label position offset from the standard position which is half distance of the radius. This value can be either positive or negative. Positive values will position the label away from the center.
    */
  var labelOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * This option can be set to 'inside', 'outside' or 'center'. Positioned with 'inside' the labels will be placed on half the distance of the radius to the border of the Pie by respecting the 'labelOffset'. The 'outside' option will place the labels at the border of the pie and 'center' will place the labels in the absolute center point of the chart. The 'center' option only makes sense in conjunction with the 'labelOffset' option.
    */
  var labelPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify if a label should be shown or not
    */
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The start angle of the pie chart in degrees where 0 points north. A higher value offsets the start angle clockwise.
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional total you can specify. By specifying a total value, the sum of the values in the series must be this total in order to draw a full pie. You can use this parameter to draw only parts of a pie or gauge charts.
    */
  var total: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object IPieChartOptions {
  @scala.inline
  def apply(
    chartPadding: IChartPadding | scala.Double = null,
    classNames: IPieChartClasses = null,
    donut: js.UndefOr[scala.Boolean] = js.undefined,
    donutSolid: js.UndefOr[scala.Boolean] = js.undefined,
    donutWidth: scala.Double | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    ignoreEmptyValues: js.UndefOr[scala.Boolean] = js.undefined,
    labelDirection: java.lang.String = null,
    labelInterpolationFnc: js.Function = null,
    labelOffset: scala.Int | scala.Double = null,
    labelPosition: java.lang.String = null,
    plugins: js.Array[_] = null,
    reverseData: js.UndefOr[scala.Boolean] = js.undefined,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined,
    startAngle: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null
  ): IPieChartOptions = {
    val __obj = js.Dynamic.literal()
    if (chartPadding != null) __obj.updateDynamic("chartPadding")(chartPadding.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (!js.isUndefined(donut)) __obj.updateDynamic("donut")(donut)
    if (!js.isUndefined(donutSolid)) __obj.updateDynamic("donutSolid")(donutSolid)
    if (donutWidth != null) __obj.updateDynamic("donutWidth")(donutWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyValues)) __obj.updateDynamic("ignoreEmptyValues")(ignoreEmptyValues)
    if (labelDirection != null) __obj.updateDynamic("labelDirection")(labelDirection)
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc)
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(reverseData)) __obj.updateDynamic("reverseData")(reverseData)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPieChartOptions]
  }
}

