package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeData extends js.Object {
  var current: java.lang.String
  var timezone: java.lang.String
  var timezoneName: java.lang.String
  var uptime: java.lang.String
}

object TimeData {
  @scala.inline
  def apply(
    current: java.lang.String,
    timezone: java.lang.String,
    timezoneName: java.lang.String,
    uptime: java.lang.String
  ): TimeData = {
    val __obj = js.Dynamic.literal(current = current, timezone = timezone, timezoneName = timezoneName, uptime = uptime)
  
    __obj.asInstanceOf[TimeData]
  }
}

