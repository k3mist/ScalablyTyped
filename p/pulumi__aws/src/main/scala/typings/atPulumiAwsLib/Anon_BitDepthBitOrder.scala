package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BitDepthBitOrder extends js.Object {
  var bitDepth: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var bitOrder: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var profile: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var signed: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_BitDepthBitOrder {
  @scala.inline
  def apply(
    bitDepth: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    bitOrder: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    profile: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    signed: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BitDepthBitOrder = {
    val __obj = js.Dynamic.literal()
    if (bitDepth != null) __obj.updateDynamic("bitDepth")(bitDepth.asInstanceOf[js.Any])
    if (bitOrder != null) __obj.updateDynamic("bitOrder")(bitOrder.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (signed != null) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BitDepthBitOrder]
  }
}

