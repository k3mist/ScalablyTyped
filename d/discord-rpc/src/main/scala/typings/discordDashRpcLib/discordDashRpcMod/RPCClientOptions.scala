package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCClientOptions extends js.Object {
  var transport: discordDashRpcLib.discordDashRpcLibStrings.ipc | discordDashRpcLib.discordDashRpcLibStrings.websocket
}

object RPCClientOptions {
  @scala.inline
  def apply(
    transport: discordDashRpcLib.discordDashRpcLibStrings.ipc | discordDashRpcLib.discordDashRpcLibStrings.websocket
  ): RPCClientOptions = {
    val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RPCClientOptions]
  }
}

