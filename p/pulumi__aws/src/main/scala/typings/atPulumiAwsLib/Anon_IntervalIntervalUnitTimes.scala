package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntervalIntervalUnitTimes extends js.Object {
  var interval: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var intervalUnit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var times: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_IntervalIntervalUnitTimes {
  @scala.inline
  def apply(
    interval: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    intervalUnit: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    times: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_IntervalIntervalUnitTimes = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (intervalUnit != null) __obj.updateDynamic("intervalUnit")(intervalUnit.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IntervalIntervalUnitTimes]
  }
}

