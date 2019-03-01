package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdIntervalTargetTimeout extends js.Object {
  var healthyThreshold: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var interval: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var target: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var timeout: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var unhealthyThreshold: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

object Anon_HealthyThresholdIntervalTargetTimeout {
  @scala.inline
  def apply(
    healthyThreshold: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    interval: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    target: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    timeout: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    unhealthyThreshold: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  ): Anon_HealthyThresholdIntervalTargetTimeout = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HealthyThresholdIntervalTargetTimeout]
  }
}

