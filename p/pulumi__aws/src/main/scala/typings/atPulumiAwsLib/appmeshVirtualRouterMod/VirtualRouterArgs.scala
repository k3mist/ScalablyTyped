package typings
package atPulumiAwsLib.appmeshVirtualRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual router.
    */
  val meshName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name to use for the virtual router.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The virtual router specification to apply.
    */
  val spec: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ServiceNamesArray]
}

object VirtualRouterArgs {
  @scala.inline
  def apply(
    meshName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    spec: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ServiceNamesArray],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): VirtualRouterArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterArgs]
  }
}

