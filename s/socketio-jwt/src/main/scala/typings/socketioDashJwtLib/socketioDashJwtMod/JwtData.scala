package typings
package socketioDashJwtLib.socketioDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwtData extends js.Object {
  var code: java.lang.String
  var message: java.lang.String
  var `type`: java.lang.String
}

object JwtData {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String, `type`: java.lang.String): JwtData = {
    val __obj = js.Dynamic.literal(code = code, message = message, `type` = `type`)
  
    __obj.asInstanceOf[JwtData]
  }
}

