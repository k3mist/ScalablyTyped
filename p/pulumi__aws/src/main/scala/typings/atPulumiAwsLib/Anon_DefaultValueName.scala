package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueName extends js.Object {
  var defaultValue: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DefaultValueName {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    value: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    defaultValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DefaultValueName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValueName]
  }
}

