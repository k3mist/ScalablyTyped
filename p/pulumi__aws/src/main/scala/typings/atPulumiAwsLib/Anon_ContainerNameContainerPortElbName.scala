package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameContainerPortElbName extends js.Object {
  var containerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var containerPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var elbName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var targetGroupArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_ContainerNameContainerPortElbName {
  @scala.inline
  def apply(
    containerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    containerPort: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    elbName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    targetGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ContainerNameContainerPortElbName = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], containerPort = containerPort.asInstanceOf[js.Any])
    if (elbName != null) __obj.updateDynamic("elbName")(elbName.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerNameContainerPortElbName]
  }
}

