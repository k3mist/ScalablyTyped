package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerResizeEvent extends SchedulerEvent {
  var event: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.SchedulerEvent] = js.undefined
  var slot: js.UndefOr[js.Any] = js.undefined
}

object SchedulerResizeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    event: kendoDashUiLib.kendoNs.dataNs.SchedulerEvent = null,
    slot: js.Any = null
  ): SchedulerResizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    __obj.asInstanceOf[SchedulerResizeEvent]
  }
}

