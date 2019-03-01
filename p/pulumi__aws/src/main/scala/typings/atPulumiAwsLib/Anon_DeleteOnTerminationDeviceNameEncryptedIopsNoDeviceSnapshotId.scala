package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDeviceSnapshotId extends js.Object {
  var deleteOnTermination: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var deviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var encrypted: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var iops: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var noDevice: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var snapshotId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var volumeSize: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var volumeType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDeviceSnapshotId {
  @scala.inline
  def apply(
    deviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    deleteOnTermination: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    encrypted: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    iops: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    noDevice: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    snapshotId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    volumeSize: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    volumeType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDeviceSnapshotId = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDeviceSnapshotId]
  }
}

