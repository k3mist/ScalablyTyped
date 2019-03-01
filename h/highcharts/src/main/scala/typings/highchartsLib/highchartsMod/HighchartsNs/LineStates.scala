package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStates extends js.Object {
  /**
    * Animation setting for hovering the graph in line-type series.
    * @default { "duration": 50 }
    * @since 5.0.8
    */
  var animation: js.UndefOr[scala.Boolean | Animation] = js.undefined
  /**
    * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the
    * legend.
    * @default true
    * @since 1.2
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice
    * in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The
    * halo can be disabled by setting the halo option to false.
    * @since 4.0
    */
  var halo: js.UndefOr[scala.Boolean | Halo] = js.undefined
  /**
    * Pixel with of the graph line.
    * @default 2
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The additional line width for the graph of a hovered series.
    * @default 1
    * @since 4.0.3
    */
  var lineWidthPlus: js.UndefOr[scala.Double] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
}

object LineStates {
  @scala.inline
  def apply(
    animation: scala.Boolean | Animation = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    halo: scala.Boolean | Halo = null,
    lineWidth: scala.Int | scala.Double = null,
    lineWidthPlus: scala.Int | scala.Double = null,
    marker: Marker = null
  ): LineStates = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (halo != null) __obj.updateDynamic("halo")(halo.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lineWidthPlus != null) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[LineStates]
  }
}

