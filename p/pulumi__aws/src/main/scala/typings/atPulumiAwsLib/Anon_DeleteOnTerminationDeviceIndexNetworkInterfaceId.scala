package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId extends js.Object {
  var deleteOnTermination: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var deviceIndex: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var networkInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId {
  @scala.inline
  def apply(
    deviceIndex: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    networkInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    deleteOnTermination: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId]
  }
}

