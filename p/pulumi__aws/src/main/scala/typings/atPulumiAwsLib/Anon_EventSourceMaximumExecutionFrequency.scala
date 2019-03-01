package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventSourceMaximumExecutionFrequency extends js.Object {
  var eventSource: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var maximumExecutionFrequency: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var messageType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_EventSourceMaximumExecutionFrequency {
  @scala.inline
  def apply(
    eventSource: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    maximumExecutionFrequency: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    messageType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_EventSourceMaximumExecutionFrequency = {
    val __obj = js.Dynamic.literal()
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource.asInstanceOf[js.Any])
    if (maximumExecutionFrequency != null) __obj.updateDynamic("maximumExecutionFrequency")(maximumExecutionFrequency.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventSourceMaximumExecutionFrequency]
  }
}

