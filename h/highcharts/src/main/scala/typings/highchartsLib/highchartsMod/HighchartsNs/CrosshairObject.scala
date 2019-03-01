package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairObject extends js.Object {
  /**
    * A class name for the crosshair, especially as a hook for styling.
    * @since 5.0.0
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color of the crosshair. Defaults to #cccccc for numeric and datetime axes, and rgba(204,214,235,0.25) for category axes,
    * where the crosshair by default highlights the whole category.
    * @since 4.1
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The dash style for the crosshair. See series.dashStyle for possible values. Defaults to Solid.
    * @since 4.1
    */
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pixel width of the crosshair. Defaults to 1 for numeric or datetime axes, and for one category width for category axes.
    * @since 4.1
    */
  var width: js.UndefOr[scala.Double] = js.undefined
   // Solid ShortDash ShortDot ShortDashDot ShortDashDotDot Dot Dash LongDash DashDot LongDashDot LongDashDotDot
  /**
    * The Z index of the crosshair. Higher Z indices allow drawing the crosshair on top of the series or behind the grid lines.
    * @since 4.1
    * @default 2
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object CrosshairObject {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    dashStyle: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): CrosshairObject = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairObject]
  }
}

