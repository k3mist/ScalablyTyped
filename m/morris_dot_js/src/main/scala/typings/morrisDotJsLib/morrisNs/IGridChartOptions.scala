package typings
package morrisDotJsLib.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridChartOptions extends IChartOptions {
  /** Set to false to disable drawing the x and y axes. */
  var axes: js.UndefOr[scala.Boolean] = js.undefined
  /** The data to plot. This is an array of objects, containing x and y attributes as described by the xkey and ykeys options. */
  var data: js.Array[_]
  /**  Set to false to disable drawing the horizontal grid lines. */
  var grid: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the line color of the grid. (default: #aaa) */
  var gridLineColor: js.UndefOr[java.lang.String] = js.undefined
  /** Set the stroke of the grid. (default: 0.5)*/
  var gridStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**  Set the color of the axis labels (default: #888). */
  var gridTextColor: js.UndefOr[java.lang.String] = js.undefined
  /** Set the font family of the axis labels (default: sans-serif). */
  var gridTextFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Set the point size of the axis labels (default: 12). */
  var gridTextSize: js.UndefOr[scala.Double] = js.undefined
  /** Set the font weight of the axis labels (default: normal). */
  var gridTextWeight: js.UndefOr[java.lang.String] = js.undefined
  /**  Set the visibility of the hover legend (see documentation). */
  var hideHover: js.UndefOr[scala.Boolean | AutoAlways] = js.undefined
  /** A list of strings containing labels for the data series to be plotted (corresponding to the values in the ykeys option). */
  var labels: js.Array[java.lang.String]
  /** A string containing the name of the attribute that contains X labels. */
  var xkey: java.lang.String
  /** A list of strings containing names of attributes that contain Y values (one for each series of data to be plotted). */
  var ykeys: js.Array[java.lang.String]
}

object IGridChartOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[java.lang.String],
    xkey: java.lang.String,
    ykeys: js.Array[java.lang.String],
    axes: js.UndefOr[scala.Boolean] = js.undefined,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    gridLineColor: java.lang.String = null,
    gridStrokeWidth: scala.Int | scala.Double = null,
    gridTextColor: java.lang.String = null,
    gridTextFamily: java.lang.String = null,
    gridTextSize: scala.Int | scala.Double = null,
    gridTextWeight: java.lang.String = null,
    hideHover: scala.Boolean | AutoAlways = null,
    resize: js.UndefOr[scala.Boolean] = js.undefined
  ): IGridChartOptions = {
    val __obj = js.Dynamic.literal(data = data, element = element, labels = labels, xkey = xkey, ykeys = ykeys)
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor)
    if (gridStrokeWidth != null) __obj.updateDynamic("gridStrokeWidth")(gridStrokeWidth.asInstanceOf[js.Any])
    if (gridTextColor != null) __obj.updateDynamic("gridTextColor")(gridTextColor)
    if (gridTextFamily != null) __obj.updateDynamic("gridTextFamily")(gridTextFamily)
    if (gridTextSize != null) __obj.updateDynamic("gridTextSize")(gridTextSize.asInstanceOf[js.Any])
    if (gridTextWeight != null) __obj.updateDynamic("gridTextWeight")(gridTextWeight)
    if (hideHover != null) __obj.updateDynamic("hideHover")(hideHover.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[IGridChartOptions]
  }
}

