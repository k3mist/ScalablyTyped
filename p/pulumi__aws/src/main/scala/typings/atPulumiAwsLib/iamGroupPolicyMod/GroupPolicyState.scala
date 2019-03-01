package typings
package atPulumiAwsLib.iamGroupPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPolicyState extends js.Object {
  /**
    * The IAM group to attach to the policy.
    */
  val group: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the policy. If omitted, Terraform will
    * assign a random, unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The policy document. This is a JSON formatted string. For more information about building IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html)
    */
  val policy: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
  ] = js.undefined
}

object GroupPolicyState {
  @scala.inline
  def apply(
    group: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument] = null
  ): GroupPolicyState = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyState]
  }
}

