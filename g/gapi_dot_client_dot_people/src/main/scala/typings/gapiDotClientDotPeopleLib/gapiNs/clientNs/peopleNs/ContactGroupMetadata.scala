package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupMetadata extends js.Object {
  /**
    * True if the contact group resource has been deleted. Populated only for
    * [`ListContactGroups`](/people/api/rest/v1/contactgroups/list) requests
    * that include a sync token.
    */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** The time the group was last updated. */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object ContactGroupMetadata {
  @scala.inline
  def apply(deleted: js.UndefOr[scala.Boolean] = js.undefined, updateTime: java.lang.String = null): ContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[ContactGroupMetadata]
  }
}

