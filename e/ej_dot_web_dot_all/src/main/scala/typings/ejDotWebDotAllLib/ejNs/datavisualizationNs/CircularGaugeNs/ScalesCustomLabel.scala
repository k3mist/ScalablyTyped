package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabel extends js.Object {
  /** Color of the custom labels.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specify font for custom labels
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesCustomLabelsFont] = js.undefined
  /** Specify position of custom labels
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesCustomLabelsPosition] = js.undefined
  /** Specifies the position of the  custom labels. See
    * @Default {inner}
    */
  var positionType: js.UndefOr[CustomLabelPositionType | java.lang.String] = js.undefined
  /** Specify angle for the rotation of the custom labels in degrees.
    * @Default {0}
    */
  var textAngle: js.UndefOr[scala.Double] = js.undefined
  /** Value of the custom labels.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ScalesCustomLabel {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    font: ScalesCustomLabelsFont = null,
    position: ScalesCustomLabelsPosition = null,
    positionType: CustomLabelPositionType | java.lang.String = null,
    textAngle: scala.Int | scala.Double = null,
    value: java.lang.String = null
  ): ScalesCustomLabel = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (position != null) __obj.updateDynamic("position")(position)
    if (positionType != null) __obj.updateDynamic("positionType")(positionType.asInstanceOf[js.Any])
    if (textAngle != null) __obj.updateDynamic("textAngle")(textAngle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ScalesCustomLabel]
  }
}

