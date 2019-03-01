package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerResizeEndEvent extends SchedulerEvent {
  var end: js.UndefOr[stdLib.Date] = js.undefined
  var event: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.SchedulerEvent] = js.undefined
  var slot: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[stdLib.Date] = js.undefined
}

object SchedulerResizeEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    end: stdLib.Date = null,
    event: kendoDashUiLib.kendoNs.dataNs.SchedulerEvent = null,
    slot: js.Any = null,
    start: stdLib.Date = null
  ): SchedulerResizeEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (end != null) __obj.updateDynamic("end")(end)
    if (event != null) __obj.updateDynamic("event")(event)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SchedulerResizeEndEvent]
  }
}

