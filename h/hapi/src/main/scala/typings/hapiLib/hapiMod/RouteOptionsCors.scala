package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsCors extends js.Object {
  /**
    * a strings array of additional headers to exposedHeaders. Use this to keep the default headers in place.
    */
  var additionalExposedHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * a strings array of additional headers to headers. Use this to keep the default headers in place.
    */
  var additionalHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * if true, allows user credentials to be sent ('Access-Control-Allow-Credentials'). Defaults to false.
    */
  var credentials: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * a strings array of exposed headers ('Access-Control-Expose-Headers'). Defaults to ['WWW-Authenticate', 'Server-Authorization'].
    */
  var exposedHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * a strings array of allowed headers ('Access-Control-Allow-Headers'). Defaults to ['Accept', 'Authorization', 'Content-Type', 'If-None-Match'].
    */
  var headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * number of seconds the browser should cache the CORS response ('Access-Control-Max-Age'). The greater the value, the longer it will take before the browser checks for changes in policy.
    * Defaults to 86400 (one day).
    */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /**
    * an array of allowed origin servers strings ('Access-Control-Allow-Origin'). The array can contain any combination of fully qualified origins along with origin strings containing a wildcard '*'
    * character, or a single '*' origin string. If set to 'ignore', any incoming Origin header is ignored (present or not) and the 'Access-Control-Allow-Origin' header is set to '*'. Defaults to any
    * origin ['*'].
    */
  var origin: js.UndefOr[
    js.Array[java.lang.String] | hapiLib.hapiLibStrings.`*` | hapiLib.hapiLibStrings.ignore
  ] = js.undefined
}

object RouteOptionsCors {
  @scala.inline
  def apply(
    additionalExposedHeaders: js.Array[java.lang.String] = null,
    additionalHeaders: js.Array[java.lang.String] = null,
    credentials: js.UndefOr[scala.Boolean] = js.undefined,
    exposedHeaders: js.Array[java.lang.String] = null,
    headers: js.Array[java.lang.String] = null,
    maxAge: scala.Int | scala.Double = null,
    origin: js.Array[java.lang.String] | hapiLib.hapiLibStrings.`*` | hapiLib.hapiLibStrings.ignore = null
  ): RouteOptionsCors = {
    val __obj = js.Dynamic.literal()
    if (additionalExposedHeaders != null) __obj.updateDynamic("additionalExposedHeaders")(additionalExposedHeaders)
    if (additionalHeaders != null) __obj.updateDynamic("additionalHeaders")(additionalHeaders)
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials)
    if (exposedHeaders != null) __obj.updateDynamic("exposedHeaders")(exposedHeaders)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsCors]
  }
}

