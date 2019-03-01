package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RtmCall[T] extends js.Object {
  var message: T
  var rawMessage: wsLib.wsMod.WebSocketNs.Data
  var token: java.lang.String
}

object RtmCall {
  @scala.inline
  def apply[T](message: T, rawMessage: wsLib.wsMod.WebSocketNs.Data, token: java.lang.String): RtmCall[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any], token = token)
  
    __obj.asInstanceOf[RtmCall[T]]
  }
}

