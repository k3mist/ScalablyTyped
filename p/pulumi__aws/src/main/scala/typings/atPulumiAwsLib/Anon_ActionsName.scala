package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionsName extends js.Object {
  var actions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_CategoryConfiguration]]]
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ActionsName {
  @scala.inline
  def apply(
    actions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_CategoryConfiguration]]],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_ActionsName = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionsName]
  }
}

