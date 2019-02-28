package typings
package atPulumiAwsLib.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "EventSourceMapping")
@js.native
class EventSourceMapping protected ()
  extends atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping {
  /**
    * Create a EventSourceMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lambda", "EventSourceMapping")
@js.native
object EventSourceMapping extends js.Object {
  /**
    * Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingState
  ): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
}

