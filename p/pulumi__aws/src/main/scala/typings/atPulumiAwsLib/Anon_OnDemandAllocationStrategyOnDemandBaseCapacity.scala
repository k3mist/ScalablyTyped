package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnDemandAllocationStrategyOnDemandBaseCapacity extends js.Object {
  var onDemandAllocationStrategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var onDemandBaseCapacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var onDemandPercentageAboveBaseCapacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var spotAllocationStrategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var spotInstancePools: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var spotMaxPrice: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_OnDemandAllocationStrategyOnDemandBaseCapacity {
  @scala.inline
  def apply(
    onDemandAllocationStrategy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    onDemandBaseCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    onDemandPercentageAboveBaseCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    spotAllocationStrategy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    spotInstancePools: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    spotMaxPrice: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_OnDemandAllocationStrategyOnDemandBaseCapacity = {
    val __obj = js.Dynamic.literal()
    if (onDemandAllocationStrategy != null) __obj.updateDynamic("onDemandAllocationStrategy")(onDemandAllocationStrategy.asInstanceOf[js.Any])
    if (onDemandBaseCapacity != null) __obj.updateDynamic("onDemandBaseCapacity")(onDemandBaseCapacity.asInstanceOf[js.Any])
    if (onDemandPercentageAboveBaseCapacity != null) __obj.updateDynamic("onDemandPercentageAboveBaseCapacity")(onDemandPercentageAboveBaseCapacity.asInstanceOf[js.Any])
    if (spotAllocationStrategy != null) __obj.updateDynamic("spotAllocationStrategy")(spotAllocationStrategy.asInstanceOf[js.Any])
    if (spotInstancePools != null) __obj.updateDynamic("spotInstancePools")(spotInstancePools.asInstanceOf[js.Any])
    if (spotMaxPrice != null) __obj.updateDynamic("spotMaxPrice")(spotMaxPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnDemandAllocationStrategyOnDemandBaseCapacity]
  }
}

