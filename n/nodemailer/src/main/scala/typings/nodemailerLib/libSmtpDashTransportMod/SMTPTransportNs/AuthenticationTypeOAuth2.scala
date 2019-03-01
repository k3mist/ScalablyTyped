package typings
package nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeOAuth2 extends AuthenticationType {
  var method: nodemailerLib.nodemailerLibStrings.XOAUTH2
  var oauth2: nodemailerLib.libXoauth2Mod.namespaced
  var `type`: nodemailerLib.nodemailerLibStrings.OAUTH2
  var user: java.lang.String
}

object AuthenticationTypeOAuth2 {
  @scala.inline
  def apply(
    method: nodemailerLib.nodemailerLibStrings.XOAUTH2,
    oauth2: nodemailerLib.libXoauth2Mod.namespaced,
    `type`: nodemailerLib.nodemailerLibStrings.OAUTH2,
    user: java.lang.String
  ): AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal(method = method, oauth2 = oauth2, `type` = `type`, user = user)
  
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
}

