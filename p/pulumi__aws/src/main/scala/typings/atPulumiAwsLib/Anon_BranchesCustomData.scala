package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BranchesCustomData extends js.Object {
  var branches: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var customData: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var destinationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var events: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_BranchesCustomData {
  @scala.inline
  def apply(
    destinationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    events: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    branches: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    customData: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BranchesCustomData = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BranchesCustomData]
  }
}

