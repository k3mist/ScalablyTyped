package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRulerControlParameters extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[yandexDashMapsLib.Anon_AdjustMapMarginPosition] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object IRulerControlParameters {
  @scala.inline
  def apply(
    data: js.Object = null,
    options: yandexDashMapsLib.Anon_AdjustMapMarginPosition = null,
    state: js.Object = null
  ): IRulerControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IRulerControlParameters]
  }
}

