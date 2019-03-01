package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoleRequest extends js.Object {
  /** The Role resource to create. */
  var role: js.UndefOr[Role] = js.undefined
  /** The role id to use for this role. */
  var roleId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateRoleRequest {
  @scala.inline
  def apply(role: Role = null, roleId: java.lang.String = null): CreateRoleRequest = {
    val __obj = js.Dynamic.literal()
    if (role != null) __obj.updateDynamic("role")(role)
    if (roleId != null) __obj.updateDynamic("roleId")(roleId)
    __obj.asInstanceOf[CreateRoleRequest]
  }
}

