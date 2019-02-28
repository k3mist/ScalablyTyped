package typings
package atPulumiAwsLib.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "EventRule")
@js.native
class EventRule protected ()
  extends atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule {
  /**
    * Create a EventRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventRuleMod.EventRuleArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventRuleMod.EventRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch", "EventRule")
@js.native
object EventRule extends js.Object {
  /**
    * Get an existing EventRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchEventRuleMod.EventRuleState
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchEventRuleMod.EventRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
}

