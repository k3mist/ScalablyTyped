package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsMajorGridLineStyle extends js.Object {
  /** Specifies the color of major grid lines in range navigator.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Toggles the visibility of major grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object NavigatorStyleSettingsMajorGridLineStyle {
  @scala.inline
  def apply(color: java.lang.String = null, visible: js.UndefOr[scala.Boolean] = js.undefined): NavigatorStyleSettingsMajorGridLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[NavigatorStyleSettingsMajorGridLineStyle]
  }
}

