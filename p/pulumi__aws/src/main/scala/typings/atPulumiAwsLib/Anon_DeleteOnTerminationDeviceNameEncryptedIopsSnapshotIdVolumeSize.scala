package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeSize extends js.Object {
  var deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  var deviceName: java.lang.String
  var encrypted: scala.Boolean
  var iops: scala.Double
  var snapshotId: java.lang.String
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeSize {
  @scala.inline
  def apply(
    deviceName: java.lang.String,
    encrypted: scala.Boolean,
    iops: scala.Double,
    snapshotId: java.lang.String,
    volumeSize: scala.Double,
    volumeType: java.lang.String,
    deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeSize = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeSize]
  }
}

