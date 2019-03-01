package typings
package gapiDotClientDotAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCustomerIdDate extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the customer for which the data is to be fetched. */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the date in yyyy-mm-dd format for which the data is to be fetched. */
  var date: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the set of filters including parameter operator value. */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. Maximum allowed is 1000 */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Token to specify next page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the application name, parameter name pairs to fetch in csv as app_name1:param_name1, app_name2:param_name2. */
  var parameters: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the profile id or the user email for which the data should be filtered. */
  var userKey: java.lang.String
}

object Anon_AltCustomerIdDate {
  @scala.inline
  def apply(
    date: java.lang.String,
    userKey: java.lang.String,
    alt: java.lang.String = null,
    customerId: java.lang.String = null,
    fields: java.lang.String = null,
    filters: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    parameters: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCustomerIdDate = {
    val __obj = js.Dynamic.literal(date = date, userKey = userKey)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCustomerIdDate]
  }
}

