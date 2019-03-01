package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://auth0.com/docs/libraries/lock/v10/sending-authentication-parameters
trait Auth0LockAuthParamsOptions extends js.Object {
  var access_token: js.UndefOr[js.Any] = js.undefined
  var connection_scopes: js.UndefOr[js.Any] = js.undefined
  var device: js.UndefOr[js.Any] = js.undefined
  var nonce: js.UndefOr[js.Any] = js.undefined
  var protocol: js.UndefOr[js.Any] = js.undefined
  var request_id: js.UndefOr[js.Any] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Auth0LockAuthParamsOptions {
  @scala.inline
  def apply(
    access_token: js.Any = null,
    connection_scopes: js.Any = null,
    device: js.Any = null,
    nonce: js.Any = null,
    protocol: js.Any = null,
    request_id: js.Any = null,
    scope: java.lang.String = null,
    state: java.lang.String = null
  ): Auth0LockAuthParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (connection_scopes != null) __obj.updateDynamic("connection_scopes")(connection_scopes)
    if (device != null) __obj.updateDynamic("device")(device)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Auth0LockAuthParamsOptions]
  }
}

