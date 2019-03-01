package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesMajorTickLines extends js.Object {
  /** Length of the major tick lines.
    * @Default {5}
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Show/hides the major tick lines.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the major tick lines.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AxesMajorTickLines {
  @scala.inline
  def apply(
    size: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): AxesMajorTickLines = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesMajorTickLines]
  }
}

