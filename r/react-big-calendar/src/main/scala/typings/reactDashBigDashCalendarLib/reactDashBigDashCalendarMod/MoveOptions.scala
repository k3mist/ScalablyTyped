package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOptions extends js.Object {
  var action: Navigate
  var date: stdLib.Date
  var today: stdLib.Date
}

object MoveOptions {
  @scala.inline
  def apply(action: Navigate, date: stdLib.Date, today: stdLib.Date): MoveOptions = {
    val __obj = js.Dynamic.literal(action = action, date = date, today = today)
  
    __obj.asInstanceOf[MoveOptions]
  }
}

