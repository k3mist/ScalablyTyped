package typings
package atPulumiAwsLib.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks", "RdsDbInstance")
@js.native
class RdsDbInstance protected ()
  extends atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstance {
  /**
    * Create a RdsDbInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstanceArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/opsworks", "RdsDbInstance")
@js.native
object RdsDbInstance extends js.Object {
  /**
    * Get an existing RdsDbInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstanceState
  ): atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
}

