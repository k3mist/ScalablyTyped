package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoscalingPolicyBidPrice extends js.Object {
  var autoscalingPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var bidPrice: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var ebsConfigs: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_IopsSize]]]
  ] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var instanceCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var instanceRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var instanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_AutoscalingPolicyBidPrice {
  @scala.inline
  def apply(
    instanceRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    instanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    autoscalingPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    bidPrice: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    ebsConfigs: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_IopsSize]]] = null,
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    instanceCount: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_AutoscalingPolicyBidPrice = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice.asInstanceOf[js.Any])
    if (ebsConfigs != null) __obj.updateDynamic("ebsConfigs")(ebsConfigs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoscalingPolicyBidPrice]
  }
}

