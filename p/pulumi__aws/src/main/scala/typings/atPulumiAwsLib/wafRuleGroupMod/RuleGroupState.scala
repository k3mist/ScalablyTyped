package typings
package atPulumiAwsLib.wafRuleGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroupState extends js.Object {
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActionPriorityRuleId]]
    ]
  ] = js.undefined
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object RuleGroupState {
  @scala.inline
  def apply(
    activatedRules: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActionPriorityRuleId]]
    ] = null,
    metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): RuleGroupState = {
    val __obj = js.Dynamic.literal()
    if (activatedRules != null) __obj.updateDynamic("activatedRules")(activatedRules.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupState]
  }
}

