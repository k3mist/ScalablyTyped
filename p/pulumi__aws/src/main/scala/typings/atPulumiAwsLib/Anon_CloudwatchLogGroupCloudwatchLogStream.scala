package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroupCloudwatchLogStream extends js.Object {
  var cloudwatchLogGroup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var cloudwatchLogStream: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
}

object Anon_CloudwatchLogGroupCloudwatchLogStream {
  @scala.inline
  def apply(
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    cloudwatchLogGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    cloudwatchLogStream: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_CloudwatchLogGroupCloudwatchLogStream = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (cloudwatchLogGroup != null) __obj.updateDynamic("cloudwatchLogGroup")(cloudwatchLogGroup.asInstanceOf[js.Any])
    if (cloudwatchLogStream != null) __obj.updateDynamic("cloudwatchLogStream")(cloudwatchLogStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLogGroupCloudwatchLogStream]
  }
}

