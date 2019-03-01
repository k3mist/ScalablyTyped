package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPlotArea extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[ChartPlotAreaBorder] = js.undefined
  var margin: js.UndefOr[ChartPlotAreaMargin] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[ChartPlotAreaPadding] = js.undefined
}

object ChartPlotArea {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: ChartPlotAreaBorder = null,
    margin: ChartPlotAreaMargin = null,
    opacity: scala.Int | scala.Double = null,
    padding: ChartPlotAreaPadding = null
  ): ChartPlotArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[ChartPlotArea]
  }
}

