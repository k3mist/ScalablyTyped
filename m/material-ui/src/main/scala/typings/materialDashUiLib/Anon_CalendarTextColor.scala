package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CalendarTextColor extends js.Object {
  var calendarTextColor: js.UndefOr[java.lang.String] = js.undefined
  var calendarYearBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var headerColor: js.UndefOr[java.lang.String] = js.undefined
  var selectColor: js.UndefOr[java.lang.String] = js.undefined
  var selectTextColor: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CalendarTextColor {
  @scala.inline
  def apply(
    calendarTextColor: java.lang.String = null,
    calendarYearBackgroundColor: java.lang.String = null,
    color: java.lang.String = null,
    headerColor: java.lang.String = null,
    selectColor: java.lang.String = null,
    selectTextColor: java.lang.String = null,
    textColor: java.lang.String = null
  ): Anon_CalendarTextColor = {
    val __obj = js.Dynamic.literal()
    if (calendarTextColor != null) __obj.updateDynamic("calendarTextColor")(calendarTextColor)
    if (calendarYearBackgroundColor != null) __obj.updateDynamic("calendarYearBackgroundColor")(calendarYearBackgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor)
    if (selectColor != null) __obj.updateDynamic("selectColor")(selectColor)
    if (selectTextColor != null) __obj.updateDynamic("selectTextColor")(selectTextColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_CalendarTextColor]
  }
}

