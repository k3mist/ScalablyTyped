package typings
package chromeDashAppsLib.chromeNs.socketsNs.tcpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureOptions extends js.Object {
  /**
    * The minimum and maximum acceptable versions of TLS.
    * These will be tls1, tls1.1, or tls1.2.
    * *Note*
    * tls1.3 should be supported from Chrome 67.
    * @see[TLS Info and support table]{@link https://en.wikipedia.org/wiki/Transport_Layer_Security#TLS_1.3}
    */
  var tlsVersion: js.UndefOr[chromeDashAppsLib.Anon_Max] = js.undefined
}

object SecureOptions {
  @scala.inline
  def apply(tlsVersion: chromeDashAppsLib.Anon_Max = null): SecureOptions = {
    val __obj = js.Dynamic.literal()
    if (tlsVersion != null) __obj.updateDynamic("tlsVersion")(tlsVersion)
    __obj.asInstanceOf[SecureOptions]
  }
}

