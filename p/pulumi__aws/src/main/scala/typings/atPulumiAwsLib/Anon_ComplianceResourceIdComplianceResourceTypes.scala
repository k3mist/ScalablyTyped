package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComplianceResourceIdComplianceResourceTypes extends js.Object {
  var complianceResourceId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var complianceResourceTypes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var tagKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var tagValue: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_ComplianceResourceIdComplianceResourceTypes {
  @scala.inline
  def apply(
    complianceResourceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    complianceResourceTypes: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    tagKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tagValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ComplianceResourceIdComplianceResourceTypes = {
    val __obj = js.Dynamic.literal()
    if (complianceResourceId != null) __obj.updateDynamic("complianceResourceId")(complianceResourceId.asInstanceOf[js.Any])
    if (complianceResourceTypes != null) __obj.updateDynamic("complianceResourceTypes")(complianceResourceTypes.asInstanceOf[js.Any])
    if (tagKey != null) __obj.updateDynamic("tagKey")(tagKey.asInstanceOf[js.Any])
    if (tagValue != null) __obj.updateDynamic("tagValue")(tagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComplianceResourceIdComplianceResourceTypes]
  }
}

