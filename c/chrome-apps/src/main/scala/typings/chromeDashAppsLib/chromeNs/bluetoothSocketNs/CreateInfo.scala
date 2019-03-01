package typings
package chromeDashAppsLib.chromeNs.bluetoothSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInfo extends js.Object {
  /**
    * The ID of the newly created socket.
    * Note that socket IDs created from this
    * API are not compatible with socket IDs
    * created from other APIs, such as the
    * sockets.tcp API.
    */
  var socketId: chromeDashAppsLib.chromeNs.integer
}

object CreateInfo {
  @scala.inline
  def apply(socketId: chromeDashAppsLib.chromeNs.integer): CreateInfo = {
    val __obj = js.Dynamic.literal(socketId = socketId)
  
    __obj.asInstanceOf[CreateInfo]
  }
}

