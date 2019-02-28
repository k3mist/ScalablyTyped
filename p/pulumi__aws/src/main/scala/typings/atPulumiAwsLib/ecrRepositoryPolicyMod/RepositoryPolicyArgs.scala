package typings
package atPulumiAwsLib.ecrRepositoryPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryPolicyArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string. For more information about building IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html)
    */
  val policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Name of the repository to apply the policy.
    */
  val repository: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

