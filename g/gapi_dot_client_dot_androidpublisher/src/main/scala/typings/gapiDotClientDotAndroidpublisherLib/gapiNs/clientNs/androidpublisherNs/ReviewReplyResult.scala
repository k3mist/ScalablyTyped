package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewReplyResult extends js.Object {
  /** The time at which the reply took effect. */
  var lastEdited: js.UndefOr[Timestamp] = js.undefined
  /** The reply text that was applied. */
  var replyText: js.UndefOr[java.lang.String] = js.undefined
}

object ReviewReplyResult {
  @scala.inline
  def apply(lastEdited: Timestamp = null, replyText: java.lang.String = null): ReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    if (lastEdited != null) __obj.updateDynamic("lastEdited")(lastEdited)
    if (replyText != null) __obj.updateDynamic("replyText")(replyText)
    __obj.asInstanceOf[ReviewReplyResult]
  }
}

