package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameEbsNoDeviceVirtualName extends js.Object {
  var deviceName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var ebs: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_DeleteOnTerminationEncryptedIopsKmsKeyId]
  ] = js.undefined
  var noDevice: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var virtualName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_DeviceNameEbsNoDeviceVirtualName {
  @scala.inline
  def apply(
    deviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    ebs: atPulumiPulumiLib.resourceMod.Input[Anon_DeleteOnTerminationEncryptedIopsKmsKeyId] = null,
    noDevice: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    virtualName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DeviceNameEbsNoDeviceVirtualName = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (ebs != null) __obj.updateDynamic("ebs")(ebs.asInstanceOf[js.Any])
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceNameEbsNoDeviceVirtualName]
  }
}

