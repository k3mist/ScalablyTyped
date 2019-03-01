package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelsScopedList extends js.Object {
  /** List of vpn tunnels contained in this scope. */
  var vpnTunnels: js.UndefOr[js.Array[VpnTunnel]] = js.undefined
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object VpnTunnelsScopedList {
  @scala.inline
  def apply(vpnTunnels: js.Array[VpnTunnel] = null, warning: gapiDotClientDotComputeLib.Anon_Code = null): VpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    if (vpnTunnels != null) __obj.updateDynamic("vpnTunnels")(vpnTunnels)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[VpnTunnelsScopedList]
  }
}

