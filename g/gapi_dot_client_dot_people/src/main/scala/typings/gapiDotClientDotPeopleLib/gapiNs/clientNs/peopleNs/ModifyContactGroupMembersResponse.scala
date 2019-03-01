package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyContactGroupMembersResponse extends js.Object {
  /** The contact people resource names that were not found. */
  var notFoundResourceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ModifyContactGroupMembersResponse {
  @scala.inline
  def apply(notFoundResourceNames: js.Array[java.lang.String] = null): ModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (notFoundResourceNames != null) __obj.updateDynamic("notFoundResourceNames")(notFoundResourceNames)
    __obj.asInstanceOf[ModifyContactGroupMembersResponse]
  }
}

