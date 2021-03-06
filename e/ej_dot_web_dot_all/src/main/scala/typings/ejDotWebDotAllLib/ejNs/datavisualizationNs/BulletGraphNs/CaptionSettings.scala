package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettings extends js.Object {
  /** Specifies whether trim the labels will be true or false.
    * @Default {true}
    */
  var enableTrim: js.UndefOr[scala.Boolean] = js.undefined
  /** Contains property to customize the font of caption.
    */
  var font: js.UndefOr[CaptionSettingsFont] = js.undefined
  /** Contains property to customize the indicator.
    */
  var indicator: js.UndefOr[CaptionSettingsIndicator] = js.undefined
  /** Contains property to customize the location.
    */
  var location: js.UndefOr[CaptionSettingsLocation] = js.undefined
  /** Specifies the padding to be applied when text position is used.
    * @Default {5}
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** Contains property to customize the subtitle.
    */
  var subTitle: js.UndefOr[CaptionSettingsSubTitle] = js.undefined
  /** Specifies the text to be displayed on bullet graph.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the alignment of caption text with respect to scale. This property will not be applied when text position is float.
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | java.lang.String] = js.undefined
  /** Specifies caption text anchoring when caption text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same position.
    * Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | java.lang.String] = js.undefined
  /** Specifies the angel in which the caption is rendered.
    * @Default {0}
    */
  var textAngle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies how caption text should be placed.
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | java.lang.String] = js.undefined
}

object CaptionSettings {
  @scala.inline
  def apply(
    enableTrim: js.UndefOr[scala.Boolean] = js.undefined,
    font: CaptionSettingsFont = null,
    indicator: CaptionSettingsIndicator = null,
    location: CaptionSettingsLocation = null,
    padding: scala.Int | scala.Double = null,
    subTitle: CaptionSettingsSubTitle = null,
    text: java.lang.String = null,
    textAlignment: TextAlignment | java.lang.String = null,
    textAnchor: TextAnchor | java.lang.String = null,
    textAngle: scala.Int | scala.Double = null,
    textPosition: TextPosition | java.lang.String = null
  ): CaptionSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableTrim)) __obj.updateDynamic("enableTrim")(enableTrim)
    if (font != null) __obj.updateDynamic("font")(font)
    if (indicator != null) __obj.updateDynamic("indicator")(indicator)
    if (location != null) __obj.updateDynamic("location")(location)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textAngle != null) __obj.updateDynamic("textAngle")(textAngle.asInstanceOf[js.Any])
    if (textPosition != null) __obj.updateDynamic("textPosition")(textPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettings]
  }
}

