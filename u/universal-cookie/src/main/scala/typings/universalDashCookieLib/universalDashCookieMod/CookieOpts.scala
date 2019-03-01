package typings
package universalDashCookieLib.universalDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOpts extends js.Object {
  /**
    * domain for the cookie (sub.domain.com or .allsubdomains.com)
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * absolute expiration date for the cookie
    */
  var expires: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Is only the server can access the cookie?
    */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * relative max age of the cookie from when the client receives it in second
    */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /**
    * cookie path, use / as the path if you want your cookie to be accessible on all pages
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Is only accessible through HTTPS?
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieOpts {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    expires: stdLib.Date = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieOpts = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[CookieOpts]
  }
}

