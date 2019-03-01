package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNamespaceResource extends js.Object {
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var resource: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_NameNamespaceResource {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    value: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    resource: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_NameNamespaceResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameNamespaceResource]
  }
}

