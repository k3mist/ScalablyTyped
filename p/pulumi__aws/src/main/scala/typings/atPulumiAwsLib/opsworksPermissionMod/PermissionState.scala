package typings
package atPulumiAwsLib.opsworksPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionState extends js.Object {
  /**
    * Whether the user is allowed to use SSH to communicate with the instance
    */
  val allowSsh: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether the user is allowed to use sudo to elevate privileges
    */
  val allowSudo: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
    */
  val level: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The stack to set the permissions for
    */
  val stackId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The user's IAM ARN to set permissions for
    */
  val userArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object PermissionState {
  @scala.inline
  def apply(
    allowSsh: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    allowSudo: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    level: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    stackId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    userArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): PermissionState = {
    val __obj = js.Dynamic.literal()
    if (allowSsh != null) __obj.updateDynamic("allowSsh")(allowSsh.asInstanceOf[js.Any])
    if (allowSudo != null) __obj.updateDynamic("allowSudo")(allowSudo.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (userArn != null) __obj.updateDynamic("userArn")(userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionState]
  }
}

