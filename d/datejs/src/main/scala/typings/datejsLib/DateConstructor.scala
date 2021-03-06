package typings
package datejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DateJS Public Static Methods */
@js.native
trait DateConstructor extends js.Object {
  /** Contains the day-of-week value for Friday */
  var FRIDAY: scala.Double = js.native
  /** Contains the day-of-week value for Monday */
  var MONDAY: scala.Double = js.native
  /** Contains the day-of-week value for Saturday */
  var SATURDAY: scala.Double = js.native
  /** Contains the day-of-week value for Sunday */
  var SUNDAY: scala.Double = js.native
  /** Contains the day-of-week value for Thursday */
  var THURSDAY: scala.Double = js.native
  /** Contains the day-of-week value for Tuesday */
  var TUESDAY: scala.Double = js.native
  /** Contains the day-of-week value for Wednesday */
  var WEDNESDAY: scala.Double = js.native
  def apr(): Date = js.native
  def april(): Date = js.native
  def aug(): Date = js.native
  def august(): Date = js.native
  /** Compares the first date to the second date and returns an number indication of their relative values. -1 = this is lessthan date. 0 = values are equal. 1 = this is greaterthan date. */
  def compare(date1: Date, date2: Date): scala.Double = js.native
  def dec(): Date = js.native
  def december(): Date = js.native
  /** Compares the first Date object to the second Date object and returns true if they are equal. */
  def equals(date1: Date): scala.Boolean = js.native
  def equals(date1: Date, date2: Date): scala.Boolean = js.native
  def feb(): Date = js.native
  def february(): Date = js.native
  def fri(): Date = js.native
  def friday(): Date = js.native
  /** Instantiates a DateJS object from a literal */
  def fromObject(date: datejsLib.sugarpakNs.IDateLiteral): Date = js.native
  /** Gets the day number (0-6) if given a culture-specific string which is a valid full or abbreviated day name. */
  def getDayNumberFromName(dayName: java.lang.String): scala.Double = js.native
  /** Gets the number of days in the month, given a year and month value. Automatically corrects for leap year. */
  def getDaysInMonth(year: scala.Double, month: scala.Double): scala.Double = js.native
  /** Gets the month number (0-11) if given a culture-specific string which is a valid full or abbreviated month name. */
  def getMonthNumberFromName(monthName: java.lang.String): scala.Double = js.native
  /** Returns a culture-specific timezone abbreviation based on a given offset and a boolean indicating whether daylight savings time is in effect. */
  def getTimezoneAbbreviation(timezoneOffset: scala.Double, isDayLightSavingsTime: scala.Boolean): java.lang.String = js.native
  /** Gets the timezone offset if given a culture-specific string which is a valid full or abbreviated timezone name and a boolean indicating whether daylight savings time is in effect. */
  def getTimezoneOffset(): scala.Double = js.native
  def getTimezoneOffset(timezoneAbbreviation: java.lang.String): scala.Double = js.native
  def getTimezoneOffset(timezoneAbbreviation: java.lang.String, isDayLightSavingsTime: scala.Boolean): scala.Double = js.native
  /** Returns true if the given year is a leap year, false otherwise. */
  def isLeapYear(year: scala.Double): scala.Boolean = js.native
  def jan(): Date = js.native
  def january(): Date = js.native
  def jul(): Date = js.native
  def july(): Date = js.native
  // may
  def jun(): Date = js.native
  def june(): Date = js.native
  def last(): datejsLib.sugarpakNs.IOrientation = js.native
  def mar(): Date = js.native
  def march(): Date = js.native
  def may(): Date = js.native
  def mon(): Date = js.native
  def monday(): Date = js.native
  def next(): datejsLib.sugarpakNs.IOrientation = js.native
  def nov(): Date = js.native
  def november(): Date = js.native
  def oct(): Date = js.native
  def october(): Date = js.native
  /** Converts the specified string value into its JavaScript Date equivalent using culture-specific format information. */
  def parse(dateString: java.lang.String): Date = js.native
  /** Converts the specified string value into its JavaScript Date equivalent using the specified formats (array). The format of the string value must match one of the supplied formats exactly. */
  def parseExact(dateString: java.lang.String, formatArray: js.Array[java.lang.String]): Date = js.native
  /** Converts the specified string value into its JavaScript Date equivalent using the specified format. The format of the string value must match one of the supplied formats exactly. */
  def parseExact(dateString: java.lang.String, formatString: java.lang.String): Date = js.native
  def prev(): datejsLib.sugarpakNs.IOrientation = js.native
  def previous(): datejsLib.sugarpakNs.IOrientation = js.native
  def sat(): Date = js.native
  def saturday(): Date = js.native
  def sep(): Date = js.native
  def september(): Date = js.native
  def sun(): Date = js.native
  def sunday(): Date = js.native
  def thu(): Date = js.native
  def thursday(): Date = js.native
  /** Gets a date that is set to the current date. The time is set to the start of the day (00:00 or 12:00 AM) */
  def today(): Date = js.native
  def tue(): Date = js.native
  def tuesday(): Date = js.native
  /** Validates the number is within an acceptable range for the days in a month [0-MaxDaysInMonth]. */
  def validateDay(day: scala.Double, fullYear: scala.Double, monthNumber: scala.Double): scala.Boolean = js.native
  /** Validates the number is within an acceptable range for hours[0 - 23].Returns true if within range, otherwise false. */
  def validateHour(hour: scala.Double): scala.Boolean = js.native
  /** Validates the number is within an acceptable range for milliseconds[0 - 999].Returns true if within range, otherwise false. */
  def validateMillisecond(milliseconds: scala.Double): scala.Boolean = js.native
  /** Validates the number is within an acceptable range for minutes[0 - 59].Returns true if within range, otherwise false. */
  def validateMinute(minutes: scala.Double): scala.Boolean = js.native
  /** Validates the number is within an acceptable range for months[0 - 11]. */
  def validateMonth(month: scala.Double): scala.Boolean = js.native
  /** Validates the number is within an acceptable range for seconds[0 - 59].Returns true if within range, otherwise false. */
  def validateSecond(second: scala.Double): scala.Boolean = js.native
  /** Validates the number is within an acceptable range for years[0 - 9999]. */
  def validateYear(year: scala.Double): scala.Boolean = js.native
  def wed(): Date = js.native
  def wednesday(): Date = js.native
}

