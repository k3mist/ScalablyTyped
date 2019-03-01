package typings
package atPulumiAwsLib.ec2VpnGatewayAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnGatewayAttachmentArgs extends js.Object {
  /**
    * The ID of the VPC.
    */
  val vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object VpnGatewayAttachmentArgs {
  @scala.inline
  def apply(
    vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    vpnGatewayId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): VpnGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpnGatewayAttachmentArgs]
  }
}

