package typings
package wsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.Any
  var message: java.lang.String
  var target: wsLib.wsMod.WebSocket
  var `type`: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(error: js.Any, message: java.lang.String, target: wsLib.wsMod.WebSocket, `type`: java.lang.String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, message = message, target = target, `type` = `type`)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

