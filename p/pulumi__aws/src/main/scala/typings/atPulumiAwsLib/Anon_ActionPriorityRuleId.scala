package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionPriorityRuleId extends js.Object {
  var action: atPulumiPulumiLib.resourceMod.Input[Anon_TypeInput]
  var priority: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var ruleId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_ActionPriorityRuleId {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.resourceMod.Input[Anon_TypeInput],
    priority: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    ruleId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ActionPriorityRuleId = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionPriorityRuleId]
  }
}

