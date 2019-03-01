package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainExpirationDate extends js.Object {
  /** The domain of the cookie. If omitted, the cookie becomes a host-only cookie. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie
    * becomes a session cookie.
    */
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  /**
    * The first-party domain of the cookie. This attribute is required if First-Party Isolation is enabled.
    */
  var firstPartyDomain: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the cookie should be marked as HttpOnly. Defaults to false. */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the cookie. Empty by default if omitted. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The path of the cookie. Defaults to the path portion of the url parameter. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** The cookie's same-site status. */
  var sameSite: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.SameSiteStatus] = js.undefined
  /** Whether the cookie should be marked as Secure. Defaults to false. */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current
    * execution context's cookie store.
    */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The request-URI to associate with the setting of the cookie. This value can affect the default domain and
    * path values of the created cookie. If host permissions for this URL are not specified in the manifest file,
    * the API call will fail.
    */
  var url: java.lang.String
  /** The value of the cookie. Empty by default if omitted. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DomainExpirationDate {
  @scala.inline
  def apply(
    url: java.lang.String,
    domain: java.lang.String = null,
    expirationDate: scala.Int | scala.Double = null,
    firstPartyDomain: java.lang.String = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    path: java.lang.String = null,
    sameSite: firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.SameSiteStatus = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    storeId: java.lang.String = null,
    value: java.lang.String = null
  ): Anon_DomainExpirationDate = {
    val __obj = js.Dynamic.literal(url = url)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (firstPartyDomain != null) __obj.updateDynamic("firstPartyDomain")(firstPartyDomain)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_DomainExpirationDate]
  }
}

