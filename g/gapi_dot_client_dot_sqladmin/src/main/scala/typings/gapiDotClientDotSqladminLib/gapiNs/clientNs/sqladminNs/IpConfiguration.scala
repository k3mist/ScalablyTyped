package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpConfiguration extends js.Object {
  /**
    * The list of external networks that are allowed to connect to the instance using the IP. In CIDR notation, also known as 'slash' notation (e.g.
    * 192.168.100.0/24).
    */
  var authorizedNetworks: js.UndefOr[js.Array[AclEntry]] = js.undefined
  /** Whether the instance should be assigned an IP address or not. */
  var ipv4Enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether SSL connections over IP should be enforced or not. */
  var requireSsl: js.UndefOr[scala.Boolean] = js.undefined
}

object IpConfiguration {
  @scala.inline
  def apply(
    authorizedNetworks: js.Array[AclEntry] = null,
    ipv4Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    requireSsl: js.UndefOr[scala.Boolean] = js.undefined
  ): IpConfiguration = {
    val __obj = js.Dynamic.literal()
    if (authorizedNetworks != null) __obj.updateDynamic("authorizedNetworks")(authorizedNetworks)
    if (!js.isUndefined(ipv4Enabled)) __obj.updateDynamic("ipv4Enabled")(ipv4Enabled)
    if (!js.isUndefined(requireSsl)) __obj.updateDynamic("requireSsl")(requireSsl)
    __obj.asInstanceOf[IpConfiguration]
  }
}

