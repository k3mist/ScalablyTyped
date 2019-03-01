package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribeSuccessArgs extends baseResponseArgs {
  /**
    * The channel to which the client was subscribed. Must start with a forward slash (/).
    */
  var channel: java.lang.String
  /**
    * The channels to which the client was subscribed. Each must start with a forward slash (/).
    */
  var channels: js.Array[java.lang.String]
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: scala.Boolean
  /**
    * Subscribers extension. The active subscribed clients on the just-subscribed channel(s).
    */
  var subscribedClients: js.Array[subscribedClient]
}

object subscribeSuccessArgs {
  @scala.inline
  def apply(
    channel: java.lang.String,
    channels: js.Array[java.lang.String],
    client: client,
    clientId: java.lang.String,
    isResubscribe: scala.Boolean,
    meta: js.Any,
    subscribedClients: js.Array[subscribedClient],
    timestamp: stdLib.Date
  ): subscribeSuccessArgs = {
    val __obj = js.Dynamic.literal(channel = channel, channels = channels, client = client, clientId = clientId, isResubscribe = isResubscribe, meta = meta, subscribedClients = subscribedClients, timestamp = timestamp)
  
    __obj.asInstanceOf[subscribeSuccessArgs]
  }
}

