package typings
package atPulumiAwsLib.iamPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentArgs extends js.Object {
  /**
    * The group(s) the policy should be applied to
    */
  val groups: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamGroupMod.Group]]]
  ] = js.undefined
  /**
    * The name of the attachment. This cannot be an empty string.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * The role(s) the policy should be applied to
    */
  val roles: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamRoleMod.Role]]]
  ] = js.undefined
  /**
    * The user(s) the policy should be applied to
    */
  val users: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamUserMod.User]]]
  ] = js.undefined
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(
    policyArn: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN],
    groups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamGroupMod.Group]]] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    roles: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamRoleMod.Role]]] = null,
    users: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamUserMod.User]]] = null
  ): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
}

