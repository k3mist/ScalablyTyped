package typings
package atPulumiAwsLib.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "UserPolicyAttachment")
@js.native
class UserPolicyAttachment protected ()
  extends atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment {
  /**
    * Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iam", "UserPolicyAttachment")
@js.native
object UserPolicyAttachment extends js.Object {
  /**
    * Get an existing UserPolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentState
  ): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
}

