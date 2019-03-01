package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeRequest extends js.Object {
  var authTokenExpiredError: js.UndefOr[nodeLib.Error] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: socketclusterDashServerLib.scserversocketMod.namespaced
  var waitForAuth: js.UndefOr[scala.Boolean] = js.undefined
}

object SubscribeRequest {
  @scala.inline
  def apply(
    socket: socketclusterDashServerLib.scserversocketMod.namespaced,
    authTokenExpiredError: nodeLib.Error = null,
    channel: java.lang.String = null,
    data: js.Any = null,
    waitForAuth: js.UndefOr[scala.Boolean] = js.undefined
  ): SubscribeRequest = {
    val __obj = js.Dynamic.literal(socket = socket)
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(waitForAuth)) __obj.updateDynamic("waitForAuth")(waitForAuth)
    __obj.asInstanceOf[SubscribeRequest]
  }
}

