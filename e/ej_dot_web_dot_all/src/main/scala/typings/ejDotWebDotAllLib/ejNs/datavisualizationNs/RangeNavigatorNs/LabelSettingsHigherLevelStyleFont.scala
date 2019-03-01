package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsHigherLevelStyleFont extends js.Object {
  /** Specifies the label font color. Labels render with the specified font color.
    * @Default {black}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label font family. Labels render with the specified font family.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label font style. Labels render with the specified font style.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label font weight. Labels render with the specified font weight.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label opacity. Labels render with the specified opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the label font size. Labels render with the specified font size.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object LabelSettingsHigherLevelStyleFont {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null
  ): LabelSettingsHigherLevelStyleFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[LabelSettingsHigherLevelStyleFont]
  }
}

