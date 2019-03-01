package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsHigherLevelBorder extends js.Object {
  /** Specifies the border color of grid lines.
    * @Default {transparent}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border width of grid lines.
    * @Default {0.5}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object LabelSettingsHigherLevelBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: java.lang.String = null): LabelSettingsHigherLevelBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[LabelSettingsHigherLevelBorder]
  }
}

