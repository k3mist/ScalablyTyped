package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedTokenUser extends js.Object {
  var adminToken: java.lang.String
  var server: java.lang.String
}

object SerializedTokenUser {
  @scala.inline
  def apply(adminToken: java.lang.String, server: java.lang.String): SerializedTokenUser = {
    val __obj = js.Dynamic.literal(adminToken = adminToken, server = server)
  
    __obj.asInstanceOf[SerializedTokenUser]
  }
}

