package typings
package chromeDashAppsLib.chromeNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alarm extends js.Object {
  /** Name of this alarm. */
  var name: java.lang.String
  /** If not null, the alarm is a repeating alarm and will fire again in periodInMinutes minutes.  */
  var periodInMinutes: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Time at which this alarm was scheduled to fire, in milliseconds past the epoch (e.g. Date.now() + n). For performance reasons, the alarm may have been delayed an arbitrary amount beyond this. */
  var scheduledTime: chromeDashAppsLib.chromeNs.integer
}

object Alarm {
  @scala.inline
  def apply(
    name: java.lang.String,
    scheduledTime: chromeDashAppsLib.chromeNs.integer,
    periodInMinutes: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): Alarm = {
    val __obj = js.Dynamic.literal(name = name, scheduledTime = scheduledTime)
    if (!js.isUndefined(periodInMinutes)) __obj.updateDynamic("periodInMinutes")(periodInMinutes)
    __obj.asInstanceOf[Alarm]
  }
}

