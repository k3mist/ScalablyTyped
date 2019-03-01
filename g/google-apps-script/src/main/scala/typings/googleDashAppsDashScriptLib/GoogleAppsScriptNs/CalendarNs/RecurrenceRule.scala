package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceRule extends js.Object {
  def addDailyExclusion(): RecurrenceRule
  def addDailyRule(): RecurrenceRule
  def addDate(date: stdLib.Date): EventRecurrence
  def addDateExclusion(date: stdLib.Date): EventRecurrence
  def addMonthlyExclusion(): RecurrenceRule
  def addMonthlyRule(): RecurrenceRule
  def addWeeklyExclusion(): RecurrenceRule
  def addWeeklyRule(): RecurrenceRule
  def addYearlyExclusion(): RecurrenceRule
  def addYearlyRule(): RecurrenceRule
  def interval(interval: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def onlyInMonth(month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month): RecurrenceRule
  def onlyInMonths(months: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month]): RecurrenceRule
  def onlyOnMonthDay(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def onlyOnMonthDays(days: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]): RecurrenceRule
  def onlyOnWeek(week: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def onlyOnWeekday(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday): RecurrenceRule
  def onlyOnWeekdays(days: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday]): RecurrenceRule
  def onlyOnWeeks(weeks: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]): RecurrenceRule
  def onlyOnYearDay(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def onlyOnYearDays(days: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]): RecurrenceRule
  def setTimeZone(timeZone: java.lang.String): EventRecurrence
  def times(times: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def until(endDate: stdLib.Date): RecurrenceRule
  def weekStartsOn(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday): RecurrenceRule
}

object RecurrenceRule {
  @scala.inline
  def apply(
    addDailyExclusion: js.Function0[RecurrenceRule],
    addDailyRule: js.Function0[RecurrenceRule],
    addDate: js.Function1[stdLib.Date, EventRecurrence],
    addDateExclusion: js.Function1[stdLib.Date, EventRecurrence],
    addMonthlyExclusion: js.Function0[RecurrenceRule],
    addMonthlyRule: js.Function0[RecurrenceRule],
    addWeeklyExclusion: js.Function0[RecurrenceRule],
    addWeeklyRule: js.Function0[RecurrenceRule],
    addYearlyExclusion: js.Function0[RecurrenceRule],
    addYearlyRule: js.Function0[RecurrenceRule],
    interval: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, RecurrenceRule],
    onlyInMonth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month, RecurrenceRule],
    onlyInMonths: js.Function1[
      js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month], 
      RecurrenceRule
    ],
    onlyOnMonthDay: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, RecurrenceRule],
    onlyOnMonthDays: js.Function1[js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer], RecurrenceRule],
    onlyOnWeek: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, RecurrenceRule],
    onlyOnWeekday: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday, RecurrenceRule],
    onlyOnWeekdays: js.Function1[
      js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday], 
      RecurrenceRule
    ],
    onlyOnWeeks: js.Function1[js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer], RecurrenceRule],
    onlyOnYearDay: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, RecurrenceRule],
    onlyOnYearDays: js.Function1[js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer], RecurrenceRule],
    setTimeZone: js.Function1[java.lang.String, EventRecurrence],
    times: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, RecurrenceRule],
    until: js.Function1[stdLib.Date, RecurrenceRule],
    weekStartsOn: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday, RecurrenceRule]
  ): RecurrenceRule = {
    val __obj = js.Dynamic.literal(addDailyExclusion = addDailyExclusion, addDailyRule = addDailyRule, addDate = addDate, addDateExclusion = addDateExclusion, addMonthlyExclusion = addMonthlyExclusion, addMonthlyRule = addMonthlyRule, addWeeklyExclusion = addWeeklyExclusion, addWeeklyRule = addWeeklyRule, addYearlyExclusion = addYearlyExclusion, addYearlyRule = addYearlyRule, interval = interval, onlyInMonth = onlyInMonth, onlyInMonths = onlyInMonths, onlyOnMonthDay = onlyOnMonthDay, onlyOnMonthDays = onlyOnMonthDays, onlyOnWeek = onlyOnWeek, onlyOnWeekday = onlyOnWeekday, onlyOnWeekdays = onlyOnWeekdays, onlyOnWeeks = onlyOnWeeks, onlyOnYearDay = onlyOnYearDay, onlyOnYearDays = onlyOnYearDays, setTimeZone = setTimeZone, times = times, until = until, weekStartsOn = weekStartsOn)
  
    __obj.asInstanceOf[RecurrenceRule]
  }
}

