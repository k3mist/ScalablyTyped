package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResourceOptions extends ResourceOptions {
  /**
    * An optional provider to use for this resource's CRUD operations. If no provider is supplied, the default
    * provider for the resource's package will be used. The default provider is pulled from the parent's
    * provider bag (see also ComponentResourceOptions.providers).
    */
  var provider: js.UndefOr[ProviderResource] = js.undefined
}

object CustomResourceOptions {
  @scala.inline
  def apply(
    dependsOn: Input[js.Array[Input[Resource]]] | Input[Resource] = null,
    id: Input[ID] = null,
    parent: Resource = null,
    protect: js.UndefOr[scala.Boolean] = js.undefined,
    provider: ProviderResource = null
  ): CustomResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[CustomResourceOptions]
  }
}

