package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameScriptLocationInput extends js.Object {
  var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var scriptLocation: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_NameScriptLocationInput {
  @scala.inline
  def apply(
    scriptLocation: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_NameScriptLocationInput = {
    val __obj = js.Dynamic.literal(scriptLocation = scriptLocation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameScriptLocationInput]
  }
}

