package typings
package atPulumiAwsLib.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks", "RailsAppLayer")
@js.native
class RailsAppLayer protected ()
  extends atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayer {
  /**
    * Create a RailsAppLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayerArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/opsworks", "RailsAppLayer")
@js.native
object RailsAppLayer extends js.Object {
  /**
    * Get an existing RailsAppLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayerState
  ): atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayer = js.native
}

