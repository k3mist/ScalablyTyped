package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullMessage extends js.Object {
  /** A data payload consumed by the task worker to execute the task. */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A meta-data tag for this task.
    *
    * This value is used by CloudTasks.PullTasks calls when
    * PullTasksRequest.filter is `tag=<tag>`.
    *
    * The tag must be less than 500 bytes.
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object PullMessage {
  @scala.inline
  def apply(payload: java.lang.String = null, tag: java.lang.String = null): PullMessage = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[PullMessage]
  }
}

