package typings
package atPulumiAwsLib.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "Gateway")
@js.native
class Gateway protected ()
  extends atPulumiAwsLib.directconnectGatewayMod.Gateway {
  /**
    * Create a Gateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.directconnectGatewayMod.GatewayArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.directconnectGatewayMod.GatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "Gateway")
@js.native
object Gateway extends js.Object {
  /**
    * Get an existing Gateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectGatewayMod.Gateway = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectGatewayMod.GatewayState
  ): atPulumiAwsLib.directconnectGatewayMod.Gateway = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectGatewayMod.GatewayState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectGatewayMod.Gateway = js.native
}

