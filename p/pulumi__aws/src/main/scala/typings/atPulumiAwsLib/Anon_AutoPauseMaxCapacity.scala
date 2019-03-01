package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoPauseMaxCapacity extends js.Object {
  var autoPause: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var maxCapacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var minCapacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var secondsUntilAutoPause: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_AutoPauseMaxCapacity {
  @scala.inline
  def apply(
    autoPause: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    maxCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    minCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    secondsUntilAutoPause: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_AutoPauseMaxCapacity = {
    val __obj = js.Dynamic.literal()
    if (autoPause != null) __obj.updateDynamic("autoPause")(autoPause.asInstanceOf[js.Any])
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    if (secondsUntilAutoPause != null) __obj.updateDynamic("secondsUntilAutoPause")(secondsUntilAutoPause.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoPauseMaxCapacity]
  }
}

