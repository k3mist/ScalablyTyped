package typings
package atPulumiAwsLib.ec2VpnGatewayAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment")
@js.native
class VpnGatewayAttachment protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpnGatewayAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpnGatewayAttachmentArgs) = this()
  def this(name: java.lang.String, args: VpnGatewayAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ID of the VPC.
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment")
@js.native
object VpnGatewayAttachment extends js.Object {
  /**
    * Get an existing VpnGatewayAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachmentState
  ): atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpnGatewayAttachmentMod.VpnGatewayAttachment = js.native
}

