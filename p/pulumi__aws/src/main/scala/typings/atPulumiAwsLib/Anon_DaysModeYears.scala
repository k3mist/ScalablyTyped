package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysModeYears extends js.Object {
  var days: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var mode: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var years: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_DaysModeYears {
  @scala.inline
  def apply(
    mode: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    days: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    years: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_DaysModeYears = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysModeYears]
  }
}

