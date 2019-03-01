package typings
package cookieDashSessionLib.CookieSessionInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSessionOptions extends js.Object {
  /**
    * a string indicating the domain of the cookie (no default).
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a Date object indicating the cookie's expiration date (expires at the end of session by default).
    */
  var expires: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * a boolean indicating whether the cookie is only to be sent over HTTP(S), and not made available to client JavaScript (true by default).
    */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The list of keys to use to sign & verify cookie values. Set cookies are always signed with keys[0], while the other keys are valid for verification, allowing for key rotation.
    */
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * a number representing the milliseconds from Date.now() for expiry.
    */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the cookie to set, defaults to session.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a boolean indicating whether to overwrite previously set cookies of the same name (true by default). If this is true, all cookies set during the same request with the same name (regardless of path or domain) are filtered out of the Set-Cookie header when setting this cookie.
    */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * a string indicating the path of the cookie (/ by default).
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a boolean or string indicating whether the cookie is a "same site" cookie (false by default). This can be set to 'strict', 'lax', or true (which maps to 'strict').
    */
  var sameSite: js.UndefOr[
    cookieDashSessionLib.cookieDashSessionLibStrings.strict | cookieDashSessionLib.cookieDashSessionLibStrings.lax | scala.Boolean
  ] = js.undefined
  /**
    * A string which will be used as single key if keys is not provided.
    */
  var secret: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a boolean indicating whether the cookie is only to be sent over HTTPS (false by default for HTTP, true by default for HTTPS).
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * a boolean indicating whether the cookie is only to be sent over HTTPS (use this if you handle SSL not in your node process).
    */
  var secureProxy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * a boolean indicating whether the cookie is to be signed (true by default). If this is true, another cookie of the same name with the .sig suffix appended will also be sent, with a 27-byte url-safe base64 SHA1 value representing the hash of cookie-name=cookie-value against the
    * first Keygrip key. This signature key is used to detect tampering the next time a cookie is received.
    */
  var signed: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieSessionOptions {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    expires: stdLib.Date = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    keys: js.Array[java.lang.String] = null,
    maxAge: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    sameSite: cookieDashSessionLib.cookieDashSessionLibStrings.strict | cookieDashSessionLib.cookieDashSessionLibStrings.lax | scala.Boolean = null,
    secret: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    secureProxy: js.UndefOr[scala.Boolean] = js.undefined,
    signed: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(secureProxy)) __obj.updateDynamic("secureProxy")(secureProxy)
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[CookieSessionOptions]
  }
}

