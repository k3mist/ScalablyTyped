package typings
package wsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: wsLib.wsMod.WebSocketNs.Data
  var target: wsLib.wsMod.WebSocket
  var `type`: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: wsLib.wsMod.WebSocketNs.Data, target: wsLib.wsMod.WebSocket, `type`: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target, `type` = `type`)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

