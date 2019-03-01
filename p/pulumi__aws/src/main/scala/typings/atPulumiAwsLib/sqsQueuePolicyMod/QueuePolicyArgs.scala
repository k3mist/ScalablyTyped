package typings
package atPulumiAwsLib.sqsQueuePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuePolicyArgs extends js.Object {
  /**
    * The JSON policy for the SQS queue. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object QueuePolicyArgs {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    queueUrl: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): QueuePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], queueUrl = queueUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueuePolicyArgs]
  }
}

