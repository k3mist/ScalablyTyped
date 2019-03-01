package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimDeviceRequest extends js.Object {
  /** The customer to claim for. */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /** The device identifier of the device to claim. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** The section to claim. */
  var sectionType: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimDeviceRequest {
  @scala.inline
  def apply(
    customerId: java.lang.String = null,
    deviceIdentifier: DeviceIdentifier = null,
    sectionType: java.lang.String = null
  ): ClaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier)
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType)
    __obj.asInstanceOf[ClaimDeviceRequest]
  }
}

