package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricNameMetricNamespace extends js.Object {
  var metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var metricNamespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var metricTimestamp: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var metricUnit: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var metricValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_MetricNameMetricNamespace {
  @scala.inline
  def apply(
    metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    metricNamespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    metricUnit: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    metricValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    metricTimestamp: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_MetricNameMetricNamespace = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MetricNameMetricNamespace]
  }
}

