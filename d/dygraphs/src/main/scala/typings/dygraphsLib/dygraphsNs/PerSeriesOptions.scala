package typings
package dygraphsLib.dygraphsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerSeriesOptions extends js.Object {
  /**
    * Set to either 'y1' or 'y2' to assign a series to a y-axis (primary or secondary). Must be
    * set per-series.
    */
  var axis: js.UndefOr[dygraphsLib.dygraphsLibStrings.y1 | dygraphsLib.dygraphsLibStrings.y2] = js.undefined
  /**
    * A per-series color definition. Used in conjunction with, and overrides, the colors option.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Draw a small dot at each point, in addition to a line going through the point. This makes
    * the individual data points easier to see, but can increase visual clutter in the chart.
    * The small dot can be replaced with a custom rendering by supplying a <a
    * href='#drawPointCallback'>drawPointCallback</a>.
    */
  var drawPoints: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Error bars (or custom bars) for each series are drawn in the same color as the series, but
    * with partial transparency. This sets the transparency. A value of 0.0 means that the error
    * bars will not be drawn, whereas a value of 1.0 means that the error bars will be as dark
    * as the line for the series itself. This can be used to produce chart lines whose thickness
    * varies at each point.
    */
  var fillAlpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should the area underneath the graph be filled? This option is not compatible with error
    * bars. This may be set on a <a href='per-axis.html'>per-series</a> basis.
    */
  var fillGraph: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The size in pixels of the dot drawn over highlighted points.
    */
  var highlightCircleSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function which plot data for this series on the chart.         
    */
  var plotter: js.UndefOr[js.Any] = js.undefined
  /**
    * The size of the dot to draw on each point in pixels (see drawPoints). A dot is always
    * drawn when a point is "isolated", i.e. there is a missing point on either side of it. This
    * also controls the size of those dots.
    */
  var pointSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Mark this series for inclusion in the range selector. The mini plot curve will be an
    * average of all such series. If this is not specified for any series, the default behavior
    * is to average all the series. Setting it for one series will result in that series being
    * charted alone in the range selector.
    */
  var showInRangeSelector: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set, display the graph as a step plot instead of a line plot. This option may either
    * be set for the whole graph or for single series.
    */
  var stepPlot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Color for the line border used if strokeBorderWidth is set.
    */
  var strokeBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Draw a border around graph lines to make crossing lines more easily distinguishable.
    * Useful for graphs with many lines.
    */
  var strokeBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * A custom pattern array where the even index is a draw and odd is a space in pixels. If
    * null then it draws a solid line. The array should have a even length as any odd lengthed
    * array could be expressed as a smaller even length array. This is used to create dashed
    * lines.
    */
  var strokePattern: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The width of the lines connecting data points. This can be used to increase the contrast
    * or some graphs.
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

object PerSeriesOptions {
  @scala.inline
  def apply(
    axis: dygraphsLib.dygraphsLibStrings.y1 | dygraphsLib.dygraphsLibStrings.y2 = null,
    color: java.lang.String = null,
    drawPoints: js.UndefOr[scala.Boolean] = js.undefined,
    fillAlpha: scala.Int | scala.Double = null,
    fillGraph: js.UndefOr[scala.Boolean] = js.undefined,
    highlightCircleSize: scala.Int | scala.Double = null,
    plotter: js.Any = null,
    pointSize: scala.Int | scala.Double = null,
    showInRangeSelector: js.UndefOr[scala.Boolean] = js.undefined,
    stepPlot: js.UndefOr[scala.Boolean] = js.undefined,
    strokeBorderColor: java.lang.String = null,
    strokeBorderWidth: scala.Int | scala.Double = null,
    strokePattern: js.Array[scala.Double] = null,
    strokeWidth: scala.Int | scala.Double = null
  ): PerSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(drawPoints)) __obj.updateDynamic("drawPoints")(drawPoints)
    if (fillAlpha != null) __obj.updateDynamic("fillAlpha")(fillAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(fillGraph)) __obj.updateDynamic("fillGraph")(fillGraph)
    if (highlightCircleSize != null) __obj.updateDynamic("highlightCircleSize")(highlightCircleSize.asInstanceOf[js.Any])
    if (plotter != null) __obj.updateDynamic("plotter")(plotter)
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showInRangeSelector)) __obj.updateDynamic("showInRangeSelector")(showInRangeSelector)
    if (!js.isUndefined(stepPlot)) __obj.updateDynamic("stepPlot")(stepPlot)
    if (strokeBorderColor != null) __obj.updateDynamic("strokeBorderColor")(strokeBorderColor)
    if (strokeBorderWidth != null) __obj.updateDynamic("strokeBorderWidth")(strokeBorderWidth.asInstanceOf[js.Any])
    if (strokePattern != null) __obj.updateDynamic("strokePattern")(strokePattern)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerSeriesOptions]
  }
}

