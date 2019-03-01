package typings
package atPulumiAwsLib.cloudwatchEventTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated of the target.
    */
  val arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
    */
  val batchTarget: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ArraySizeJobAttempts]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
    */
  val ecsTarget: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_GroupLaunchType]] = js.undefined
  /**
    * Valid JSON text passed to the target.
    */
  val input: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The value of the [JSONPath](http://goessner.net/articles/JsonPath/)
    * that is used for extracting part of the matched event when passing it to the target.
    */
  val inputPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Parameters used when you are providing a custom input to a target based on certain event data.
    */
  val inputTransformer: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_InputPathsInputTemplate]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
    */
  val kinesisTarget: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PartitionKeyPathInput]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the rule you want to add targets to.
    */
  val rule: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
    */
  val runCommandTargets: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]
    ]
  ] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
    */
  val sqsTarget: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MessageGroupIdInput]] = js.undefined
  /**
    * The unique target assignment ID.  If missing, will generate a random, unique id.
    */
  val targetId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object EventTargetArgs {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    rule: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    batchTarget: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ArraySizeJobAttempts] = null,
    ecsTarget: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_GroupLaunchType] = null,
    input: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    inputPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    inputTransformer: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_InputPathsInputTemplate] = null,
    kinesisTarget: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PartitionKeyPathInput] = null,
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    runCommandTargets: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]
    ] = null,
    sqsTarget: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MessageGroupIdInput] = null,
    targetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): EventTargetArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    if (batchTarget != null) __obj.updateDynamic("batchTarget")(batchTarget.asInstanceOf[js.Any])
    if (ecsTarget != null) __obj.updateDynamic("ecsTarget")(ecsTarget.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputPath != null) __obj.updateDynamic("inputPath")(inputPath.asInstanceOf[js.Any])
    if (inputTransformer != null) __obj.updateDynamic("inputTransformer")(inputTransformer.asInstanceOf[js.Any])
    if (kinesisTarget != null) __obj.updateDynamic("kinesisTarget")(kinesisTarget.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (runCommandTargets != null) __obj.updateDynamic("runCommandTargets")(runCommandTargets.asInstanceOf[js.Any])
    if (sqsTarget != null) __obj.updateDynamic("sqsTarget")(sqsTarget.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetArgs]
  }
}

