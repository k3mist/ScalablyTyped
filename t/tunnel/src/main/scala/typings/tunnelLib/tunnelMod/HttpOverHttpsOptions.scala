package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOverHttpsOptions extends HttpOptions {
  @JSName("proxy")
  var proxy_HttpOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.undefined
}

object HttpOverHttpsOptions {
  @scala.inline
  def apply(maxSockets: scala.Int | scala.Double = null, proxy: HttpsProxyOptions = null): HttpOverHttpsOptions = {
    val __obj = js.Dynamic.literal()
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[HttpOverHttpsOptions]
  }
}

