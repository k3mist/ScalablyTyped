package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initialize extends js.Object {
  var initialize: js.UndefOr[scala.Boolean] = js.undefined
  var showNativeScrollbars: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Initialize {
  @scala.inline
  def apply(
    initialize: js.UndefOr[scala.Boolean] = js.undefined,
    showNativeScrollbars: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Initialize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialize)) __obj.updateDynamic("initialize")(initialize)
    if (!js.isUndefined(showNativeScrollbars)) __obj.updateDynamic("showNativeScrollbars")(showNativeScrollbars)
    __obj.asInstanceOf[Anon_Initialize]
  }
}

