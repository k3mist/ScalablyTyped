package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyVerifyCustomTokenRequest extends js.Object {
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[scala.Boolean] = js.undefined
  /** The custom token to verify */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartyVerifyCustomTokenRequest {
  @scala.inline
  def apply(
    delegatedProjectNumber: java.lang.String = null,
    instanceId: java.lang.String = null,
    returnSecureToken: js.UndefOr[scala.Boolean] = js.undefined,
    token: java.lang.String = null
  ): IdentitytoolkitRelyingpartyVerifyCustomTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyCustomTokenRequest]
  }
}

