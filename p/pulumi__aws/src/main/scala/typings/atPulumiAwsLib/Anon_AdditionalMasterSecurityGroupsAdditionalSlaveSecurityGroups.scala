package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups extends js.Object {
  var additionalMasterSecurityGroups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var additionalSlaveSecurityGroups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var emrManagedMasterSecurityGroup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var emrManagedSlaveSecurityGroup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var instanceProfile: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var keyName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var serviceAccessSecurityGroup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var subnetId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups {
  @scala.inline
  def apply(
    instanceProfile: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    additionalMasterSecurityGroups: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    additionalSlaveSecurityGroups: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    emrManagedMasterSecurityGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    emrManagedSlaveSecurityGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    keyName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    serviceAccessSecurityGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    subnetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups = {
    val __obj = js.Dynamic.literal(instanceProfile = instanceProfile.asInstanceOf[js.Any])
    if (additionalMasterSecurityGroups != null) __obj.updateDynamic("additionalMasterSecurityGroups")(additionalMasterSecurityGroups.asInstanceOf[js.Any])
    if (additionalSlaveSecurityGroups != null) __obj.updateDynamic("additionalSlaveSecurityGroups")(additionalSlaveSecurityGroups.asInstanceOf[js.Any])
    if (emrManagedMasterSecurityGroup != null) __obj.updateDynamic("emrManagedMasterSecurityGroup")(emrManagedMasterSecurityGroup.asInstanceOf[js.Any])
    if (emrManagedSlaveSecurityGroup != null) __obj.updateDynamic("emrManagedSlaveSecurityGroup")(emrManagedSlaveSecurityGroup.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (serviceAccessSecurityGroup != null) __obj.updateDynamic("serviceAccessSecurityGroup")(serviceAccessSecurityGroup.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups]
  }
}

