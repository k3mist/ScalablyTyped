package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameContainerPortPort extends js.Object {
  var containerName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var containerPort: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var registryArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ContainerNameContainerPortPort {
  @scala.inline
  def apply(
    registryArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    containerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    containerPort: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    port: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_ContainerNameContainerPortPort = {
    val __obj = js.Dynamic.literal(registryArn = registryArn.asInstanceOf[js.Any])
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (containerPort != null) __obj.updateDynamic("containerPort")(containerPort.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerNameContainerPortPort]
  }
}

