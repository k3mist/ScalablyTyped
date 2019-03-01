package typings
package atPulumiAwsLib.autoscalingPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyArgs extends js.Object {
  /**
    * Specifies whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
    */
  val adjustmentType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the autoscaling group.
    */
  val autoscalingGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
    */
  val cooldown: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The estimated time, in seconds, until a newly launched instance will contribute CloudWatch metrics. Without a value, AWS will default to the group's specified cooldown period.
    */
  val estimatedInstanceWarmup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
    */
  val metricAggregationType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val minAdjustmentMagnitude: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * Use `min_adjustment_magnitude` instead.
    */
  val minAdjustmentStep: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The name of the dimension.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The policy type, either "SimpleScaling", "StepScaling" or "TargetTrackingScaling". If this value isn't provided, AWS will default to "SimpleScaling."
    */
  val policyType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  val scalingAdjustment: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  val stepAdjustments: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MetricIntervalLowerBoundMetricIntervalUpperBound]
      ]
    ]
  ] = js.undefined
  /**
    * A target tracking policy. These have the following structure:
    */
  val targetTrackingConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue
    ]
  ] = js.undefined
}

object PolicyArgs {
  @scala.inline
  def apply(
    autoscalingGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    adjustmentType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    cooldown: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    estimatedInstanceWarmup: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    metricAggregationType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    minAdjustmentMagnitude: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    minAdjustmentStep: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    policyType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    scalingAdjustment: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    stepAdjustments: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MetricIntervalLowerBoundMetricIntervalUpperBound]
      ]
    ] = null,
    targetTrackingConfiguration: atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue
    ] = null
  ): PolicyArgs = {
    val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any])
    if (adjustmentType != null) __obj.updateDynamic("adjustmentType")(adjustmentType.asInstanceOf[js.Any])
    if (cooldown != null) __obj.updateDynamic("cooldown")(cooldown.asInstanceOf[js.Any])
    if (estimatedInstanceWarmup != null) __obj.updateDynamic("estimatedInstanceWarmup")(estimatedInstanceWarmup.asInstanceOf[js.Any])
    if (metricAggregationType != null) __obj.updateDynamic("metricAggregationType")(metricAggregationType.asInstanceOf[js.Any])
    if (minAdjustmentMagnitude != null) __obj.updateDynamic("minAdjustmentMagnitude")(minAdjustmentMagnitude.asInstanceOf[js.Any])
    if (minAdjustmentStep != null) __obj.updateDynamic("minAdjustmentStep")(minAdjustmentStep.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyType != null) __obj.updateDynamic("policyType")(policyType.asInstanceOf[js.Any])
    if (scalingAdjustment != null) __obj.updateDynamic("scalingAdjustment")(scalingAdjustment.asInstanceOf[js.Any])
    if (stepAdjustments != null) __obj.updateDynamic("stepAdjustments")(stepAdjustments.asInstanceOf[js.Any])
    if (targetTrackingConfiguration != null) __obj.updateDynamic("targetTrackingConfiguration")(targetTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
}

