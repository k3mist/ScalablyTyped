package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarBorderColorBarBorderWidth extends js.Object {
  /**
    * The bodrder color of bar.
    *
    *
    * @default
    * '#000'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle.barBorderColor
    */
  var barBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The bodrder width of bar.
    * defaults to have no border.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle.barBorderWidth
    */
  var barBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Bar color..
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.radar.data.emphasis.itemStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BarBorderColorBarBorderWidth {
  @scala.inline
  def apply(
    barBorderColor: java.lang.String = null,
    barBorderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null
  ): Anon_BarBorderColorBarBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (barBorderColor != null) __obj.updateDynamic("barBorderColor")(barBorderColor)
    if (barBorderWidth != null) __obj.updateDynamic("barBorderWidth")(barBorderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BarBorderColorBarBorderWidth]
  }
}

