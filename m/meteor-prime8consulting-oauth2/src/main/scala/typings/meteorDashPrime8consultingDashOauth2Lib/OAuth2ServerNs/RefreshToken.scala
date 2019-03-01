package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshToken extends js.Object {
  var clientId: java.lang.String
  var expires: stdLib.Date
  var refreshToken: java.lang.String
  var userId: java.lang.String
}

object RefreshToken {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    expires: stdLib.Date,
    refreshToken: java.lang.String,
    userId: java.lang.String
  ): RefreshToken = {
    val __obj = js.Dynamic.literal(clientId = clientId, expires = expires, refreshToken = refreshToken, userId = userId)
  
    __obj.asInstanceOf[RefreshToken]
  }
}

