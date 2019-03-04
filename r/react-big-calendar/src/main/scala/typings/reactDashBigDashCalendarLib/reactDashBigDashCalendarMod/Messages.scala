package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages extends js.Object {
  var agenda: js.UndefOr[java.lang.String] = js.undefined
  var allDay: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[java.lang.String] = js.undefined
  var day: js.UndefOr[java.lang.String] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[java.lang.String] = js.undefined
  var previous: js.UndefOr[java.lang.String] = js.undefined
  var showMore: js.UndefOr[js.Function1[/* count */ scala.Double, java.lang.String]] = js.undefined
  var time: js.UndefOr[java.lang.String] = js.undefined
  var today: js.UndefOr[java.lang.String] = js.undefined
  var tomorrow: js.UndefOr[java.lang.String] = js.undefined
  var week: js.UndefOr[java.lang.String] = js.undefined
  var work_week: js.UndefOr[java.lang.String] = js.undefined
  var yesterday: js.UndefOr[java.lang.String] = js.undefined
}

object Messages {
  @scala.inline
  def apply(
    agenda: java.lang.String = null,
    allDay: java.lang.String = null,
    date: java.lang.String = null,
    day: java.lang.String = null,
    event: java.lang.String = null,
    month: java.lang.String = null,
    next: java.lang.String = null,
    previous: java.lang.String = null,
    showMore: /* count */ scala.Double => java.lang.String = null,
    time: java.lang.String = null,
    today: java.lang.String = null,
    tomorrow: java.lang.String = null,
    week: java.lang.String = null,
    work_week: java.lang.String = null,
    yesterday: java.lang.String = null
  ): Messages = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda)
    if (allDay != null) __obj.updateDynamic("allDay")(allDay)
    if (date != null) __obj.updateDynamic("date")(date)
    if (day != null) __obj.updateDynamic("day")(day)
    if (event != null) __obj.updateDynamic("event")(event)
    if (month != null) __obj.updateDynamic("month")(month)
    if (next != null) __obj.updateDynamic("next")(next)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (showMore != null) __obj.updateDynamic("showMore")(js.Any.fromFunction1(showMore))
    if (time != null) __obj.updateDynamic("time")(time)
    if (today != null) __obj.updateDynamic("today")(today)
    if (tomorrow != null) __obj.updateDynamic("tomorrow")(tomorrow)
    if (week != null) __obj.updateDynamic("week")(week)
    if (work_week != null) __obj.updateDynamic("work_week")(work_week)
    if (yesterday != null) __obj.updateDynamic("yesterday")(yesterday)
    __obj.asInstanceOf[Messages]
  }
}

