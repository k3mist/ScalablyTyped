package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current date object.
    */
  var currentDate: js.UndefOr[js.Any] = js.undefined
  /** Returns the current view value.
    */
  var currentView: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the previous date of the Schedule.
    */
  var previousDate: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous view value.
    */
  var previousView: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the Scheduler event.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the target of the action.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentDate: js.Any = null,
    currentView: java.lang.String = null,
    model: Model = null,
    previousDate: js.Any = null,
    previousView: java.lang.String = null,
    requestType: java.lang.String = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): NavigationEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate)
    if (currentView != null) __obj.updateDynamic("currentView")(currentView)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousDate != null) __obj.updateDynamic("previousDate")(previousDate)
    if (previousView != null) __obj.updateDynamic("previousView")(previousView)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NavigationEventArgs]
  }
}

