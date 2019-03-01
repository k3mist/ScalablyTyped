package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** User role permission collection. */
  var userRolePermissions: js.UndefOr[js.Array[UserRolePermission]] = js.undefined
}

object UserRolePermissionsListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, userRolePermissions: js.Array[UserRolePermission] = null): UserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (userRolePermissions != null) __obj.updateDynamic("userRolePermissions")(userRolePermissions)
    __obj.asInstanceOf[UserRolePermissionsListResponse]
  }
}

