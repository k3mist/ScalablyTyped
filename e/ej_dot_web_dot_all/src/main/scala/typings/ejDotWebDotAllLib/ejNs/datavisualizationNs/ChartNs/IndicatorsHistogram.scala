package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsHistogram extends js.Object {
  /** Options to customize the histogram border in MACD indicator.
    */
  var border: js.UndefOr[IndicatorsHistogramBorder] = js.undefined
  /** Color of histogram columns in MACD indicator.
    * @Default {#ccccff}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of histogram columns in MACD indicator.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object IndicatorsHistogram {
  @scala.inline
  def apply(
    border: IndicatorsHistogramBorder = null,
    fill: java.lang.String = null,
    opacity: scala.Int | scala.Double = null
  ): IndicatorsHistogram = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsHistogram]
  }
}

