package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientParams extends js.Object {
  var client_id: java.lang.String
}

object ClientParams {
  @scala.inline
  def apply(client_id: java.lang.String): ClientParams = {
    val __obj = js.Dynamic.literal(client_id = client_id)
  
    __obj.asInstanceOf[ClientParams]
  }
}

