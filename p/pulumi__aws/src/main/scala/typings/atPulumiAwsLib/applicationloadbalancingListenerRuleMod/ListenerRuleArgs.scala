package typings
package atPulumiAwsLib.applicationloadbalancingListenerRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleArgs extends js.Object {
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: atPulumiPulumiLib.resourceMod.Input[
    js.Array[
      atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuthenticateCognitoAuthenticateOidc]
    ]
  ]
  /**
    * A Condition block. Condition blocks are documented below.
    */
  val conditions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FieldValues]]]
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object ListenerRuleArgs {
  @scala.inline
  def apply(
    actions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuthenticateCognitoAuthenticateOidc]
      ]
    ],
    conditions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FieldValues]]],
    listenerArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    priority: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): ListenerRuleArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleArgs]
  }
}

