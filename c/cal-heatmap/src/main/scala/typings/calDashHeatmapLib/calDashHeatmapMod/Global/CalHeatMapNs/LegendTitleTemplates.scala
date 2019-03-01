package typings
package calDashHeatmapLib.calDashHeatmapMod.Global.CalHeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendTitleTemplates extends js.Object {
  /** Formatting of all the value but the first and the last. Default value: "between {down} and {up} {name}" */
  var inner: js.UndefOr[java.lang.String] = js.undefined
  /** Formatting of the smallest (leftmost) value of the legend. Default value: "less than {min} {name}" */
  var lower: js.UndefOr[java.lang.String] = js.undefined
  /** Formatting of the biggest (rightmost) value of the legend. Default value: "more than {max} {name}" */
  var upper: js.UndefOr[java.lang.String] = js.undefined
}

object LegendTitleTemplates {
  @scala.inline
  def apply(inner: java.lang.String = null, lower: java.lang.String = null, upper: java.lang.String = null): LegendTitleTemplates = {
    val __obj = js.Dynamic.literal()
    if (inner != null) __obj.updateDynamic("inner")(inner)
    if (lower != null) __obj.updateDynamic("lower")(lower)
    if (upper != null) __obj.updateDynamic("upper")(upper)
    __obj.asInstanceOf[LegendTitleTemplates]
  }
}

