package typings
package gapiDotClientDotPeopleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of connections to include in the response. Valid values are
    * between 1 and 2000, inclusive. Defaults to 100.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** The token of the page to be returned. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * &#42;&#42;Required.&#42;&#42; A field mask to restrict which fields on each person are
    * returned. Valid values are:
    *
    * &#42; addresses
    * &#42; ageRanges
    * &#42; biographies
    * &#42; birthdays
    * &#42; braggingRights
    * &#42; coverPhotos
    * &#42; emailAddresses
    * &#42; events
    * &#42; genders
    * &#42; imClients
    * &#42; interests
    * &#42; locales
    * &#42; memberships
    * &#42; metadata
    * &#42; names
    * &#42; nicknames
    * &#42; occupations
    * &#42; organizations
    * &#42; phoneNumbers
    * &#42; photos
    * &#42; relations
    * &#42; relationshipInterests
    * &#42; relationshipStatuses
    * &#42; residences
    * &#42; skills
    * &#42; taglines
    * &#42; urls
    */
  var personFields: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * &#42;&#42;Required.&#42;&#42; Comma-separated list of person fields to be included in the
    * response. Each path should start with `person.`: for example,
    * `person.names` or `person.photos`.
    */
  var `requestMask.includeField`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the response should include a sync token, which can be used to get
    * all changes since the last request.
    */
  var requestSyncToken: js.UndefOr[scala.Boolean] = js.undefined
  /** The resource name to return connections for. Only `people/me` is valid. */
  var resourceName: java.lang.String
  /**
    * The order in which the connections should be sorted. Defaults to
    * `LAST_MODIFIED_ASCENDING`.
    */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A sync token, returned by a previous call to `people.connections.list`.
    * Only resources changed since the sync token was created will be returned.
    */
  var syncToken: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken {
  @scala.inline
  def apply(
    resourceName: java.lang.String,
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    personFields: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    `requestMask.includeField`: java.lang.String = null,
    requestSyncToken: js.UndefOr[scala.Boolean] = js.undefined,
    sortOrder: java.lang.String = null,
    syncToken: java.lang.String = null,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null
  ): Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken = {
    val __obj = js.Dynamic.literal(resourceName = resourceName)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (personFields != null) __obj.updateDynamic("personFields")(personFields)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (`requestMask.includeField` != null) __obj.updateDynamic("requestMask.includeField")(`requestMask.includeField`)
    if (!js.isUndefined(requestSyncToken)) __obj.updateDynamic("requestSyncToken")(requestSyncToken)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    __obj.asInstanceOf[Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken]
  }
}

