package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of buckets to return in a single response. The service will use this parameter or 1,000 items, whichever is smaller. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** A previously-returned page token representing part of the larger set of results to view. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Filter results to buckets whose names begin with this prefix. */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** A valid API project identifier. */
  var project: java.lang.String
  /** Set of properties to return. Defaults to noAcl. */
  var projection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The project to be billed for this request, for Requester Pays buckets. */
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFieldsKey {
  @scala.inline
  def apply(
    project: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prefix: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    projection: java.lang.String = null,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null,
    userProject: java.lang.String = null
  ): Anon_AltFieldsKey = {
    val __obj = js.Dynamic.literal(project = project)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[Anon_AltFieldsKey]
  }
}

