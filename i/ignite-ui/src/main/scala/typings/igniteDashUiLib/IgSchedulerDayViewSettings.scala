package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSchedulerDayViewSettings
  extends /**
	 * Option for IgSchedulerDayViewSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the number of days are visible at a time in the day view. 1 to 7 days are supported.
  	 *
  	 */
  var dayViewNumberOfDays: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the time slots duration. 5, 6, 10, 15, 30 and 60 minutes are supported.
  	 *
  	 */
  var timeSlotInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets whether to display all hours or just working hours.
  	 *
  	 */
  var workingHoursDisplayMode: js.UndefOr[scala.Double] = js.undefined
}

object IgSchedulerDayViewSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSchedulerDayViewSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dayViewNumberOfDays: scala.Int | scala.Double = null,
    timeSlotInterval: scala.Int | scala.Double = null,
    workingHoursDisplayMode: scala.Int | scala.Double = null
  ): IgSchedulerDayViewSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dayViewNumberOfDays != null) __obj.updateDynamic("dayViewNumberOfDays")(dayViewNumberOfDays.asInstanceOf[js.Any])
    if (timeSlotInterval != null) __obj.updateDynamic("timeSlotInterval")(timeSlotInterval.asInstanceOf[js.Any])
    if (workingHoursDisplayMode != null) __obj.updateDynamic("workingHoursDisplayMode")(workingHoursDisplayMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSchedulerDayViewSettings]
  }
}

