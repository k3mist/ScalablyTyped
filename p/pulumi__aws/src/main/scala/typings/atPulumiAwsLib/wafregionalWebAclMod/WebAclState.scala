package typings
package atPulumiAwsLib.wafregionalWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclState extends js.Object {
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeInput]] = js.undefined
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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

object WebAclState {
  @scala.inline
  def apply(
    defaultAction: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeInput] = null,
    metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    rules: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActionOverrideActionPriority]
      ]
    ] = null
  ): WebAclState = {
    val __obj = js.Dynamic.literal()
    if (defaultAction != null) __obj.updateDynamic("defaultAction")(defaultAction.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclState]
  }
}

