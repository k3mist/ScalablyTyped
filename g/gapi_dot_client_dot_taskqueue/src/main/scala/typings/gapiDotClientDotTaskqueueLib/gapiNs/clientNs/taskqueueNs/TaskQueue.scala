package typings
package gapiDotClientDotTaskqueueLib.gapiNs.clientNs.taskqueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskQueue extends js.Object {
  /** ACLs that are applicable to this TaskQueue object. */
  var acl: js.UndefOr[gapiDotClientDotTaskqueueLib.Anon_AdminEmails] = js.undefined
  /** Name of the taskqueue. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of REST object returned, in this case taskqueue. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The number of times we should lease out tasks before giving up on them. If unset we lease them out forever until a worker deletes the task. */
  var maxLeases: js.UndefOr[scala.Double] = js.undefined
  /** Statistics for the TaskQueue object in question. */
  var stats: js.UndefOr[gapiDotClientDotTaskqueueLib.Anon_LeasedLastHour] = js.undefined
}

object TaskQueue {
  @scala.inline
  def apply(
    acl: gapiDotClientDotTaskqueueLib.Anon_AdminEmails = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    maxLeases: scala.Int | scala.Double = null,
    stats: gapiDotClientDotTaskqueueLib.Anon_LeasedLastHour = null
  ): TaskQueue = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maxLeases != null) __obj.updateDynamic("maxLeases")(maxLeases.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[TaskQueue]
  }
}

