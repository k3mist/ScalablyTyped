package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chat extends js.Object {
  var from: plugapiLib.plugapiMod.PlugAPINs.UserNs.User
  var id: java.lang.String
  var mentions: js.Array[_]
  var message: java.lang.String
  var muted: scala.Boolean
  var raw: plugapiLib.plugapiMod.PlugAPINs.RawChatMessage
  var `type`: java.lang.String
}

object Chat {
  @scala.inline
  def apply(
    from: plugapiLib.plugapiMod.PlugAPINs.UserNs.User,
    id: java.lang.String,
    mentions: js.Array[_],
    message: java.lang.String,
    muted: scala.Boolean,
    raw: plugapiLib.plugapiMod.PlugAPINs.RawChatMessage,
    `type`: java.lang.String
  ): Chat = {
    val __obj = js.Dynamic.literal(from = from, id = id, mentions = mentions, message = message, muted = muted, raw = raw, `type` = `type`)
  
    __obj.asInstanceOf[Chat]
  }
}

