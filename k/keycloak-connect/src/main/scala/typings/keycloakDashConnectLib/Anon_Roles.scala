package typings
package keycloakDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Roles extends js.Object {
  var roles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Roles {
  @scala.inline
  def apply(roles: js.Array[java.lang.String] = null): Anon_Roles = {
    val __obj = js.Dynamic.literal()
    if (roles != null) __obj.updateDynamic("roles")(roles)
    __obj.asInstanceOf[Anon_Roles]
  }
}

