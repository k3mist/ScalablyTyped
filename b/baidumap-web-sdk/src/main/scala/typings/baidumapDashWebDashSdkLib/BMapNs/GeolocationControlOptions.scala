package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var enableAutoLocation: js.UndefOr[scala.Boolean] = js.undefined
  var locationIcon: js.UndefOr[Icon] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var showAddressBar: js.UndefOr[scala.Boolean] = js.undefined
}

object GeolocationControlOptions {
  @scala.inline
  def apply(
    anchor: js.UndefOr[ControlAnchor] = js.undefined,
    enableAutoLocation: js.UndefOr[scala.Boolean] = js.undefined,
    locationIcon: Icon = null,
    offset: Size = null,
    showAddressBar: js.UndefOr[scala.Boolean] = js.undefined
  ): GeolocationControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor)
    if (!js.isUndefined(enableAutoLocation)) __obj.updateDynamic("enableAutoLocation")(enableAutoLocation)
    if (locationIcon != null) __obj.updateDynamic("locationIcon")(locationIcon)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (!js.isUndefined(showAddressBar)) __obj.updateDynamic("showAddressBar")(showAddressBar)
    __obj.asInstanceOf[GeolocationControlOptions]
  }
}

