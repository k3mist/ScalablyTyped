package typings
package atPulumiAwsLib.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codepipeline", "Pipeline")
@js.native
class Pipeline protected ()
  extends atPulumiAwsLib.codepipelinePipelineMod.Pipeline {
  /**
    * Create a Pipeline resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.codepipelinePipelineMod.PipelineArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.codepipelinePipelineMod.PipelineArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/codepipeline", "Pipeline")
@js.native
object Pipeline extends js.Object {
  /**
    * Get an existing Pipeline resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codepipelinePipelineMod.Pipeline = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codepipelinePipelineMod.PipelineState
  ): atPulumiAwsLib.codepipelinePipelineMod.Pipeline = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codepipelinePipelineMod.PipelineState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codepipelinePipelineMod.Pipeline = js.native
}

