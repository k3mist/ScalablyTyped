package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncryptedIops extends js.Object {
  var deleteOnTermination: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var deviceName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var encrypted: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var iops: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var snapshotId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var volumeSize: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var volumeType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_DeleteOnTerminationDeviceNameEncryptedIops {
  @scala.inline
  def apply(
    deleteOnTermination: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    deviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    encrypted: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    iops: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    snapshotId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    volumeSize: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    volumeType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DeleteOnTerminationDeviceNameEncryptedIops = {
    val __obj = js.Dynamic.literal()
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncryptedIops]
  }
}

