package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicatorSymbol extends js.Object {
  /** Contains property to customize the border of indicator symbol.
    */
  var border: js.UndefOr[CaptionSettingsIndicatorSymbolBorder] = js.undefined
  /** Specifies the color of indicator symbol.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the URL of image that represents indicator symbol.
    */
  var imageURL: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the opacity of indicator symbol.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the shape of indicator symbol.
    */
  var shape: js.UndefOr[java.lang.String] = js.undefined
  /** Contains property to customize the size of indicator symbol.
    */
  var size: js.UndefOr[CaptionSettingsIndicatorSymbolSize] = js.undefined
}

object CaptionSettingsIndicatorSymbol {
  @scala.inline
  def apply(
    border: CaptionSettingsIndicatorSymbolBorder = null,
    color: java.lang.String = null,
    imageURL: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    shape: java.lang.String = null,
    size: CaptionSettingsIndicatorSymbolSize = null
  ): CaptionSettingsIndicatorSymbol = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (imageURL != null) __obj.updateDynamic("imageURL")(imageURL)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbol]
  }
}

