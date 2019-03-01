package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDeliveryDetails extends js.Object {
  /** The delivery address */
  var address: js.UndefOr[OrderAddress] = js.undefined
  /** The phone number of the person receiving the delivery. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
}

object OrderDeliveryDetails {
  @scala.inline
  def apply(address: OrderAddress = null, phoneNumber: java.lang.String = null): OrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[OrderDeliveryDetails]
  }
}

