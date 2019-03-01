package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue extends js.Object {
  var customizedMetricSpecification: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_MetricDimensionsMetricName]] = js.undefined
  var disableScaleIn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_PredefinedMetricTypeResourceLabel]] = js.undefined
  var targetValue: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

object Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue {
  @scala.inline
  def apply(
    targetValue: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    customizedMetricSpecification: atPulumiPulumiLib.resourceMod.Input[Anon_MetricDimensionsMetricName] = null,
    disableScaleIn: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    predefinedMetricSpecification: atPulumiPulumiLib.resourceMod.Input[Anon_PredefinedMetricTypeResourceLabel] = null
  ): Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (disableScaleIn != null) __obj.updateDynamic("disableScaleIn")(disableScaleIn.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomizedMetricSpecificationDisableScaleInPredefinedMetricSpecificationTargetValue]
  }
}

