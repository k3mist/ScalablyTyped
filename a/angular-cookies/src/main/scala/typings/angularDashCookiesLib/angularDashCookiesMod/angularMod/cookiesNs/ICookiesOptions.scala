package typings
package angularDashCookiesLib.angularDashCookiesMod.angularMod.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cookies options
  * see https://docs.angularjs.org/api/ngCookies/provider/$cookiesProvider#defaults
  */
trait ICookiesOptions extends js.Object {
  /**
    * The cookie will be available only for this domain and its sub-domains.
    * For obvious security reasons the user agent will not accept the cookie if the
    * current domain is not a sub domain or equals to the requested domain.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String of the form "Wdy, DD Mon YYYY HH:MM:SS GMT" or a Date object
    * indicating the exact date/time this cookie will expire.
    */
  var expires: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /**
    * The cookie will be available only for this path and its sub-paths.
    * By default, this would be the URL that appears in your base tag.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The cookie will be available only in secured connection.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object ICookiesOptions {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    expires: java.lang.String | stdLib.Date = null,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): ICookiesOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[ICookiesOptions]
  }
}

