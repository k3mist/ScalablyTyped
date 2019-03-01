package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinimumLengthRequireLowercase extends js.Object {
  var minimumLength: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var requireLowercase: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var requireNumbers: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var requireSymbols: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var requireUppercase: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object Anon_MinimumLengthRequireLowercase {
  @scala.inline
  def apply(
    minimumLength: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    requireLowercase: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    requireNumbers: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    requireSymbols: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    requireUppercase: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_MinimumLengthRequireLowercase = {
    val __obj = js.Dynamic.literal()
    if (minimumLength != null) __obj.updateDynamic("minimumLength")(minimumLength.asInstanceOf[js.Any])
    if (requireLowercase != null) __obj.updateDynamic("requireLowercase")(requireLowercase.asInstanceOf[js.Any])
    if (requireNumbers != null) __obj.updateDynamic("requireNumbers")(requireNumbers.asInstanceOf[js.Any])
    if (requireSymbols != null) __obj.updateDynamic("requireSymbols")(requireSymbols.asInstanceOf[js.Any])
    if (requireUppercase != null) __obj.updateDynamic("requireUppercase")(requireUppercase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MinimumLengthRequireLowercase]
  }
}

