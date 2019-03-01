package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorMonthly extends js.Object {
  var day: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var repeatEvery: js.UndefOr[java.lang.String] = js.undefined
  var repeatOn: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorMonthly {
  @scala.inline
  def apply(
    day: java.lang.String = null,
    interval: java.lang.String = null,
    repeatEvery: java.lang.String = null,
    repeatOn: java.lang.String = null
  ): SchedulerMessagesRecurrenceEditorMonthly = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (repeatEvery != null) __obj.updateDynamic("repeatEvery")(repeatEvery)
    if (repeatOn != null) __obj.updateDynamic("repeatOn")(repeatOn)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorMonthly]
  }
}

