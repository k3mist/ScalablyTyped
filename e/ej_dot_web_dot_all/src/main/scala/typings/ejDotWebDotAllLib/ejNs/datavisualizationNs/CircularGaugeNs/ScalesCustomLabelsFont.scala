package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabelsFont extends js.Object {
  /** Specify font fontFamily for custom labels.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Specify font Style for custom labels.
    * @Default {Bold}
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Specify font size for custom labels.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object ScalesCustomLabelsFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontStyle: java.lang.String = null,
    size: java.lang.String = null
  ): ScalesCustomLabelsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ScalesCustomLabelsFont]
  }
}

