package typings
package atPulumiAwsLib.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codepipeline", "Webhook")
@js.native
class Webhook protected ()
  extends atPulumiAwsLib.codepipelineWebhookMod.Webhook {
  /**
    * Create a Webhook resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.codepipelineWebhookMod.WebhookArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.codepipelineWebhookMod.WebhookArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/codepipeline", "Webhook")
@js.native
object Webhook extends js.Object {
  /**
    * Get an existing Webhook resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codepipelineWebhookMod.Webhook = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codepipelineWebhookMod.WebhookState
  ): atPulumiAwsLib.codepipelineWebhookMod.Webhook = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codepipelineWebhookMod.WebhookState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codepipelineWebhookMod.Webhook = js.native
}

