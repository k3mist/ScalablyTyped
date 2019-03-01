package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTcpServerPermission extends js.Object {
  /**
    * The host:port pattern for listen operations.
    * *:* are allowed
    */
  var listen: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object SocketTcpServerPermission {
  @scala.inline
  def apply(listen: java.lang.String | js.Array[java.lang.String] = null): SocketTcpServerPermission = {
    val __obj = js.Dynamic.literal()
    if (listen != null) __obj.updateDynamic("listen")(listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTcpServerPermission]
  }
}

