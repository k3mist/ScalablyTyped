package typings
package passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationError
  extends stdLib.Error {
  var code: java.lang.String
  var status: scala.Double
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object AuthorizationError {
  @scala.inline
  def apply(
    code: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    status: scala.Double,
    stack: java.lang.String = null,
    uri: java.lang.String = null
  ): AuthorizationError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name, status = status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[AuthorizationError]
  }
}

