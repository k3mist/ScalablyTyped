package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMetadataArguments extends js.Object {
  /** Device ID of the device. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Device identifier. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** The metadata to update. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
}

object UpdateMetadataArguments {
  @scala.inline
  def apply(
    deviceId: java.lang.String = null,
    deviceIdentifier: DeviceIdentifier = null,
    deviceMetadata: DeviceMetadata = null
  ): UpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier)
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata)
    __obj.asInstanceOf[UpdateMetadataArguments]
  }
}

