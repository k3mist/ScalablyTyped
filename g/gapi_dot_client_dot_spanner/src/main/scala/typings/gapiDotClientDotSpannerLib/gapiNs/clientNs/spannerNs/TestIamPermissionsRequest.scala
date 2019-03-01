package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIamPermissionsRequest extends js.Object {
  /**
    * REQUIRED: The set of permissions to check for 'resource'.
    * Permissions with wildcards (such as '&#42;', 'spanner.&#42;', 'spanner.instances.&#42;') are not allowed.
    */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TestIamPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[java.lang.String] = null): TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[TestIamPermissionsRequest]
  }
}

