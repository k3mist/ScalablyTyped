package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbSecurityGroupMembershipsOptionName extends js.Object {
  var dbSecurityGroupMemberships: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var optionName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var optionSettings: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameValue]]]
  ] = js.undefined
  var port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var version: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var vpcSecurityGroupMemberships: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_DbSecurityGroupMembershipsOptionName {
  @scala.inline
  def apply(
    optionName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    dbSecurityGroupMemberships: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    optionSettings: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameValue]]] = null,
    port: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    version: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    vpcSecurityGroupMemberships: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_DbSecurityGroupMembershipsOptionName = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any])
    if (dbSecurityGroupMemberships != null) __obj.updateDynamic("dbSecurityGroupMemberships")(dbSecurityGroupMemberships.asInstanceOf[js.Any])
    if (optionSettings != null) __obj.updateDynamic("optionSettings")(optionSettings.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vpcSecurityGroupMemberships != null) __obj.updateDynamic("vpcSecurityGroupMemberships")(vpcSecurityGroupMemberships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DbSecurityGroupMembershipsOptionName]
  }
}

