package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BurstLimitRateLimit extends js.Object {
  var burstLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var rateLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_BurstLimitRateLimit {
  @scala.inline
  def apply(
    burstLimit: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    rateLimit: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_BurstLimitRateLimit = {
    val __obj = js.Dynamic.literal()
    if (burstLimit != null) __obj.updateDynamic("burstLimit")(burstLimit.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BurstLimitRateLimit]
  }
}

