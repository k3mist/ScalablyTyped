package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningHoursTime extends js.Object {
  /** a number from 0–6, corresponding to the days of the week, starting on Sunday. For example, 2 means Tuesday. */
  var day: scala.Double
  /**
    *  may contain a time of day in 24-hour hhmm format. Values are in the range 0000–2359. The `time`
    * will be reported in the place's time zone.
    */
  var time: js.UndefOr[java.lang.String] = js.undefined
}

object OpeningHoursTime {
  @scala.inline
  def apply(day: scala.Double, time: java.lang.String = null): OpeningHoursTime = {
    val __obj = js.Dynamic.literal(day = day)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[OpeningHoursTime]
  }
}

