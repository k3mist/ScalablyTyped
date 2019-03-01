package typings
package nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeLogin extends AuthenticationType {
  var credentials: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.Credentials
  var method: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`
  var `type`: nodemailerLib.nodemailerLibStrings.LOGIN
  var user: java.lang.String
}

object AuthenticationTypeLogin {
  @scala.inline
  def apply(
    credentials: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.Credentials,
    method: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`,
    `type`: nodemailerLib.nodemailerLibStrings.LOGIN,
    user: java.lang.String
  ): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(credentials = credentials, method = method.asInstanceOf[js.Any], `type` = `type`, user = user)
  
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
}

