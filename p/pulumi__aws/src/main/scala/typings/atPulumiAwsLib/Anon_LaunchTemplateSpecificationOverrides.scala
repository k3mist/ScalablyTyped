package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateSpecificationOverrides extends js.Object {
  var launchTemplateSpecification: atPulumiPulumiLib.resourceMod.Input[Anon_LaunchTemplateIdLaunchTemplateName]
  var overrides: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_InstanceTypeInput]]]
  ] = js.undefined
}

object Anon_LaunchTemplateSpecificationOverrides {
  @scala.inline
  def apply(
    launchTemplateSpecification: atPulumiPulumiLib.resourceMod.Input[Anon_LaunchTemplateIdLaunchTemplateName],
    overrides: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_InstanceTypeInput]]] = null
  ): Anon_LaunchTemplateSpecificationOverrides = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LaunchTemplateSpecificationOverrides]
  }
}

