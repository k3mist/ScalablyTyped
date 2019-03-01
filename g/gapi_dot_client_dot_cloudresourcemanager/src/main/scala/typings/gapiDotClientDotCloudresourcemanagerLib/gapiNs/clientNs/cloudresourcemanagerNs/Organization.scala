package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  /**
    * Timestamp when the Organization was created. Assigned by the server.
    * @OutputOnly
    */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A friendly string to be used to refer to the Organization in the UI.
    * Assigned by the server, set to the primary domain of the G Suite
    * customer that owns the organization.
    * @OutputOnly
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The organization's current lifecycle state. Assigned by the server.
    * @OutputOnly
    */
  var lifecycleState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Output Only. The resource name of the organization. This is the
    * organization's relative path in the API. Its format is
    * "organizations/[organization_id]". For example, "organizations/1234".
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The owner of this Organization. The owner should be specified on
    * creation. Once set, it cannot be changed.
    * This field is required.
    */
  var owner: js.UndefOr[OrganizationOwner] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    creationTime: java.lang.String = null,
    displayName: java.lang.String = null,
    lifecycleState: java.lang.String = null,
    name: java.lang.String = null,
    owner: OrganizationOwner = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (lifecycleState != null) __obj.updateDynamic("lifecycleState")(lifecycleState)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[Organization]
  }
}

