package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsMajorGridLines extends js.Object {
  /** Toggles the visibility of major grid lines.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ValueAxisSettingsMajorGridLines {
  @scala.inline
  def apply(visible: js.UndefOr[scala.Boolean] = js.undefined): ValueAxisSettingsMajorGridLines = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ValueAxisSettingsMajorGridLines]
  }
}

