package typings
package atPulumiAwsLib.ec2clientvpnNetworkAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAssociationArgs extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object NetworkAssociationArgs {
  @scala.inline
  def apply(
    clientVpnEndpointId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    subnetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): NetworkAssociationArgs = {
    val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkAssociationArgs]
  }
}

