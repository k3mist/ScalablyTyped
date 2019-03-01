package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupLaunchType extends js.Object {
  var group: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var launchType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var networkConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_AssignPublicIpSecurityGroups]] = js.undefined
  var platformVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var taskCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var taskDefinitionArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_GroupLaunchType {
  @scala.inline
  def apply(
    taskDefinitionArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    group: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    launchType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    networkConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_AssignPublicIpSecurityGroups] = null,
    platformVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    taskCount: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_GroupLaunchType = {
    val __obj = js.Dynamic.literal(taskDefinitionArn = taskDefinitionArn.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (taskCount != null) __obj.updateDynamic("taskCount")(taskCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupLaunchType]
  }
}

