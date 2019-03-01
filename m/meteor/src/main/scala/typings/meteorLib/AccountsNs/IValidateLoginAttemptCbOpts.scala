package typings
package meteorLib.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidateLoginAttemptCbOpts extends js.Object {
  var allowed: scala.Boolean
  var connection: meteorLib.MeteorNs.Connection
  var error: meteorLib.MeteorNs.Error
  var methodArguments: js.Array[_]
  var methodName: java.lang.String
  var `type`: java.lang.String
  var user: meteorLib.MeteorNs.User
}

object IValidateLoginAttemptCbOpts {
  @scala.inline
  def apply(
    allowed: scala.Boolean,
    connection: meteorLib.MeteorNs.Connection,
    error: meteorLib.MeteorNs.Error,
    methodArguments: js.Array[_],
    methodName: java.lang.String,
    `type`: java.lang.String,
    user: meteorLib.MeteorNs.User
  ): IValidateLoginAttemptCbOpts = {
    val __obj = js.Dynamic.literal(allowed = allowed, connection = connection, error = error, methodArguments = methodArguments, methodName = methodName, `type` = `type`, user = user)
  
    __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
  }
}

