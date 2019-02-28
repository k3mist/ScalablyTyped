package typings
package atPulumiAwsLib.ec2VpnConnectionRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionRouteArgs extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

