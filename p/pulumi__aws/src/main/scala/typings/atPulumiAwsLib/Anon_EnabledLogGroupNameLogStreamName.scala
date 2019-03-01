package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledLogGroupNameLogStreamName extends js.Object {
  var enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var logGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var logStreamName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_EnabledLogGroupNameLogStreamName {
  @scala.inline
  def apply(
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    logGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    logStreamName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_EnabledLogGroupNameLogStreamName = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledLogGroupNameLogStreamName]
  }
}

