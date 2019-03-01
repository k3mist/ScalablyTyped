package typings
package gapiDotClientDotCivicinfoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressAlt extends js.Object {
  /** The address to look up. May only be specified if the field ocdId is not given in the URL. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to return information about offices and officials. If false, only the top-level district information will be returned. */
  var includeOffices: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching
    * office will not be returned.
    */
  var levels: js.UndefOr[java.lang.String] = js.undefined
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
    * A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will
    * not be returned.
    */
  var roles: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AddressAlt {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    includeOffices: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    levels: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    roles: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AddressAlt = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeOffices)) __obj.updateDynamic("includeOffices")(includeOffices)
    if (key != null) __obj.updateDynamic("key")(key)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AddressAlt]
  }
}

