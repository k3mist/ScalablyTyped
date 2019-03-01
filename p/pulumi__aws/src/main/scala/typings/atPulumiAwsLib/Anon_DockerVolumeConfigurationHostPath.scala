package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DockerVolumeConfigurationHostPath extends js.Object {
  var dockerVolumeConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_AutoprovisionDriver]] = js.undefined
  var hostPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DockerVolumeConfigurationHostPath {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    dockerVolumeConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_AutoprovisionDriver] = null,
    hostPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DockerVolumeConfigurationHostPath = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (dockerVolumeConfiguration != null) __obj.updateDynamic("dockerVolumeConfiguration")(dockerVolumeConfiguration.asInstanceOf[js.Any])
    if (hostPath != null) __obj.updateDynamic("hostPath")(hostPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DockerVolumeConfigurationHostPath]
  }
}

