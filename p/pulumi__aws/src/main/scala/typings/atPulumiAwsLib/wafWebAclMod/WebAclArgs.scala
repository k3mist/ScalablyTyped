package typings
package atPulumiAwsLib.wafWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclArgs extends js.Object {
  /**
    * The action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeInput]
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The rules to associate with the web ACL and the settings for each rule.
    */
  val rules: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActionOverrideActionPriority]
      ]
    ]
  ] = js.undefined
}

object WebAclArgs {
  @scala.inline
  def apply(
    defaultAction: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeInput],
    metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    rules: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActionOverrideActionPriority]
      ]
    ] = null
  ): WebAclArgs = {
    val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclArgs]
  }
}

