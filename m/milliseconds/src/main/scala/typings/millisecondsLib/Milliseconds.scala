package typings
package millisecondsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milliseconds extends js.Object {
  def days(days: scala.Double): scala.Double
  def hours(hours: scala.Double): scala.Double
  def minutes(minutes: scala.Double): scala.Double
  def months(months: scala.Double): scala.Double
  def seconds(seconds: scala.Double): scala.Double
  def weeks(weeks: scala.Double): scala.Double
  def years(years: scala.Double): scala.Double
}

object Milliseconds {
  @scala.inline
  def apply(
    days: js.Function1[scala.Double, scala.Double],
    hours: js.Function1[scala.Double, scala.Double],
    minutes: js.Function1[scala.Double, scala.Double],
    months: js.Function1[scala.Double, scala.Double],
    seconds: js.Function1[scala.Double, scala.Double],
    weeks: js.Function1[scala.Double, scala.Double],
    years: js.Function1[scala.Double, scala.Double]
  ): Milliseconds = {
    val __obj = js.Dynamic.literal(days = days, hours = hours, minutes = minutes, months = months, seconds = seconds, weeks = weeks, years = years)
  
    __obj.asInstanceOf[Milliseconds]
  }
}

