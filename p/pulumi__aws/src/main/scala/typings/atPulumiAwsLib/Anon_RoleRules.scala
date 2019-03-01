package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleRules extends js.Object {
  var role: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var rules: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_DestinationFilter]]]
}

object Anon_RoleRules {
  @scala.inline
  def apply(
    role: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    rules: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_DestinationFilter]]]
  ): Anon_RoleRules = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RoleRules]
  }
}

