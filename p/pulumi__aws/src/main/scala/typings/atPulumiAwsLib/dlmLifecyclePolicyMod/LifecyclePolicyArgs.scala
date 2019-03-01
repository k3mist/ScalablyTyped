package typings
package atPulumiAwsLib.dlmLifecyclePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyArgs extends js.Object {
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * See the `policy_details` configuration block. Max of 1.
    */
  val policyDetails: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyResourceTypesSchedules]
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    executionRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    policyDetails: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyResourceTypesSchedules],
    state: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], policyDetails = policyDetails.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
}

