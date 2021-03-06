package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsCharacterSettings extends js.Object {
  /** Specifies the CharacterCount value for the DigitalGauge.
    * @Default {4}
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the opacity value for the DigitalGauge.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the value for spacing between the characters
    * @Default {2}
    */
  var spacing: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the character type for the text to be displayed.
    * @Default {ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix}
    */
  var `type`: js.UndefOr[CharacterType | java.lang.String] = js.undefined
}

object ItemsCharacterSettings {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    spacing: scala.Int | scala.Double = null,
    `type`: CharacterType | java.lang.String = null
  ): ItemsCharacterSettings = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsCharacterSettings]
  }
}

