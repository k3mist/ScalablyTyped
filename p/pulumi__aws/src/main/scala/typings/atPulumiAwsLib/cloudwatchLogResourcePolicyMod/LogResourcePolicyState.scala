package typings
package atPulumiAwsLib.cloudwatchLogResourcePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogResourcePolicyState extends js.Object {
  /**
    * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
    */
  val policyDocument: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the resource policy.
    */
  val policyName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object LogResourcePolicyState {
  @scala.inline
  def apply(
    policyDocument: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    policyName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): LogResourcePolicyState = {
    val __obj = js.Dynamic.literal()
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogResourcePolicyState]
  }
}

