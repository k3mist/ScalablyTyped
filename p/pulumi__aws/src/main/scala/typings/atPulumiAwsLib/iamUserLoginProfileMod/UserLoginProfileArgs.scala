package typings
package atPulumiAwsLib.iamUserLoginProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLoginProfileArgs extends js.Object {
  /**
    * The length of the generated
    * password.
    */
  val passwordLength: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * Whether the
    * user should be forced to reset the generated password on first login.
    */
  val passwordResetRequired: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:username`.
    */
  val pgpKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The IAM user's name.
    */
  val user: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object UserLoginProfileArgs {
  @scala.inline
  def apply(
    pgpKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    user: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    passwordLength: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    passwordResetRequired: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): UserLoginProfileArgs = {
    val __obj = js.Dynamic.literal(pgpKey = pgpKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (passwordLength != null) __obj.updateDynamic("passwordLength")(passwordLength.asInstanceOf[js.Any])
    if (passwordResetRequired != null) __obj.updateDynamic("passwordResetRequired")(passwordResetRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLoginProfileArgs]
  }
}

