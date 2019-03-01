package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportUsersOptions extends js.Object {
  var connection_id: java.lang.String
  var users: java.lang.String
}

object ImportUsersOptions {
  @scala.inline
  def apply(connection_id: java.lang.String, users: java.lang.String): ImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id, users = users)
  
    __obj.asInstanceOf[ImportUsersOptions]
  }
}

