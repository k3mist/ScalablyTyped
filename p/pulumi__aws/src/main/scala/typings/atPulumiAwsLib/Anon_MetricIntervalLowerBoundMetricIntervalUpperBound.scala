package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricIntervalLowerBoundMetricIntervalUpperBound extends js.Object {
  var metricIntervalLowerBound: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var metricIntervalUpperBound: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var scalingAdjustment: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

object Anon_MetricIntervalLowerBoundMetricIntervalUpperBound {
  @scala.inline
  def apply(
    scalingAdjustment: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    metricIntervalLowerBound: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    metricIntervalUpperBound: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_MetricIntervalLowerBoundMetricIntervalUpperBound = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
    if (metricIntervalLowerBound != null) __obj.updateDynamic("metricIntervalLowerBound")(metricIntervalLowerBound.asInstanceOf[js.Any])
    if (metricIntervalUpperBound != null) __obj.updateDynamic("metricIntervalUpperBound")(metricIntervalUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MetricIntervalLowerBoundMetricIntervalUpperBound]
  }
}

