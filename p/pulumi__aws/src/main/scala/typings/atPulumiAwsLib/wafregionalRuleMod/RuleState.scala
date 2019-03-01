package typings
package atPulumiAwsLib.wafregionalRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleState extends js.Object {
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The objects to include in a rule.
    */
  val predicates: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DataIdNegated]]]
  ] = js.undefined
}

object RuleState {
  @scala.inline
  def apply(
    metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    predicates: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DataIdNegated]]] = null
  ): RuleState = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicates != null) __obj.updateDynamic("predicates")(predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleState]
  }
}

