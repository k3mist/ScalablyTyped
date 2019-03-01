package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 31. */
trait ConnectionHandle extends js.Object {
  /**
    * An opaque handle representing this connection to the USB device
    * and all associated claimed interfaces and pending transfers.
    * A new handle is created each time the device is opened.
    * The connection handle is different from Device.device.
    */
  var handle: chromeDashAppsLib.chromeNs.integer
  /** The product ID. */
  var productId: chromeDashAppsLib.chromeNs.integer
  /** The device vendor ID. */
  var vendorId: chromeDashAppsLib.chromeNs.integer
}

object ConnectionHandle {
  @scala.inline
  def apply(
    handle: chromeDashAppsLib.chromeNs.integer,
    productId: chromeDashAppsLib.chromeNs.integer,
    vendorId: chromeDashAppsLib.chromeNs.integer
  ): ConnectionHandle = {
    val __obj = js.Dynamic.literal(handle = handle, productId = productId, vendorId = vendorId)
  
    __obj.asInstanceOf[ConnectionHandle]
  }
}

