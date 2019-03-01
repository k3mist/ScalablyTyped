package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkHours extends js.Object {
  /** Sets the end time to depict the end of working or business hour in a day.
    * @Default {18}
    */
  var end: js.UndefOr[scala.Double] = js.undefined
  /** When set to true, highlights the work hours of the Schedule.
    * @Default {true}
    */
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the start time to depict the start of working or business hour in a day.
    * @Default {9}
    */
  var start: js.UndefOr[scala.Double] = js.undefined
}

object WorkHours {
  @scala.inline
  def apply(
    end: scala.Int | scala.Double = null,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null
  ): WorkHours = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkHours]
  }
}

