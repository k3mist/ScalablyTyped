package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateIdLaunchTemplateNameVersionInput extends js.Object {
  var launchTemplateId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var launchTemplateName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var version: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_LaunchTemplateIdLaunchTemplateNameVersionInput {
  @scala.inline
  def apply(
    version: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    launchTemplateId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    launchTemplateName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_LaunchTemplateIdLaunchTemplateNameVersionInput = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId.asInstanceOf[js.Any])
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LaunchTemplateIdLaunchTemplateNameVersionInput]
  }
}

