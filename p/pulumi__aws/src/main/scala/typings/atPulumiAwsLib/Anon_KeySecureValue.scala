package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySecureValue extends js.Object {
  var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var secure: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_KeySecureValue {
  @scala.inline
  def apply(
    key: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    value: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    secure: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_KeySecureValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeySecureValue]
  }
}

