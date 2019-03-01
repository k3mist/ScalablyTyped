package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupResponse extends js.Object {
  /** The contact group. */
  var contactGroup: js.UndefOr[ContactGroup] = js.undefined
  /** The original requested resource name. */
  var requestedResourceName: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the response. */
  var status: js.UndefOr[Status] = js.undefined
}

object ContactGroupResponse {
  @scala.inline
  def apply(
    contactGroup: ContactGroup = null,
    requestedResourceName: java.lang.String = null,
    status: Status = null
  ): ContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup)
    if (requestedResourceName != null) __obj.updateDynamic("requestedResourceName")(requestedResourceName)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ContactGroupResponse]
  }
}

