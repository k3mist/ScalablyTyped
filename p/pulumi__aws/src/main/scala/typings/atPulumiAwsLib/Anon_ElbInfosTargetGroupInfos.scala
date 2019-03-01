package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElbInfosTargetGroupInfos extends js.Object {
  var elbInfos: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameInput]]]
  ] = js.undefined
  var targetGroupInfos: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameInput]]]
  ] = js.undefined
  var targetGroupPairInfo: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ProdTrafficRouteTargetGroups]] = js.undefined
}

object Anon_ElbInfosTargetGroupInfos {
  @scala.inline
  def apply(
    elbInfos: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameInput]]] = null,
    targetGroupInfos: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameInput]]] = null,
    targetGroupPairInfo: atPulumiPulumiLib.resourceMod.Input[Anon_ProdTrafficRouteTargetGroups] = null
  ): Anon_ElbInfosTargetGroupInfos = {
    val __obj = js.Dynamic.literal()
    if (elbInfos != null) __obj.updateDynamic("elbInfos")(elbInfos.asInstanceOf[js.Any])
    if (targetGroupInfos != null) __obj.updateDynamic("targetGroupInfos")(targetGroupInfos.asInstanceOf[js.Any])
    if (targetGroupPairInfo != null) __obj.updateDynamic("targetGroupPairInfo")(targetGroupPairInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ElbInfosTargetGroupInfos]
  }
}

