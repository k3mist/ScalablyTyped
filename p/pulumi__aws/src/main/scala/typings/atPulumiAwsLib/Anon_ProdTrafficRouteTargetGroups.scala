package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProdTrafficRouteTargetGroups extends js.Object {
  var prodTrafficRoute: atPulumiPulumiLib.resourceMod.Input[Anon_ListenerArnsArray]
  var targetGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameInputString]]]
  var testTrafficRoute: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ListenerArnsArray]] = js.undefined
}

object Anon_ProdTrafficRouteTargetGroups {
  @scala.inline
  def apply(
    prodTrafficRoute: atPulumiPulumiLib.resourceMod.Input[Anon_ListenerArnsArray],
    targetGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameInputString]]],
    testTrafficRoute: atPulumiPulumiLib.resourceMod.Input[Anon_ListenerArnsArray] = null
  ): Anon_ProdTrafficRouteTargetGroups = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute.asInstanceOf[js.Any], targetGroups = targetGroups.asInstanceOf[js.Any])
    if (testTrafficRoute != null) __obj.updateDynamic("testTrafficRoute")(testTrafficRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProdTrafficRouteTargetGroups]
  }
}

