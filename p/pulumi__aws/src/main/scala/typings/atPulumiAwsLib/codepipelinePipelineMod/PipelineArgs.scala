package typings
package atPulumiAwsLib.codepipelinePipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineArgs extends js.Object {
  /**
    * An artifact_store block. Artifact stores are documented below.
    * * `stage` (Minimum of at least two `stage` blocks is required) A stage block. Stages are documented below.
    */
  val artifactStore: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EncryptionKeyLocation]
  /**
    * The name of the pipeline.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  val roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  val stages: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActionsName]]]
}

object PipelineArgs {
  @scala.inline
  def apply(
    artifactStore: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EncryptionKeyLocation],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    stages: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActionsName]]],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): PipelineArgs = {
    val __obj = js.Dynamic.literal(artifactStore = artifactStore.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArgs]
  }
}

