package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSelectMousewheel extends js.Object {
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[java.lang.String] = js.undefined
}

object StockChartNavigatorSelectMousewheel {
  @scala.inline
  def apply(reverse: js.UndefOr[scala.Boolean] = js.undefined, zoom: java.lang.String = null): StockChartNavigatorSelectMousewheel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[StockChartNavigatorSelectMousewheel]
  }
}

