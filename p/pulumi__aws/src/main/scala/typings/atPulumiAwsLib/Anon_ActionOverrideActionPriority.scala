package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOverrideActionPriority extends js.Object {
  var action: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_TypeInput]] = js.undefined
  var overrideAction: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_TypeInput]] = js.undefined
  var priority: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var ruleId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_ActionOverrideActionPriority {
  @scala.inline
  def apply(
    priority: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    ruleId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    action: atPulumiPulumiLib.resourceMod.Input[Anon_TypeInput] = null,
    overrideAction: atPulumiPulumiLib.resourceMod.Input[Anon_TypeInput] = null,
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ActionOverrideActionPriority = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (overrideAction != null) __obj.updateDynamic("overrideAction")(overrideAction.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionOverrideActionPriority]
  }
}

