package typings
package atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceSecurityGroupAttachmentArgs extends js.Object {
  /**
    * The ID of the network interface to attach to.
    */
  val networkInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the security group.
    */
  val securityGroupId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object NetworkInterfaceSecurityGroupAttachmentArgs {
  @scala.inline
  def apply(
    networkInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    securityGroupId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): NetworkInterfaceSecurityGroupAttachmentArgs = {
    val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentArgs]
  }
}

