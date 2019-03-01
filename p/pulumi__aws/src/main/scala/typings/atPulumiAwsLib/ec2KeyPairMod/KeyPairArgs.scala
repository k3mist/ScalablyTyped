package typings
package atPulumiAwsLib.ec2KeyPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairArgs extends js.Object {
  /**
    * The name for the key pair.
    */
  val keyName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `key_name`.
    */
  val keyNamePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The public key material.
    */
  val publicKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object KeyPairArgs {
  @scala.inline
  def apply(
    publicKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    keyName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    keyNamePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): KeyPairArgs = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (keyNamePrefix != null) __obj.updateDynamic("keyNamePrefix")(keyNamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairArgs]
  }
}

