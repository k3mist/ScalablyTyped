package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledKmsKeyIdBoolean extends js.Object {
  var enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  var kmsKeyId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_EnabledKmsKeyIdBoolean {
  @scala.inline
  def apply(
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    kmsKeyId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_EnabledKmsKeyIdBoolean = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledKmsKeyIdBoolean]
  }
}

