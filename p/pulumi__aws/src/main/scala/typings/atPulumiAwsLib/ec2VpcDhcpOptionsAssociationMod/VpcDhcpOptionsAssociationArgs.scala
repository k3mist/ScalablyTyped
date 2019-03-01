package typings
package atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcDhcpOptionsAssociationArgs extends js.Object {
  /**
    * The ID of the DHCP Options Set to associate to the VPC.
    */
  val dhcpOptionsId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the VPC to which we would like to associate a DHCP Options Set.
    */
  val vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object VpcDhcpOptionsAssociationArgs {
  @scala.inline
  def apply(
    dhcpOptionsId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): VpcDhcpOptionsAssociationArgs = {
    val __obj = js.Dynamic.literal(dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcDhcpOptionsAssociationArgs]
  }
}

