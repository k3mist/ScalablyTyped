package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType extends js.Object {
  var launchTemplateSpecification: atPulumiPulumiLib.resourceMod.Input[Anon_LaunchTemplateIdLaunchTemplateNameVersionInput]
  var overrides: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_AvailabilityZoneInstanceType]]]
  ] = js.undefined
}

object Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType {
  @scala.inline
  def apply(
    launchTemplateSpecification: atPulumiPulumiLib.resourceMod.Input[Anon_LaunchTemplateIdLaunchTemplateNameVersionInput],
    overrides: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_AvailabilityZoneInstanceType]]] = null
  ): Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType]
  }
}

