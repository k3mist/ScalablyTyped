package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMessageParams extends js.Object {
  /**
    * The actual message
    */
  var message: java.lang.String
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType
}

object LogMessageParams {
  @scala.inline
  def apply(message: java.lang.String, `type`: MessageType): LogMessageParams = {
    val __obj = js.Dynamic.literal(message = message, `type` = `type`)
  
    __obj.asInstanceOf[LogMessageParams]
  }
}

