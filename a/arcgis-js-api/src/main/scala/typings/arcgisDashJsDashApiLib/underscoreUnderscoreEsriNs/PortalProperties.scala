package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProperties extends LoadableProperties {
  /**
    * The access level of the organization. When public, anonymous users can access the organization. When private, access is restricted to only members of the organization.  **Possible Values:** public | private
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#access)
    */
  var access: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `true`, access to the organization's Portal resources must occur over SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#allSSL)
    */
  var allSSL: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The authentication mode for handling authentication when the user attempts to access a secure resource.
    *
    * Possible Value | Description
    * ---------------|------------
    * anonymous | An error will be returned when a secure resource is requested.
    * auto | The user will be signed in when a secure resource is requested.
    * immediate | The user will be signed in when the Portal is loaded.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authMode)
    *
    * @default auto
    */
  var authMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of trusted servers to send credentials to when making Cross-Origin Resource Sharing (CORS) requests to access services secured with web-tier authentication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authorizedCrossOriginDomains)
    */
  var authorizedCrossOriginDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The query that defines the basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is not true. The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method does this automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery)
    */
  var basemapGalleryGroupQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Bing key to use for web maps using Bing Maps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#bingKey)
    */
  var bingKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether an organization can list applications in the marketplace .
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListApps)
    */
  var canListApps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether an organization can list data services in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListData)
    */
  var canListData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether an organization can list pre-provisioned items in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListPreProvisionedItems)
    */
  var canListPreProvisionedItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether an organization can provision direct purchases in the marketplace without customer request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canProvisionDirectPurchase)
    */
  var canProvisionDirectPurchase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true`, the organization's public items, groups and users are included in search queries. When `false`, no public items outside of the organization are included. However, public items which are part of the organization are included.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSearchPublic)
    *
    * @default true
    */
  var canSearchPublic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Bing key can be shared to the public and is returned as part of a portal's description call (`/sharing/rest/portals/<orgid>`). This requires the access of the portal to be set to public. The canShareBingPublic property is not returned publicly but only shown to users within the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canShareBingPublic)
    *
    * @default false
    */
  var canShareBingPublic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true`, members of the organization can share resources outside the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSharePublic)
    *
    * @default false
    */
  var canSharePublic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the ArcGIS sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInArcGIS)
    *
    * @default false
    */
  var canSignInArcGIS: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the enterprise sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInIDP)
    *
    * @default false
    */
  var canSignInIDP: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The query that identifies the group containing the color sets used for rendering in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#colorSetsGroupQuery)
    */
  var colorSetsGroupQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether to allow the organization to disable commenting. When commentsEnabled is false, comments are hidden and not removed. numComments are set to zero for all items in the organization. Calls to add a comment and view comments will fail. If the organization re-enables comments, the comments display and numComments are restored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#commentsEnabled)
    *
    * @default false
    */
  var commentsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Date the organization was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.undefined
  /**
    * The default locale (language and country) information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#culture)
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The custom base URL for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#customBaseUrl)
    */
  var customBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default basemap to use for the portal. Used in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap)
    */
  var defaultBasemap: js.UndefOr[BasemapProperties] = js.undefined
  /**
    * The default extent to use for the portal. Used in the map viewer. The extent will be in the default basemap's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultExtent)
    */
  var defaultExtent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * The default vector basemap to use for the portal. Used in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap)
    */
  var defaultVectorBasemap: js.UndefOr[BasemapProperties] = js.undefined
  /**
    * A description of the organization/portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean value indicating whether to opt-in to the [Esri User Experience Improvement (EUEI) program](https://doc.arcgis.com/en/arcgis-online/reference/faq.htm#ESRI_QUESTIONANSWER_AED97F28DCD84F7682623C2FA9E5CE49).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#eueiEnabled)
    *
    * @default false
    */
  var eueiEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The featured groups for the portal. Returns an array of objects that provide access to the owner and title for each featured group. Each item in this array has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var featuredGroups: js.UndefOr[js.Array[PortalFeaturedGroups]] = js.undefined
  /**
    * The query that defines the featured group. If null, then the most viewed items in the organization will be the featured items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredItemsGroupQuery)
    */
  var featuredItemsGroupQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The query that identifies the group containing features items for the gallery. Set a Group ID or, if null, then the most viewed items in your organization are displayed in the gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#galleryTemplatesGroupQuery)
    */
  var galleryTemplatesGroupQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the organization has content categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#hasCategorySchema)
    *
    * @default false
    */
  var hasCategorySchema: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Helper services provided by the portal. For the detailed information about these services, see the [about utility services](https://server.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm) topic from the ArcGIS Server documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#helperServices)
    */
  var helperServices: js.UndefOr[js.Any] = js.undefined
  /**
    * The group that contains featured content to be displayed on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContent)
    */
  var homePageFeaturedContent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of featured items that can be displayed on the home page. The max is 100. Accepts integers only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContentCount)
    */
  var homePageFeaturedContentCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The port used by the portal for HTTP communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpPort)
    */
  var httpPort: js.UndefOr[scala.Double] = js.undefined
  /**
    * The port used by the portal for HTTPS communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpsPort)
    */
  var httpsPort: js.UndefOr[scala.Double] = js.undefined
  /**
    * The id of the organization that owns this portal. If `null` then this is the default portal for anonymous and non-organizational users.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#id)
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The country code of the calling IP (ArcGIS Online only).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#ipCntryCode)
    */
  var ipCntryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates if the portal is on-premises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isPortal)
    */
  var isPortal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The query that identifies the group containing editing templates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#layerTemplatesGroupQuery)
    */
  var layerTemplatesGroupQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum validity in minutes of tokens issued for users of the organization. -1 is the default and is a special value that indicates infinite timeout or permanent tokens. For tokens granted using OAuth 2.0 authorization grant, it represents the maximum validity of refresh tokens. For access tokens, the maximum validity is the lower of two weeks or this value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#maxTokenExpirationMinutes)
    */
  var maxTokenExpirationMinutes: js.UndefOr[scala.Double] = js.undefined
  /**
    * Date the organization was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#modified)
    */
  var modified: js.UndefOr[DateProperties] = js.undefined
  /**
    * Name of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL of the portal host.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalHostname)
    */
  var portalHostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The portal mode.  **Possible Values:** multitenant | singletenant
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalMode)
    */
  var portalMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Properties specific to the organization, for example the "contact us" link. If the organization is public, the properties are visible to the anonymous user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalProperties)
    */
  var portalProperties: js.UndefOr[js.Any] = js.undefined
  /**
    * The region for the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#region)
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom HTML for the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#rotatorPanels)
    */
  var rotatorPanels: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Indicates whether the description of your organization displays on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#showHomePageDescription)
    */
  var showHomePageDescription: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether hosted services are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#supportsHostedServices)
    *
    * @default false
    */
  var supportsHostedServices: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The query that defines the symbols sets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#symbolSetsGroupQuery)
    */
  var symbolSetsGroupQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The query that defines the collection of templates that will appear in the template gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#templatesGroupQuery)
    */
  var templatesGroupQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the units of measure for the organization's users. The user default is derived from the organization's [region](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#region).  **Possible Values:** english | metric
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#units)
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL to the portal instance. Setting the location of the portal instance via [esriConfig.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) should be used in favor of setting it directly on this property.  If using an on-premise portal, the syntax should look similar to: `https://www.example.com/arcgis`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#url)
    *
    * @default {@link module:esri/config#portalUrl esriConfig.portalUrl}
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The prefix selected by the organization's administrator to be used with the customBaseURL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#urlKey)
    */
  var urlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `true`, only simple where clauses that are compliant with SQL92 can be used when querying layers and tables. The recommended security setting is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useStandardizedQuery)
    */
  var useStandardizedQuery: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true`, the organization has opted in to use the vector tile basemaps, and (a) [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery) should be used instead of [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery), while (b) [defaultVectorBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap) should be used instead of [defaultBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap). The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method automatically uses vectorBasemapGalleryGroupQuery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps)
    */
  var useVectorBasemaps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Information representing a registered user of the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#user)
    */
  var user: js.UndefOr[PortalUserProperties] = js.undefined
  /**
    * The query that defines the vector tiles basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is true. The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method does this automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery)
    */
  var vectorBasemapGalleryGroupQuery: js.UndefOr[java.lang.String] = js.undefined
}

object PortalProperties {
  @scala.inline
  def apply(
    access: java.lang.String = null,
    allSSL: js.UndefOr[scala.Boolean] = js.undefined,
    authMode: java.lang.String = null,
    authorizedCrossOriginDomains: js.Array[java.lang.String] = null,
    basemapGalleryGroupQuery: java.lang.String = null,
    bingKey: java.lang.String = null,
    canListApps: js.UndefOr[scala.Boolean] = js.undefined,
    canListData: js.UndefOr[scala.Boolean] = js.undefined,
    canListPreProvisionedItems: js.UndefOr[scala.Boolean] = js.undefined,
    canProvisionDirectPurchase: js.UndefOr[scala.Boolean] = js.undefined,
    canSearchPublic: js.UndefOr[scala.Boolean] = js.undefined,
    canShareBingPublic: js.UndefOr[scala.Boolean] = js.undefined,
    canSharePublic: js.UndefOr[scala.Boolean] = js.undefined,
    canSignInArcGIS: js.UndefOr[scala.Boolean] = js.undefined,
    canSignInIDP: js.UndefOr[scala.Boolean] = js.undefined,
    colorSetsGroupQuery: java.lang.String = null,
    commentsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    created: DateProperties = null,
    culture: java.lang.String = null,
    customBaseUrl: java.lang.String = null,
    defaultBasemap: BasemapProperties = null,
    defaultExtent: ExtentProperties = null,
    defaultVectorBasemap: BasemapProperties = null,
    description: java.lang.String = null,
    eueiEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    featuredGroups: js.Array[PortalFeaturedGroups] = null,
    featuredItemsGroupQuery: java.lang.String = null,
    galleryTemplatesGroupQuery: java.lang.String = null,
    hasCategorySchema: js.UndefOr[scala.Boolean] = js.undefined,
    helperServices: js.Any = null,
    homePageFeaturedContent: java.lang.String = null,
    homePageFeaturedContentCount: scala.Int | scala.Double = null,
    httpPort: scala.Int | scala.Double = null,
    httpsPort: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    ipCntryCode: java.lang.String = null,
    isPortal: js.UndefOr[scala.Boolean] = js.undefined,
    layerTemplatesGroupQuery: java.lang.String = null,
    maxTokenExpirationMinutes: scala.Int | scala.Double = null,
    modified: DateProperties = null,
    name: java.lang.String = null,
    portalHostname: java.lang.String = null,
    portalMode: java.lang.String = null,
    portalProperties: js.Any = null,
    region: java.lang.String = null,
    rotatorPanels: js.Array[_] = null,
    showHomePageDescription: js.UndefOr[scala.Boolean] = js.undefined,
    supportsHostedServices: js.UndefOr[scala.Boolean] = js.undefined,
    symbolSetsGroupQuery: java.lang.String = null,
    templatesGroupQuery: java.lang.String = null,
    units: java.lang.String = null,
    url: java.lang.String = null,
    urlKey: java.lang.String = null,
    useStandardizedQuery: js.UndefOr[scala.Boolean] = js.undefined,
    useVectorBasemaps: js.UndefOr[scala.Boolean] = js.undefined,
    user: PortalUserProperties = null,
    vectorBasemapGalleryGroupQuery: java.lang.String = null
  ): PortalProperties = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (!js.isUndefined(allSSL)) __obj.updateDynamic("allSSL")(allSSL)
    if (authMode != null) __obj.updateDynamic("authMode")(authMode)
    if (authorizedCrossOriginDomains != null) __obj.updateDynamic("authorizedCrossOriginDomains")(authorizedCrossOriginDomains)
    if (basemapGalleryGroupQuery != null) __obj.updateDynamic("basemapGalleryGroupQuery")(basemapGalleryGroupQuery)
    if (bingKey != null) __obj.updateDynamic("bingKey")(bingKey)
    if (!js.isUndefined(canListApps)) __obj.updateDynamic("canListApps")(canListApps)
    if (!js.isUndefined(canListData)) __obj.updateDynamic("canListData")(canListData)
    if (!js.isUndefined(canListPreProvisionedItems)) __obj.updateDynamic("canListPreProvisionedItems")(canListPreProvisionedItems)
    if (!js.isUndefined(canProvisionDirectPurchase)) __obj.updateDynamic("canProvisionDirectPurchase")(canProvisionDirectPurchase)
    if (!js.isUndefined(canSearchPublic)) __obj.updateDynamic("canSearchPublic")(canSearchPublic)
    if (!js.isUndefined(canShareBingPublic)) __obj.updateDynamic("canShareBingPublic")(canShareBingPublic)
    if (!js.isUndefined(canSharePublic)) __obj.updateDynamic("canSharePublic")(canSharePublic)
    if (!js.isUndefined(canSignInArcGIS)) __obj.updateDynamic("canSignInArcGIS")(canSignInArcGIS)
    if (!js.isUndefined(canSignInIDP)) __obj.updateDynamic("canSignInIDP")(canSignInIDP)
    if (colorSetsGroupQuery != null) __obj.updateDynamic("colorSetsGroupQuery")(colorSetsGroupQuery)
    if (!js.isUndefined(commentsEnabled)) __obj.updateDynamic("commentsEnabled")(commentsEnabled)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (customBaseUrl != null) __obj.updateDynamic("customBaseUrl")(customBaseUrl)
    if (defaultBasemap != null) __obj.updateDynamic("defaultBasemap")(defaultBasemap)
    if (defaultExtent != null) __obj.updateDynamic("defaultExtent")(defaultExtent)
    if (defaultVectorBasemap != null) __obj.updateDynamic("defaultVectorBasemap")(defaultVectorBasemap)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(eueiEnabled)) __obj.updateDynamic("eueiEnabled")(eueiEnabled)
    if (featuredGroups != null) __obj.updateDynamic("featuredGroups")(featuredGroups)
    if (featuredItemsGroupQuery != null) __obj.updateDynamic("featuredItemsGroupQuery")(featuredItemsGroupQuery)
    if (galleryTemplatesGroupQuery != null) __obj.updateDynamic("galleryTemplatesGroupQuery")(galleryTemplatesGroupQuery)
    if (!js.isUndefined(hasCategorySchema)) __obj.updateDynamic("hasCategorySchema")(hasCategorySchema)
    if (helperServices != null) __obj.updateDynamic("helperServices")(helperServices)
    if (homePageFeaturedContent != null) __obj.updateDynamic("homePageFeaturedContent")(homePageFeaturedContent)
    if (homePageFeaturedContentCount != null) __obj.updateDynamic("homePageFeaturedContentCount")(homePageFeaturedContentCount.asInstanceOf[js.Any])
    if (httpPort != null) __obj.updateDynamic("httpPort")(httpPort.asInstanceOf[js.Any])
    if (httpsPort != null) __obj.updateDynamic("httpsPort")(httpsPort.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipCntryCode != null) __obj.updateDynamic("ipCntryCode")(ipCntryCode)
    if (!js.isUndefined(isPortal)) __obj.updateDynamic("isPortal")(isPortal)
    if (layerTemplatesGroupQuery != null) __obj.updateDynamic("layerTemplatesGroupQuery")(layerTemplatesGroupQuery)
    if (maxTokenExpirationMinutes != null) __obj.updateDynamic("maxTokenExpirationMinutes")(maxTokenExpirationMinutes.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (portalHostname != null) __obj.updateDynamic("portalHostname")(portalHostname)
    if (portalMode != null) __obj.updateDynamic("portalMode")(portalMode)
    if (portalProperties != null) __obj.updateDynamic("portalProperties")(portalProperties)
    if (region != null) __obj.updateDynamic("region")(region)
    if (rotatorPanels != null) __obj.updateDynamic("rotatorPanels")(rotatorPanels)
    if (!js.isUndefined(showHomePageDescription)) __obj.updateDynamic("showHomePageDescription")(showHomePageDescription)
    if (!js.isUndefined(supportsHostedServices)) __obj.updateDynamic("supportsHostedServices")(supportsHostedServices)
    if (symbolSetsGroupQuery != null) __obj.updateDynamic("symbolSetsGroupQuery")(symbolSetsGroupQuery)
    if (templatesGroupQuery != null) __obj.updateDynamic("templatesGroupQuery")(templatesGroupQuery)
    if (units != null) __obj.updateDynamic("units")(units)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urlKey != null) __obj.updateDynamic("urlKey")(urlKey)
    if (!js.isUndefined(useStandardizedQuery)) __obj.updateDynamic("useStandardizedQuery")(useStandardizedQuery)
    if (!js.isUndefined(useVectorBasemaps)) __obj.updateDynamic("useVectorBasemaps")(useVectorBasemaps)
    if (user != null) __obj.updateDynamic("user")(user)
    if (vectorBasemapGalleryGroupQuery != null) __obj.updateDynamic("vectorBasemapGalleryGroupQuery")(vectorBasemapGalleryGroupQuery)
    __obj.asInstanceOf[PortalProperties]
  }
}

