package typings
package atPulumiAwsLib.iamUserPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPolicyAttachmentArgs extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * The user the policy should be applied to
    */
  val user: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamUserMod.User]
}

object UserPolicyAttachmentArgs {
  @scala.inline
  def apply(
    policyArn: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN],
    user: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamUserMod.User]
  ): UserPolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserPolicyAttachmentArgs]
  }
}

