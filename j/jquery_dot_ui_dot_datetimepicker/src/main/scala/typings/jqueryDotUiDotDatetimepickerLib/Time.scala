package typings
package jqueryDotUiDotDatetimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var hour: js.UndefOr[scala.Double] = js.undefined
  var millisecond: js.UndefOr[scala.Double] = js.undefined
  var minute: js.UndefOr[scala.Double] = js.undefined
  var second: js.UndefOr[scala.Double] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
}

object Time {
  @scala.inline
  def apply(
    hour: scala.Int | scala.Double = null,
    millisecond: scala.Int | scala.Double = null,
    minute: scala.Int | scala.Double = null,
    second: scala.Int | scala.Double = null,
    timezone: java.lang.String = null
  ): Time = {
    val __obj = js.Dynamic.literal()
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[Time]
  }
}

