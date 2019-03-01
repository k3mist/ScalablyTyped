package typings
package chromeDashAppsLib.chromeNs.hidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
trait DeviceFilter extends js.Object {
  /** Device product ID, only checked only if the vendor ID matches. */
  var productId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** HID usage identifier, checked only if the HID usage page matches. */
  var usage: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** HID usage page identifier. */
  var usagePage: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Device vendor ID. */
  var vendorId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object DeviceFilter {
  @scala.inline
  def apply(
    productId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    usage: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    usagePage: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    vendorId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): DeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(productId)) __obj.updateDynamic("productId")(productId)
    if (!js.isUndefined(usage)) __obj.updateDynamic("usage")(usage)
    if (!js.isUndefined(usagePage)) __obj.updateDynamic("usagePage")(usagePage)
    if (!js.isUndefined(vendorId)) __obj.updateDynamic("vendorId")(vendorId)
    __obj.asInstanceOf[DeviceFilter]
  }
}

