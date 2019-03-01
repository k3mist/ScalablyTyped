package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var active: scala.Boolean
  var clientId: java.lang.String
  var clientSecret: java.lang.String
  var redirectUri: java.lang.String
}

object Client {
  @scala.inline
  def apply(
    active: scala.Boolean,
    clientId: java.lang.String,
    clientSecret: java.lang.String,
    redirectUri: java.lang.String
  ): Client = {
    val __obj = js.Dynamic.literal(active = active, clientId = clientId, clientSecret = clientSecret, redirectUri = redirectUri)
  
    __obj.asInstanceOf[Client]
  }
}

