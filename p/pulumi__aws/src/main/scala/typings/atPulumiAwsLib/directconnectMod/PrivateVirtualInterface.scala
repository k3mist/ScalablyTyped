package typings
package atPulumiAwsLib.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface")
@js.native
class PrivateVirtualInterface protected ()
  extends atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface {
  /**
    * Create a PrivateVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface")
@js.native
object PrivateVirtualInterface extends js.Object {
  /**
    * Get an existing PrivateVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceState
  ): atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
}

