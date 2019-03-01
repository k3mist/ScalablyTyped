package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeSendHeadersResponse extends js.Object {
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When provided, request will be made with these headers.
    */
  var requestHeaders: js.UndefOr[RequestHeaders] = js.undefined
}

object OnBeforeSendHeadersResponse {
  @scala.inline
  def apply(cancel: js.UndefOr[scala.Boolean] = js.undefined, requestHeaders: RequestHeaders = null): OnBeforeSendHeadersResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    __obj.asInstanceOf[OnBeforeSendHeadersResponse]
  }
}

