package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** Claims. */
  var claims: js.UndefOr[js.Array[DeviceClaim]] = js.undefined
  /**
    * The resource name of the configuration.
    * Only set for customers.
    */
  var configuration: js.UndefOr[java.lang.String] = js.undefined
  /** Device ID. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Device identifier. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** Device metadata. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  /** Resource name in `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    claims: js.Array[DeviceClaim] = null,
    configuration: java.lang.String = null,
    deviceId: java.lang.String = null,
    deviceIdentifier: DeviceIdentifier = null,
    deviceMetadata: DeviceMetadata = null,
    name: java.lang.String = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (claims != null) __obj.updateDynamic("claims")(claims)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier)
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Device]
  }
}

