package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchControlParameters extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[yandexDashMapsLib.Anon_AdjustMapMarginAuto] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object ISearchControlParameters {
  @scala.inline
  def apply(
    data: js.Object = null,
    options: yandexDashMapsLib.Anon_AdjustMapMarginAuto = null,
    state: js.Object = null
  ): ISearchControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ISearchControlParameters]
  }
}

