package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of lines stretching across the plot area, marking a specific value
  * on one of the axes.
  */
trait PlotLines extends js.Object {
  /**
    * A custom class name, in addition to the default highcharts-plot-line, to apply to each individual line.
    * @since 5.0.0
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color of the line.
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The dashing or dot style for the plot line. For possible values see
    * {@link http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/|this overview}.
    * (Solid ShortDash ShortDot ShortDashDot ShortDashDotDot Dot Dash LongDash DashDot LongDashDot LongDashDotDot)
    * @default 'Solid'
    * @since 1.2
    */
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object defining mouse events for the plot line. Supported properties are click, mouseover, mouseout,
    * mousemove.
    * The this keyword refers to the PlotLineOrBand object.
    * @since 1.2
    */
  var events: js.UndefOr[MousePlotEvents] = js.undefined
  /**
    * An id used for identifying the plot line in Axis.removePlotLine.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text labels for the plot lines
    */
  var label: js.UndefOr[PlotLabel] = js.undefined
  /**
    * The position of the line in axis units.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width or thickness of the plot line.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The z index of the plot line within the chart.
    * @since 1.2
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object PlotLines {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    dashStyle: java.lang.String = null,
    events: MousePlotEvents = null,
    id: java.lang.String = null,
    label: PlotLabel = null,
    value: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): PlotLines = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLines]
  }
}

