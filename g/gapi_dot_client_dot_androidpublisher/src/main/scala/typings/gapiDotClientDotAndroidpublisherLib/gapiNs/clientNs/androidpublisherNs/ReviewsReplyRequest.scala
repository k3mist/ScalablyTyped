package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsReplyRequest extends js.Object {
  /** The text to set as the reply. Replies of more than approximately 350 characters will be rejected. HTML tags will be stripped. */
  var replyText: js.UndefOr[java.lang.String] = js.undefined
}

object ReviewsReplyRequest {
  @scala.inline
  def apply(replyText: java.lang.String = null): ReviewsReplyRequest = {
    val __obj = js.Dynamic.literal()
    if (replyText != null) __obj.updateDynamic("replyText")(replyText)
    __obj.asInstanceOf[ReviewsReplyRequest]
  }
}

