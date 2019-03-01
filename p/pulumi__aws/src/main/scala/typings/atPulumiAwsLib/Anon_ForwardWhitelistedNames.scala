package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardWhitelistedNames extends js.Object {
  var forward: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var whitelistedNames: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_ForwardWhitelistedNames {
  @scala.inline
  def apply(
    forward: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    whitelistedNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_ForwardWhitelistedNames = {
    val __obj = js.Dynamic.literal(forward = forward.asInstanceOf[js.Any])
    if (whitelistedNames != null) __obj.updateDynamic("whitelistedNames")(whitelistedNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardWhitelistedNames]
  }
}

