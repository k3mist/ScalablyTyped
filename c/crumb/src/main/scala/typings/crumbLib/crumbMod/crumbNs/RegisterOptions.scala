package typings
package crumbLib.crumbMod.crumbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends js.Object {
  /**
    * Whether to automatically add the crumb to view contexts as the given key.
    *
    * @default true
    */
  var addToViewContext: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to automatically generate a new crumb for requests.
    *
    * @default true
    */
  var autoGenerate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Storage options for the cookie containing the crumb
    *
    * @default { path: '/' }
    */
  var cookieOptions: js.UndefOr[hapiLib.hapiMod.ServerStateCookieOptions] = js.undefined
  /**
    * Using enforce with false will set the CSRF header cookie but won't execute the validation.
    *
    * @default true
    */
  var enforce: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the name of the custom CSRF header.
    *
    * @default 'X-CSRF-Token'
    */
  var headerName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the cookie to store the CSRF crumb into.
    *
    * @default 'crumb'
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to add to the request log with tag 'crumb' and data 'validation failed'.
    *
    * @default false
    */
  var logUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * RESTful mode that validates crumb tokens from 'X-CSRF-Token' request header for POST, PUT, PATCH and DELETE server routes.
    * Disables payload/query crumb validation.
    *
    * @default false
    */
  var restful: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The length of the crumb to generate.
    * See {@link https://github.com/hapijs/cryptiles cryptiles} for more information.
    *
    * @default 43
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function which when provided, is called for every request.
    * If the provided function returns true, validation and generation of crumb is skipped.
    *
    * @default false
    */
  var skip: js.UndefOr[scala.Boolean | SkipFunction] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(
    addToViewContext: js.UndefOr[scala.Boolean] = js.undefined,
    autoGenerate: js.UndefOr[scala.Boolean] = js.undefined,
    cookieOptions: hapiLib.hapiMod.ServerStateCookieOptions = null,
    enforce: js.UndefOr[scala.Boolean] = js.undefined,
    headerName: java.lang.String = null,
    key: java.lang.String = null,
    logUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    restful: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    skip: scala.Boolean | SkipFunction = null
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToViewContext)) __obj.updateDynamic("addToViewContext")(addToViewContext)
    if (!js.isUndefined(autoGenerate)) __obj.updateDynamic("autoGenerate")(autoGenerate)
    if (cookieOptions != null) __obj.updateDynamic("cookieOptions")(cookieOptions)
    if (!js.isUndefined(enforce)) __obj.updateDynamic("enforce")(enforce)
    if (headerName != null) __obj.updateDynamic("headerName")(headerName)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(logUnauthorized)) __obj.updateDynamic("logUnauthorized")(logUnauthorized)
    if (!js.isUndefined(restful)) __obj.updateDynamic("restful")(restful)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOptions]
  }
}

