package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroupsResource extends js.Object {
  /** Gets one user role permission group by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[UserRolePermissionGroup]
  /** Gets a list of all supported user role permission groups. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[UserRolePermissionGroupsListResponse]
}

object UserRolePermissionGroupsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotDfareportingLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[UserRolePermissionGroup],
    list: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[UserRolePermissionGroupsListResponse]
  ): UserRolePermissionGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UserRolePermissionGroupsResource]
  }
}

