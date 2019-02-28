package typings
package atPulumiAwsLib.iamGroupPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPolicyAttachmentState extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamGroupMod.Group]] = js.undefined
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
}

