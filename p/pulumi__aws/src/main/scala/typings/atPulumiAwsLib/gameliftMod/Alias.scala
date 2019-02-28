package typings
package atPulumiAwsLib.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/gamelift", "Alias")
@js.native
class Alias protected ()
  extends atPulumiAwsLib.gameliftAliasMod.Alias {
  /**
    * Create a Alias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.gameliftAliasMod.AliasArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.gameliftAliasMod.AliasArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/gamelift", "Alias")
@js.native
object Alias extends js.Object {
  /**
    * Get an existing Alias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.gameliftAliasMod.Alias = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.gameliftAliasMod.AliasState
  ): atPulumiAwsLib.gameliftAliasMod.Alias = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.gameliftAliasMod.AliasState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.gameliftAliasMod.Alias = js.native
}

