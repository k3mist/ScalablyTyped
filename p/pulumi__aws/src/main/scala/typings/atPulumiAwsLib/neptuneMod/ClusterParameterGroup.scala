package typings
package atPulumiAwsLib.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune", "ClusterParameterGroup")
@js.native
class ClusterParameterGroup protected ()
  extends atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroup {
  /**
    * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroupArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/neptune", "ClusterParameterGroup")
@js.native
object ClusterParameterGroup extends js.Object {
  /**
    * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroupState
  ): atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
}

