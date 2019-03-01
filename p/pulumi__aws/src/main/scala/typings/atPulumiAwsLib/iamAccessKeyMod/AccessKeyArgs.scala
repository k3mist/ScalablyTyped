package typings
package atPulumiAwsLib.iamAccessKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessKeyArgs extends js.Object {
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`.
    */
  val pgpKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM user to associate with this access key.
    */
  val user: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object AccessKeyArgs {
  @scala.inline
  def apply(
    user: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    pgpKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): AccessKeyArgs = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    if (pgpKey != null) __obj.updateDynamic("pgpKey")(pgpKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyArgs]
  }
}

