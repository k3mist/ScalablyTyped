package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimeFormatter extends js.Object {
  var calendar: java.lang.String
  var clock: java.lang.String
  var geographicRegion: java.lang.String
  var includeDay: DayFormat
  var includeDayOfWeek: DayOfWeekFormat
  var includeHour: HourFormat
  var includeMinute: MinuteFormat
  var includeMonth: MonthFormat
  var includeSecond: SecondFormat
  var includeYear: YearFormat
  var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var numeralSystem: java.lang.String
  var patterns: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var resolvedGeographicRegion: java.lang.String
  var resolvedLanguage: java.lang.String
  var template: java.lang.String
  def format(value: stdLib.Date): java.lang.String
}

object IDateTimeFormatter {
  @scala.inline
  def apply(
    calendar: java.lang.String,
    clock: java.lang.String,
    format: js.Function1[stdLib.Date, java.lang.String],
    geographicRegion: java.lang.String,
    includeDay: DayFormat,
    includeDayOfWeek: DayOfWeekFormat,
    includeHour: HourFormat,
    includeMinute: MinuteFormat,
    includeMonth: MonthFormat,
    includeSecond: SecondFormat,
    includeYear: YearFormat,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    numeralSystem: java.lang.String,
    patterns: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    resolvedGeographicRegion: java.lang.String,
    resolvedLanguage: java.lang.String,
    template: java.lang.String
  ): IDateTimeFormatter = {
    val __obj = js.Dynamic.literal(calendar = calendar, clock = clock, format = format, geographicRegion = geographicRegion, includeDay = includeDay, includeDayOfWeek = includeDayOfWeek, includeHour = includeHour, includeMinute = includeMinute, includeMonth = includeMonth, includeSecond = includeSecond, includeYear = includeYear, languages = languages, numeralSystem = numeralSystem, patterns = patterns, resolvedGeographicRegion = resolvedGeographicRegion, resolvedLanguage = resolvedLanguage, template = template)
  
    __obj.asInstanceOf[IDateTimeFormatter]
  }
}

