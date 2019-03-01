package typings
package reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineContext extends js.Object {
  var timelineWidth: scala.Double
  var visibleTimeEnd: scala.Double
  var visibletimeStart: scala.Double
}

object TimelineContext {
  @scala.inline
  def apply(timelineWidth: scala.Double, visibleTimeEnd: scala.Double, visibletimeStart: scala.Double): TimelineContext = {
    val __obj = js.Dynamic.literal(timelineWidth = timelineWidth, visibleTimeEnd = visibleTimeEnd, visibletimeStart = visibletimeStart)
  
    __obj.asInstanceOf[TimelineContext]
  }
}

