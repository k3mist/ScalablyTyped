package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DimensionsMetricName extends js.Object {
  var dimensions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameValue]]]
  ] = js.undefined
  var metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var statistic: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var unit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_DimensionsMetricName {
  @scala.inline
  def apply(
    metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    statistic: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    dimensions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameValue]]] = null,
    unit: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DimensionsMetricName = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DimensionsMetricName]
  }
}

