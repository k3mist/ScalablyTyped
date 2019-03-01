package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsErrorBarCap extends js.Object {
  /** Color of the error bar cap.
    * @Default {â€œ#000000â€}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Length of the error bar cap.
    * @Default {1}
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** Show/Hides the error bar cap.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the error bar cap.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CommonSeriesOptionsErrorBarCap {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): CommonSeriesOptionsErrorBarCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsErrorBarCap]
  }
}

