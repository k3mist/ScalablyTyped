package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApproveAfterDaysComplianceLevel extends js.Object {
  var approveAfterDays: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var complianceLevel: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var enableNonSecurity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var patchFilters: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_KeyValuesArray]]]
}

object Anon_ApproveAfterDaysComplianceLevel {
  @scala.inline
  def apply(
    approveAfterDays: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    patchFilters: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_KeyValuesArray]]],
    complianceLevel: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    enableNonSecurity: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_ApproveAfterDaysComplianceLevel = {
    val __obj = js.Dynamic.literal(approveAfterDays = approveAfterDays.asInstanceOf[js.Any], patchFilters = patchFilters.asInstanceOf[js.Any])
    if (complianceLevel != null) __obj.updateDynamic("complianceLevel")(complianceLevel.asInstanceOf[js.Any])
    if (enableNonSecurity != null) __obj.updateDynamic("enableNonSecurity")(enableNonSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApproveAfterDaysComplianceLevel]
  }
}

