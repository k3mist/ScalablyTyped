package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllDay[TEvent] extends js.Object {
  var allDay: scala.Boolean
  var end: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
  var event: TEvent
  var start: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
}

object Anon_AllDay {
  @scala.inline
  def apply[TEvent](
    allDay: scala.Boolean,
    end: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate,
    event: TEvent,
    start: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
  ): Anon_AllDay[TEvent] = {
    val __obj = js.Dynamic.literal(allDay = allDay, end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllDay[TEvent]]
  }
}

