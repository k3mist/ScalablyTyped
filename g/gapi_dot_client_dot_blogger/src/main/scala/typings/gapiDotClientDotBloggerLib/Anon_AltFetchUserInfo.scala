package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFetchUserInfo extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the response is a list of blogs with per-user information instead of just blogs. */
  var fetchUserInfo: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User access types for blogs to include in the results, e.g. AUTHOR will return blogs where the user has author level access. If no roles are specified,
    * defaults to ADMIN and AUTHOR roles.
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** Blog statuses to include in the result (default: Live blogs only). Note that ADMIN access is required to view deleted blogs. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the user whose blogs are to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier. */
  var userId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** Access level with which to view the blogs. Note that some fields require elevated access. */
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFetchUserInfo {
  @scala.inline
  def apply(
    userId: java.lang.String,
    alt: java.lang.String = null,
    fetchUserInfo: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    role: java.lang.String = null,
    status: java.lang.String = null,
    userIp: java.lang.String = null,
    view: java.lang.String = null
  ): Anon_AltFetchUserInfo = {
    val __obj = js.Dynamic.literal(userId = userId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(fetchUserInfo)) __obj.updateDynamic("fetchUserInfo")(fetchUserInfo)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (role != null) __obj.updateDynamic("role")(role)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Anon_AltFetchUserInfo]
  }
}

