package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait connectSuccessArgs extends baseResponseArgs {
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: scala.Boolean
}

object connectSuccessArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: java.lang.String,
    isReconnect: scala.Boolean,
    meta: js.Any,
    timestamp: stdLib.Date
  ): connectSuccessArgs = {
    val __obj = js.Dynamic.literal(client = client, clientId = clientId, isReconnect = isReconnect, meta = meta, timestamp = timestamp)
  
    __obj.asInstanceOf[connectSuccessArgs]
  }
}

