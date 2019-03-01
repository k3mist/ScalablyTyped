package typings
package atPulumiAwsLib.sqsQueuePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuePolicyState extends js.Object {
  /**
    * The JSON policy for the SQS queue. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object QueuePolicyState {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    queueUrl: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): QueuePolicyState = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (queueUrl != null) __obj.updateDynamic("queueUrl")(queueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuePolicyState]
  }
}

