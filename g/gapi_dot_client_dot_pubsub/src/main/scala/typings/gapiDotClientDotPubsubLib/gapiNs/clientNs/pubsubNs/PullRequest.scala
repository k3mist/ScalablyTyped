package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequest extends js.Object {
  /**
    * The maximum number of messages returned for this request. The Pub/Sub
    * system may return fewer than the number specified.
    */
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
  /**
    * If this field set to true, the system will respond immediately even if
    * it there are no messages available to return in the `Pull` response.
    * Otherwise, the system may wait (for a bounded amount of time) until at
    * least one message is available, rather than returning no messages. The
    * client may cancel the request if it does not wish to wait any longer for
    * the response.
    */
  var returnImmediately: js.UndefOr[scala.Boolean] = js.undefined
}

object PullRequest {
  @scala.inline
  def apply(
    maxMessages: scala.Int | scala.Double = null,
    returnImmediately: js.UndefOr[scala.Boolean] = js.undefined
  ): PullRequest = {
    val __obj = js.Dynamic.literal()
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately)
    __obj.asInstanceOf[PullRequest]
  }
}

