package typings
package angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateFormats extends js.Object {
  var datetime: java.lang.String
  var day: java.lang.String
  var hour: java.lang.String
  var month: java.lang.String
  var time: java.lang.String
  var weekDay: java.lang.String
}

object IDateFormats {
  @scala.inline
  def apply(
    datetime: java.lang.String,
    day: java.lang.String,
    hour: java.lang.String,
    month: java.lang.String,
    time: java.lang.String,
    weekDay: java.lang.String
  ): IDateFormats = {
    val __obj = js.Dynamic.literal(datetime = datetime, day = day, hour = hour, month = month, time = time, weekDay = weekDay)
  
    __obj.asInstanceOf[IDateFormats]
  }
}

