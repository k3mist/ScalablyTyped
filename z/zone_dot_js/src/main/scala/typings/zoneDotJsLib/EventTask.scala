package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTask extends Task {
  @JSName("type")
  var type_EventTask: zoneDotJsLib.zoneDotJsLibStrings.eventTask
}

object EventTask {
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: js.Function0[scala.Unit],
    invoke: js.Function,
    runCount: scala.Double,
    source: java.lang.String,
    state: TaskState,
    `type`: zoneDotJsLib.zoneDotJsLibStrings.eventTask,
    zone: Zone,
    cancelFn: js.Function1[/* task */ Task, scala.Unit] = null,
    data: TaskData = null,
    scheduleFn: js.Function1[/* task */ Task, scala.Unit] = null
  ): EventTask = {
    val __obj = js.Dynamic.literal(callback = callback, cancelScheduleRequest = cancelScheduleRequest, invoke = invoke, runCount = runCount, source = source, state = state, `type` = `type`, zone = zone)
    if (cancelFn != null) __obj.updateDynamic("cancelFn")(cancelFn)
    if (data != null) __obj.updateDynamic("data")(data)
    if (scheduleFn != null) __obj.updateDynamic("scheduleFn")(scheduleFn)
    __obj.asInstanceOf[EventTask]
  }
}

