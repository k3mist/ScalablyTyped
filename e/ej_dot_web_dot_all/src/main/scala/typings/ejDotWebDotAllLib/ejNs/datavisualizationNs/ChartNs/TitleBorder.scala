package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleBorder extends js.Object {
  /** color of the title border.
    * @Default {transparent}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** opacity of the title border.
    * @Default {0.8}
    */
  var cornerRadius: js.UndefOr[scala.Double] = js.undefined
  /** opacity of the title border.
    * @Default {0.8}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Width of the title border.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TitleBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    cornerRadius: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): TitleBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleBorder]
  }
}

