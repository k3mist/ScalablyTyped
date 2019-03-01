package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TriggerEventsTriggerName extends js.Object {
  var triggerEvents: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var triggerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var triggerTargetArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_TriggerEventsTriggerName {
  @scala.inline
  def apply(
    triggerEvents: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    triggerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    triggerTargetArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_TriggerEventsTriggerName = {
    val __obj = js.Dynamic.literal(triggerEvents = triggerEvents.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any], triggerTargetArn = triggerTargetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TriggerEventsTriggerName]
  }
}

