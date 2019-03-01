package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSchedulerMonthViewSettings
  extends /**
	 * Option for IgSchedulerMonthViewSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the scope of appointments that are displayed in a MonthView's AgendaView.
  	 *
  	 * allAppointments  Indicates that appointments for all days should be displayed in an AgendaView when it is a secondary view within a MonthView.
  	 * onlyAppointmentsForSelectedMonthViewDay  Indicates that only appointments for the day that is current selected in the associated MonthView should be displayed in an AgendaView that is associated with a MonthView as a secondary view.
  	 */
  var agendaVisibilityType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the type of content displayed in a MonthView day.
  	 *
  	 * auto  Depending on the screen size, indicates square indicator mode for the appointment in the Month View, if scheduler size is larger than 768px, otherwise identifies horizontal one.
  	 * indicator  Indicates that a square indicator should be displayed.
  	 * detailed  Indicates that the subject should be displayed.
  	 */
  var appointmentMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the visibility of an AgendaView in a MonthView.  When true, the MonthView will display an AgendaView showing the Appointments for the currently selected day at the top of its list of Appointments.
  	 *
  	 */
  var isAgendaVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/sets the visibility of the horizontal separators between weeks in the MonthView.
  	 *
  	 */
  var isHorizontalSeparatorVisibile: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/sets the visibility of the days from the next month that occur in the last week of a given month.
  	 *
  	 */
  var isNextMonthShown: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/sets the visibility of the days from the previous month that occur in the first week of a given month.
  	 *
  	 */
  var isPreviousMonthShown: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/sets the visibility of the vertical separators between days of the week in a MonthView.
  	 *
  	 */
  var isVerticalSeparatorVisibile: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/sets the visibility of the week numbers in a MonthView.
  	 *
  	 */
  var isWeekNumberVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/sets the visibility of the weekday names in MonthView.
  	 *
  	 */
  var isWeekdayVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the orientation, which determines whether the MonthView and AgendaView views are split vertically or horizontally. This option can be used when the AgendaView is displayed in the MonthView.
  	 *
  	 * auto  Depending on the screen size, identifies vertical split if scheduler size is larger than 768px, otherwise identifies horizontal one.
  	 * vertical  Identifies a vertical split between the Scheduler's views.
  	 * horizontal  Identifies a horizontal split between the Scheduler's views.
  	 */
  var viewSplitOrientation: js.UndefOr[java.lang.String] = js.undefined
}

object IgSchedulerMonthViewSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSchedulerMonthViewSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    agendaVisibilityType: java.lang.String = null,
    appointmentMode: java.lang.String = null,
    isAgendaVisible: js.UndefOr[scala.Boolean] = js.undefined,
    isHorizontalSeparatorVisibile: js.UndefOr[scala.Boolean] = js.undefined,
    isNextMonthShown: js.UndefOr[scala.Boolean] = js.undefined,
    isPreviousMonthShown: js.UndefOr[scala.Boolean] = js.undefined,
    isVerticalSeparatorVisibile: js.UndefOr[scala.Boolean] = js.undefined,
    isWeekNumberVisible: js.UndefOr[scala.Boolean] = js.undefined,
    isWeekdayVisible: js.UndefOr[scala.Boolean] = js.undefined,
    viewSplitOrientation: java.lang.String = null
  ): IgSchedulerMonthViewSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (agendaVisibilityType != null) __obj.updateDynamic("agendaVisibilityType")(agendaVisibilityType)
    if (appointmentMode != null) __obj.updateDynamic("appointmentMode")(appointmentMode)
    if (!js.isUndefined(isAgendaVisible)) __obj.updateDynamic("isAgendaVisible")(isAgendaVisible)
    if (!js.isUndefined(isHorizontalSeparatorVisibile)) __obj.updateDynamic("isHorizontalSeparatorVisibile")(isHorizontalSeparatorVisibile)
    if (!js.isUndefined(isNextMonthShown)) __obj.updateDynamic("isNextMonthShown")(isNextMonthShown)
    if (!js.isUndefined(isPreviousMonthShown)) __obj.updateDynamic("isPreviousMonthShown")(isPreviousMonthShown)
    if (!js.isUndefined(isVerticalSeparatorVisibile)) __obj.updateDynamic("isVerticalSeparatorVisibile")(isVerticalSeparatorVisibile)
    if (!js.isUndefined(isWeekNumberVisible)) __obj.updateDynamic("isWeekNumberVisible")(isWeekNumberVisible)
    if (!js.isUndefined(isWeekdayVisible)) __obj.updateDynamic("isWeekdayVisible")(isWeekdayVisible)
    if (viewSplitOrientation != null) __obj.updateDynamic("viewSplitOrientation")(viewSplitOrientation)
    __obj.asInstanceOf[IgSchedulerMonthViewSettings]
  }
}

