package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsStyleFont extends js.Object {
  /** Specifies the label color. This color is applied to the labels in range navigator.
    * @Default {#333333}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label font family. Labels render with the specified font family.
    * @Default {Segoe UI}
    */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label font opacity. Labels render with the specified font opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the label font size. Labels render with the specified font size.
    * @Default {1px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label font style. Labels render with the specified font style..
    * @Default {Normal}
    */
  var style: js.UndefOr[FontStyle | java.lang.String] = js.undefined
  /** Specifies the label font weight
    * @Default {regular}
    */
  var weight: js.UndefOr[FontWeight | java.lang.String] = js.undefined
}

object LabelSettingsStyleFont {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    family: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null,
    style: FontStyle | java.lang.String = null,
    weight: FontWeight | java.lang.String = null
  ): LabelSettingsStyleFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (family != null) __obj.updateDynamic("family")(family)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettingsStyleFont]
  }
}

