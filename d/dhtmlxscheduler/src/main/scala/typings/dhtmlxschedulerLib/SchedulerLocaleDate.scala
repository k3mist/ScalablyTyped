package typings
package dhtmlxschedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerLocaleDate extends js.Object {
  var day_full: js.Array[java.lang.String]
  var day_short: js.Array[java.lang.String]
  var month_full: js.Array[java.lang.String]
  var month_short: js.Array[java.lang.String]
}

object SchedulerLocaleDate {
  @scala.inline
  def apply(
    day_full: js.Array[java.lang.String],
    day_short: js.Array[java.lang.String],
    month_full: js.Array[java.lang.String],
    month_short: js.Array[java.lang.String]
  ): SchedulerLocaleDate = {
    val __obj = js.Dynamic.literal(day_full = day_full, day_short = day_short, month_full = month_full, month_short = month_short)
  
    __obj.asInstanceOf[SchedulerLocaleDate]
  }
}

