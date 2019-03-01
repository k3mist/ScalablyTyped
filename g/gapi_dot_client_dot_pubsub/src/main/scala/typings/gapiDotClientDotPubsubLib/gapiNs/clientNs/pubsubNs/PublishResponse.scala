package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishResponse extends js.Object {
  /**
    * The server-assigned ID of each published message, in the same order as
    * the messages in the request. IDs are guaranteed to be unique within
    * the topic.
    */
  var messageIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PublishResponse {
  @scala.inline
  def apply(messageIds: js.Array[java.lang.String] = null): PublishResponse = {
    val __obj = js.Dynamic.literal()
    if (messageIds != null) __obj.updateDynamic("messageIds")(messageIds)
    __obj.asInstanceOf[PublishResponse]
  }
}

