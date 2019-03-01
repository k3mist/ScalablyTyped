package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingEvent extends js.Object {
  /** The current number of workers the job has. */
  var currentNumWorkers: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A message describing why the system decided to adjust the current
    * number of workers, why it failed, or why the system decided to
    * not make any changes to the number of workers.
    */
  var description: js.UndefOr[StructuredMessage] = js.undefined
  /** The type of autoscaling event to report. */
  var eventType: js.UndefOr[java.lang.String] = js.undefined
  /** The target number of workers the worker pool wants to resize to use. */
  var targetNumWorkers: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time this event was emitted to indicate a new target or current
    * num_workers value.
    */
  var time: js.UndefOr[java.lang.String] = js.undefined
}

object AutoscalingEvent {
  @scala.inline
  def apply(
    currentNumWorkers: java.lang.String = null,
    description: StructuredMessage = null,
    eventType: java.lang.String = null,
    targetNumWorkers: java.lang.String = null,
    time: java.lang.String = null
  ): AutoscalingEvent = {
    val __obj = js.Dynamic.literal()
    if (currentNumWorkers != null) __obj.updateDynamic("currentNumWorkers")(currentNumWorkers)
    if (description != null) __obj.updateDynamic("description")(description)
    if (eventType != null) __obj.updateDynamic("eventType")(eventType)
    if (targetNumWorkers != null) __obj.updateDynamic("targetNumWorkers")(targetNumWorkers)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[AutoscalingEvent]
  }
}

