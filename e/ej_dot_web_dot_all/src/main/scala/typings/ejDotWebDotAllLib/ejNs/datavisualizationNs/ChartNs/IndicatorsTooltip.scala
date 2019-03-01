package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsTooltip extends js.Object {
  /** Option to customize the border of indicator tooltip.
    */
  var border: js.UndefOr[IndicatorsTooltipBorder] = js.undefined
  /** Specifies the animation duration of indicator tooltip.
    * @Default {500ms}
    */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /** Enables/disables the tooltip animation.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Background color of indicator tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Format of indicator tooltip. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of indicator tooltip.
    * @Default {0.95}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Controls the visibility of indicator tooltip.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object IndicatorsTooltip {
  @scala.inline
  def apply(
    border: IndicatorsTooltipBorder = null,
    duration: java.lang.String = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    format: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): IndicatorsTooltip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (format != null) __obj.updateDynamic("format")(format)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IndicatorsTooltip]
  }
}

