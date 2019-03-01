package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroupArnEnabled extends js.Object {
  var cloudwatchLogGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var logType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_CloudwatchLogGroupArnEnabled {
  @scala.inline
  def apply(
    cloudwatchLogGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    logType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_CloudwatchLogGroupArnEnabled = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLogGroupArnEnabled]
  }
}

