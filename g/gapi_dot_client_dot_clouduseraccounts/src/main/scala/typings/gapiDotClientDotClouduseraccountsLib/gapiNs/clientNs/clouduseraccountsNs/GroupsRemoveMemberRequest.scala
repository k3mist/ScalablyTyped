package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsRemoveMemberRequest extends js.Object {
  /** Fully-qualified URLs of the User resources to remove. */
  var users: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object GroupsRemoveMemberRequest {
  @scala.inline
  def apply(users: js.Array[java.lang.String] = null): GroupsRemoveMemberRequest = {
    val __obj = js.Dynamic.literal()
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[GroupsRemoveMemberRequest]
  }
}

