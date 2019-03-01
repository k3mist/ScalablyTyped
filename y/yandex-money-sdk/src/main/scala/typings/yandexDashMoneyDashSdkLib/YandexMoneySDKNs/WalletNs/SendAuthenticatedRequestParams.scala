package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAuthenticatedRequestParams extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var url: java.lang.String
}

object SendAuthenticatedRequestParams {
  @scala.inline
  def apply(url: java.lang.String, data: js.Any = null, headers: js.Any = null): SendAuthenticatedRequestParams = {
    val __obj = js.Dynamic.literal(url = url)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[SendAuthenticatedRequestParams]
  }
}

