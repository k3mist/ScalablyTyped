package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionKeyLocation extends js.Object {
  var encryptionKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_IdTypeInput]] = js.undefined
  var location: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_EncryptionKeyLocation {
  @scala.inline
  def apply(
    location: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    encryptionKey: atPulumiPulumiLib.resourceMod.Input[Anon_IdTypeInput] = null
  ): Anon_EncryptionKeyLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionKeyLocation]
  }
}

