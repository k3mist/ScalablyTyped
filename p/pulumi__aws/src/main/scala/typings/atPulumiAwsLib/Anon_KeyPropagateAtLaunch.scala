package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyPropagateAtLaunch extends js.Object {
  var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var propagateAtLaunch: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  var value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_KeyPropagateAtLaunch {
  @scala.inline
  def apply(
    key: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    propagateAtLaunch: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_KeyPropagateAtLaunch = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], propagateAtLaunch = propagateAtLaunch.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyPropagateAtLaunch]
  }
}

