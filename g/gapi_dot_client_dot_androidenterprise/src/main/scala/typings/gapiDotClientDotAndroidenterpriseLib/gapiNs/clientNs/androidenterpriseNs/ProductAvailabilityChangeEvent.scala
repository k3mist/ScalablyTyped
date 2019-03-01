package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductAvailabilityChangeEvent extends js.Object {
  /** The new state of the product. This field will always be present. */
  var availabilityStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The id of the product (e.g. "app:com.google.android.gm") for which the product availability changed. This field will always be present. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

object ProductAvailabilityChangeEvent {
  @scala.inline
  def apply(availabilityStatus: java.lang.String = null, productId: java.lang.String = null): ProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    if (availabilityStatus != null) __obj.updateDynamic("availabilityStatus")(availabilityStatus)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[ProductAvailabilityChangeEvent]
  }
}

