package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAuthOptions extends js.Object {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[Auth0LockAuthParamsOptions] = js.undefined
  var redirect: js.UndefOr[scala.Boolean] = js.undefined
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  var responseMode: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var sso: js.UndefOr[scala.Boolean] = js.undefined
}

object Auth0LockAuthOptions {
  @scala.inline
  def apply(
    audience: java.lang.String = null,
    params: Auth0LockAuthParamsOptions = null,
    redirect: js.UndefOr[scala.Boolean] = js.undefined,
    redirectUrl: java.lang.String = null,
    responseMode: java.lang.String = null,
    responseType: java.lang.String = null,
    sso: js.UndefOr[scala.Boolean] = js.undefined
  ): Auth0LockAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (!js.isUndefined(sso)) __obj.updateDynamic("sso")(sso)
    __obj.asInstanceOf[Auth0LockAuthOptions]
  }
}

