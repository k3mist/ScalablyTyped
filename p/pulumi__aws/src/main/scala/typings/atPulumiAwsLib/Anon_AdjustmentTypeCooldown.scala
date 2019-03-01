package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustmentTypeCooldown extends js.Object {
  var adjustmentType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var cooldown: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var metricAggregationType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var minAdjustmentMagnitude: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var stepAdjustments: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[Anon_MetricIntervalLowerBoundMetricIntervalUpperBound]
      ]
    ]
  ] = js.undefined
}

object Anon_AdjustmentTypeCooldown {
  @scala.inline
  def apply(
    adjustmentType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    cooldown: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    metricAggregationType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    minAdjustmentMagnitude: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    stepAdjustments: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[Anon_MetricIntervalLowerBoundMetricIntervalUpperBound]
      ]
    ] = null
  ): Anon_AdjustmentTypeCooldown = {
    val __obj = js.Dynamic.literal()
    if (adjustmentType != null) __obj.updateDynamic("adjustmentType")(adjustmentType.asInstanceOf[js.Any])
    if (cooldown != null) __obj.updateDynamic("cooldown")(cooldown.asInstanceOf[js.Any])
    if (metricAggregationType != null) __obj.updateDynamic("metricAggregationType")(metricAggregationType.asInstanceOf[js.Any])
    if (minAdjustmentMagnitude != null) __obj.updateDynamic("minAdjustmentMagnitude")(minAdjustmentMagnitude.asInstanceOf[js.Any])
    if (stepAdjustments != null) __obj.updateDynamic("stepAdjustments")(stepAdjustments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdjustmentTypeCooldown]
  }
}

