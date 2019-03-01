package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsSubTitleFont extends js.Object {
  /** Specifies the color of the subtitle's text.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the fontFamily of subtitle. Subtitle text render with this fontFamily.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the fontStyle of subtitle. Subtitle text render with this fontStyle. See FontStyle
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | java.lang.String] = js.undefined
  /** Specifies the fontWeight of subtitle. Subtitle text render with this fontWeight. See FontWeight
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[FontWeight | java.lang.String] = js.undefined
  /** Specifies the opacity of subtitle. Subtitle text render with this opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the size of subtitle. Subtitle text render with this size.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object CaptionSettingsSubTitleFont {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontStyle: FontStyle | java.lang.String = null,
    fontWeight: FontWeight | java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null
  ): CaptionSettingsSubTitleFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[CaptionSettingsSubTitleFont]
  }
}

