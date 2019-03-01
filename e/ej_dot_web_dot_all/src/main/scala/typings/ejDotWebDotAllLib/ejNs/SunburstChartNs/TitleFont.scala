package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleFont extends js.Object {
  /** Font family for Sunburst title.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Font style for Sunburst title.
    * @Default {Normal. See FontStyle}
    */
  var fontStyle: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontStyle | java.lang.String
  ] = js.undefined
  /** Font weight for Sunburst title.
    * @Default {Regular. See FontWeight}
    */
  var fontWeight: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontWeight | java.lang.String
  ] = js.undefined
  /** Opacity of the Sunburst title.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Font size for Sunburst title.
    * @Default {20px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object TitleFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontStyle: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontStyle | java.lang.String = null,
    fontWeight: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontWeight | java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null
  ): TitleFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[TitleFont]
  }
}

