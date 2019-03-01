package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateIdLaunchTemplateName extends js.Object {
  var launchTemplateId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var launchTemplateName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var version: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_LaunchTemplateIdLaunchTemplateName {
  @scala.inline
  def apply(
    launchTemplateId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    launchTemplateName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    version: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_LaunchTemplateIdLaunchTemplateName = {
    val __obj = js.Dynamic.literal()
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId.asInstanceOf[js.Any])
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LaunchTemplateIdLaunchTemplateName]
  }
}

