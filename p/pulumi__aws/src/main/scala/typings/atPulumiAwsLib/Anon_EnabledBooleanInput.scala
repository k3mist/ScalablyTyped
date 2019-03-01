package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledBooleanInput extends js.Object {
  var enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object Anon_EnabledBooleanInput {
  @scala.inline
  def apply(enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null): Anon_EnabledBooleanInput = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledBooleanInput]
  }
}

