package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeCreditIncludeDiscount extends js.Object {
  var includeCredit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeDiscount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeOtherSubscription: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeRecurring: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeRefund: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeSubscription: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeSupport: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeTax: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeUpfront: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var useAmortized: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var useBlended: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object Anon_IncludeCreditIncludeDiscount {
  @scala.inline
  def apply(
    includeCredit: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeDiscount: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeOtherSubscription: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeRecurring: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeRefund: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeSubscription: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeSupport: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeTax: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeUpfront: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    useAmortized: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    useBlended: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_IncludeCreditIncludeDiscount = {
    val __obj = js.Dynamic.literal()
    if (includeCredit != null) __obj.updateDynamic("includeCredit")(includeCredit.asInstanceOf[js.Any])
    if (includeDiscount != null) __obj.updateDynamic("includeDiscount")(includeDiscount.asInstanceOf[js.Any])
    if (includeOtherSubscription != null) __obj.updateDynamic("includeOtherSubscription")(includeOtherSubscription.asInstanceOf[js.Any])
    if (includeRecurring != null) __obj.updateDynamic("includeRecurring")(includeRecurring.asInstanceOf[js.Any])
    if (includeRefund != null) __obj.updateDynamic("includeRefund")(includeRefund.asInstanceOf[js.Any])
    if (includeSubscription != null) __obj.updateDynamic("includeSubscription")(includeSubscription.asInstanceOf[js.Any])
    if (includeSupport != null) __obj.updateDynamic("includeSupport")(includeSupport.asInstanceOf[js.Any])
    if (includeTax != null) __obj.updateDynamic("includeTax")(includeTax.asInstanceOf[js.Any])
    if (includeUpfront != null) __obj.updateDynamic("includeUpfront")(includeUpfront.asInstanceOf[js.Any])
    if (useAmortized != null) __obj.updateDynamic("useAmortized")(useAmortized.asInstanceOf[js.Any])
    if (useBlended != null) __obj.updateDynamic("useBlended")(useBlended.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeCreditIncludeDiscount]
  }
}

