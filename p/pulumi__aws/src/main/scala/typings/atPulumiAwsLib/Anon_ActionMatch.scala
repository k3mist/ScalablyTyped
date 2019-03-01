package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionMatch extends js.Object {
  var action: atPulumiPulumiLib.resourceMod.Input[Anon_WeightedTargetsAnonVirtualNodeWeight]
  var `match`: atPulumiPulumiLib.resourceMod.Input[Anon_PrefixInput]
}

object Anon_ActionMatch {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.resourceMod.Input[Anon_WeightedTargetsAnonVirtualNodeWeight],
    `match`: atPulumiPulumiLib.resourceMod.Input[Anon_PrefixInput]
  ): Anon_ActionMatch = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], `match` = `match`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionMatch]
  }
}

