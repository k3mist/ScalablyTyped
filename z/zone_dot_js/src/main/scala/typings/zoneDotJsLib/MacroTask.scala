package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacroTask extends Task {
  @JSName("type")
  var type_MacroTask: zoneDotJsLib.zoneDotJsLibStrings.macroTask
}

object MacroTask {
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: () => scala.Unit,
    invoke: js.Function,
    runCount: scala.Double,
    source: java.lang.String,
    state: TaskState,
    `type`: zoneDotJsLib.zoneDotJsLibStrings.macroTask,
    zone: Zone,
    cancelFn: /* task */ Task => scala.Unit = null,
    data: TaskData = null,
    scheduleFn: /* task */ Task => scala.Unit = null
  ): MacroTask = {
    val __obj = js.Dynamic.literal(callback = callback, cancelScheduleRequest = js.Any.fromFunction0(cancelScheduleRequest), invoke = invoke, runCount = runCount, source = source, state = state, zone = zone)
    __obj.updateDynamic("type")(`type`)
    if (cancelFn != null) __obj.updateDynamic("cancelFn")(js.Any.fromFunction1(cancelFn))
    if (data != null) __obj.updateDynamic("data")(data)
    if (scheduleFn != null) __obj.updateDynamic("scheduleFn")(js.Any.fromFunction1(scheduleFn))
    __obj.asInstanceOf[MacroTask]
  }
}

