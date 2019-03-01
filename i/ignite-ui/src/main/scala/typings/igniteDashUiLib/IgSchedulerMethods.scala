package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSchedulerMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igscheduler#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igscheduler#options:language) or [locale](ui.igscheduler#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit
  /**
  	 * Creates an appointment and adds it to the appointment collection
  	 *
  	 * @param appointment appointment
  	 */
  def createAppointment(appointment: js.Object): js.Object
  /**
  	 * Gets reference to the date range UI button.
  	 */
  def dateRangeButton(): java.lang.String
  /**
  	 * Deletes appointment from the appointment collection
  	 *
  	 * @param appointment appointment
  	 */
  def deleteAppointment(appointment: js.Object): js.Object
  /**
  	 * Destroys the widget
  	 */
  def destroy(): scala.Unit
  /**
  	 * Deletes appointment from the appointment collection
  	 *
  	 * @param appointment appointment
  	 * @param updateAppoinment updateAppoinment
  	 */
  def editAppointment(appointment: js.Object, updateAppoinment: js.Object): js.Object
  /**
  	 * Gets reference to a collection of all appointments for the given time range
  	 *
  	 * @param start Start date.
  	 * @param end End date.
  	 */
  def getAppointmentsInRange(start: stdLib.Date, end: stdLib.Date): js.Object
  /**
  	 * Gets reference to the jQuery calendar UI control.
  	 */
  def getCalendar(): java.lang.String
  /**
  	 * Gets reference to the next UI button.
  	 */
  def nextButton(): java.lang.String
  /**
  	 * Gets reference to the previous UI button.
  	 */
  def previousButton(): java.lang.String
  /**
  	 * Gets reference to the today UI button.
  	 */
  def todayButton(): java.lang.String
}

object IgSchedulerMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function0[scala.Unit],
    createAppointment: js.Function1[js.Object, js.Object],
    dateRangeButton: js.Function0[java.lang.String],
    deleteAppointment: js.Function1[js.Object, js.Object],
    destroy: js.Function0[scala.Unit],
    editAppointment: js.Function2[js.Object, js.Object, js.Object],
    getAppointmentsInRange: js.Function2[stdLib.Date, stdLib.Date, js.Object],
    getCalendar: js.Function0[java.lang.String],
    nextButton: js.Function0[java.lang.String],
    previousButton: js.Function0[java.lang.String],
    todayButton: js.Function0[java.lang.String]
  ): IgSchedulerMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage, changeGlobalRegional = changeGlobalRegional, changeLocale = changeLocale, createAppointment = createAppointment, dateRangeButton = dateRangeButton, deleteAppointment = deleteAppointment, destroy = destroy, editAppointment = editAppointment, getAppointmentsInRange = getAppointmentsInRange, getCalendar = getCalendar, nextButton = nextButton, previousButton = previousButton, todayButton = todayButton)
  
    __obj.asInstanceOf[IgSchedulerMethods]
  }
}

