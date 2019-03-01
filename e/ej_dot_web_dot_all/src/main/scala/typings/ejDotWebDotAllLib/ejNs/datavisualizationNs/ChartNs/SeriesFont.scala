package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesFont extends js.Object {
  /** Font color of the series text.
    * @Default {#707070}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Font Family of the series.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Font Style of the series.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | java.lang.String] = js.undefined
  /** Font weight of the series.
    * @Default {Regular}
    */
  var fontWeight: js.UndefOr[FontWeight | java.lang.String] = js.undefined
  /** Opacity of series text.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Size of the series text.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object SeriesFont {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontStyle: FontStyle | java.lang.String = null,
    fontWeight: FontWeight | java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null
  ): SeriesFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SeriesFont]
  }
}

