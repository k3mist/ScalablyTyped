package typings
package atPulumiAwsLib.ec2VpnConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionState extends js.Object {
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format).
    */
  val customerGatewayConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val routes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DestinationCidrBlockSource]
      ]
    ]
  ] = js.undefined
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Tags to apply to the connection.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The public IP address of the first VPN tunnel.
    */
  val tunnel1Address: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The bgp asn number of the first VPN tunnel.
    */
  val tunnel1BgpAsn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The bgp holdtime of the first VPN tunnel.
    */
  val tunnel1BgpHoldtime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
    */
  val tunnel1CgwInsideAddress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
    */
  val tunnel1VgwInsideAddress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The public IP address of the second VPN tunnel.
    */
  val tunnel2Address: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The bgp asn number of the second VPN tunnel.
    */
  val tunnel2BgpAsn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The bgp holdtime of the second VPN tunnel.
    */
  val tunnel2BgpHoldtime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
    */
  val tunnel2CgwInsideAddress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The CIDR block of the second IP addresses for the first VPN tunnel.
    */
  val tunnel2InsideCidr: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
    */
  val tunnel2VgwInsideAddress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val vgwTelemetries: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AcceptedRouteCountLastStatusChange]
      ]
    ]
  ] = js.undefined
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object VpnConnectionState {
  @scala.inline
  def apply(
    customerGatewayConfiguration: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    customerGatewayId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    routes: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DestinationCidrBlockSource]
      ]
    ] = null,
    staticRoutesOnly: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    transitGatewayId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel1Address: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel1BgpAsn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel1BgpHoldtime: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    tunnel1CgwInsideAddress: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel1InsideCidr: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel1PresharedKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel1VgwInsideAddress: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel2Address: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel2BgpAsn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel2BgpHoldtime: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    tunnel2CgwInsideAddress: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel2InsideCidr: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel2PresharedKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tunnel2VgwInsideAddress: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    vgwTelemetries: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AcceptedRouteCountLastStatusChange]
      ]
    ] = null,
    vpnGatewayId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): VpnConnectionState = {
    val __obj = js.Dynamic.literal()
    if (customerGatewayConfiguration != null) __obj.updateDynamic("customerGatewayConfiguration")(customerGatewayConfiguration.asInstanceOf[js.Any])
    if (customerGatewayId != null) __obj.updateDynamic("customerGatewayId")(customerGatewayId.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (staticRoutesOnly != null) __obj.updateDynamic("staticRoutesOnly")(staticRoutesOnly.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    if (tunnel1Address != null) __obj.updateDynamic("tunnel1Address")(tunnel1Address.asInstanceOf[js.Any])
    if (tunnel1BgpAsn != null) __obj.updateDynamic("tunnel1BgpAsn")(tunnel1BgpAsn.asInstanceOf[js.Any])
    if (tunnel1BgpHoldtime != null) __obj.updateDynamic("tunnel1BgpHoldtime")(tunnel1BgpHoldtime.asInstanceOf[js.Any])
    if (tunnel1CgwInsideAddress != null) __obj.updateDynamic("tunnel1CgwInsideAddress")(tunnel1CgwInsideAddress.asInstanceOf[js.Any])
    if (tunnel1InsideCidr != null) __obj.updateDynamic("tunnel1InsideCidr")(tunnel1InsideCidr.asInstanceOf[js.Any])
    if (tunnel1PresharedKey != null) __obj.updateDynamic("tunnel1PresharedKey")(tunnel1PresharedKey.asInstanceOf[js.Any])
    if (tunnel1VgwInsideAddress != null) __obj.updateDynamic("tunnel1VgwInsideAddress")(tunnel1VgwInsideAddress.asInstanceOf[js.Any])
    if (tunnel2Address != null) __obj.updateDynamic("tunnel2Address")(tunnel2Address.asInstanceOf[js.Any])
    if (tunnel2BgpAsn != null) __obj.updateDynamic("tunnel2BgpAsn")(tunnel2BgpAsn.asInstanceOf[js.Any])
    if (tunnel2BgpHoldtime != null) __obj.updateDynamic("tunnel2BgpHoldtime")(tunnel2BgpHoldtime.asInstanceOf[js.Any])
    if (tunnel2CgwInsideAddress != null) __obj.updateDynamic("tunnel2CgwInsideAddress")(tunnel2CgwInsideAddress.asInstanceOf[js.Any])
    if (tunnel2InsideCidr != null) __obj.updateDynamic("tunnel2InsideCidr")(tunnel2InsideCidr.asInstanceOf[js.Any])
    if (tunnel2PresharedKey != null) __obj.updateDynamic("tunnel2PresharedKey")(tunnel2PresharedKey.asInstanceOf[js.Any])
    if (tunnel2VgwInsideAddress != null) __obj.updateDynamic("tunnel2VgwInsideAddress")(tunnel2VgwInsideAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vgwTelemetries != null) __obj.updateDynamic("vgwTelemetries")(vgwTelemetries.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionState]
  }
}

