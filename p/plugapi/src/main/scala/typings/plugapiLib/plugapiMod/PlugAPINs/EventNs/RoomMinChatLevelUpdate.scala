package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomMinChatLevelUpdate extends js.Object {
  var id: scala.Double
  var level: scala.Double
  var user: plugapiLib.plugapiMod.PlugAPINs.UserNs.User
}

object RoomMinChatLevelUpdate {
  @scala.inline
  def apply(id: scala.Double, level: scala.Double, user: plugapiLib.plugapiMod.PlugAPINs.UserNs.User): RoomMinChatLevelUpdate = {
    val __obj = js.Dynamic.literal(id = id, level = level, user = user)
  
    __obj.asInstanceOf[RoomMinChatLevelUpdate]
  }
}

