package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalUserProperties extends js.Object {
  /**
    * Indicates the level of access of the user. If private, the user descriptive information will not be available to others nor will the username be searchable.  **Possible Values:** private | org | public
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#access)
    */
  var access: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date the user was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.undefined
  /**
    * The culture information for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#culture)
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A description of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's e-mail address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#email)
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's full name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fullName)
    */
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date the user was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#modified)
    */
  var modified: js.UndefOr[DateProperties] = js.undefined
  /**
    * The ID of the organization the user belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#orgId)
    */
  var orgId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The portal associated with the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  /**
    * The user's preferred view for content, either web or GIS.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#preferredView)
    */
  var preferredView: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user preferred region, used to set the featured maps on the home page, content in the gallery, and the default extent of new maps in the Viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#region)
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the user's role in the organization. See [roleId](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId) for more details about when user has a custom role.  **Possible Values:** org_admin | org_publisher | org_user
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role)
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the user's role.  Only set if the user is assigned a custom role.  When present, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will indicate the "base" role of the custom role based on the privileges the custom role contains. For example, if the custom role contains some publisher privileges, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will be set to `org_publisher`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId)
    */
  var roleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's personal units of measure setting.  **Possible Values:** english | metric
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#units)
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The username of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#username)
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object PortalUserProperties {
  @scala.inline
  def apply(
    access: java.lang.String = null,
    created: DateProperties = null,
    culture: java.lang.String = null,
    description: java.lang.String = null,
    email: java.lang.String = null,
    fullName: java.lang.String = null,
    modified: DateProperties = null,
    orgId: java.lang.String = null,
    portal: PortalProperties = null,
    preferredView: java.lang.String = null,
    region: java.lang.String = null,
    role: java.lang.String = null,
    roleId: java.lang.String = null,
    units: java.lang.String = null,
    username: java.lang.String = null
  ): PortalUserProperties = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (orgId != null) __obj.updateDynamic("orgId")(orgId)
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (preferredView != null) __obj.updateDynamic("preferredView")(preferredView)
    if (region != null) __obj.updateDynamic("region")(region)
    if (role != null) __obj.updateDynamic("role")(role)
    if (roleId != null) __obj.updateDynamic("roleId")(roleId)
    if (units != null) __obj.updateDynamic("units")(units)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[PortalUserProperties]
  }
}

