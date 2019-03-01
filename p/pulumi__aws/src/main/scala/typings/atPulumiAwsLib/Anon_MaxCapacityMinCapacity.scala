package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxCapacityMinCapacity extends js.Object {
  var maxCapacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var minCapacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_MaxCapacityMinCapacity {
  @scala.inline
  def apply(
    maxCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    minCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_MaxCapacityMinCapacity = {
    val __obj = js.Dynamic.literal()
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxCapacityMinCapacity]
  }
}

