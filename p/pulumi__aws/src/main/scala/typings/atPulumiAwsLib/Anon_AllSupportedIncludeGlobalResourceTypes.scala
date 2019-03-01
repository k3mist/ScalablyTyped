package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllSupportedIncludeGlobalResourceTypes extends js.Object {
  var allSupported: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var includeGlobalResourceTypes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var resourceTypes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_AllSupportedIncludeGlobalResourceTypes {
  @scala.inline
  def apply(
    allSupported: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    includeGlobalResourceTypes: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    resourceTypes: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_AllSupportedIncludeGlobalResourceTypes = {
    val __obj = js.Dynamic.literal()
    if (allSupported != null) __obj.updateDynamic("allSupported")(allSupported.asInstanceOf[js.Any])
    if (includeGlobalResourceTypes != null) __obj.updateDynamic("includeGlobalResourceTypes")(includeGlobalResourceTypes.asInstanceOf[js.Any])
    if (resourceTypes != null) __obj.updateDynamic("resourceTypes")(resourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllSupportedIncludeGlobalResourceTypes]
  }
}

