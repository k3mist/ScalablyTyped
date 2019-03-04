package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendLabelOptions extends js.Object {
  var boxWidth: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[js.Function2[/* legendItem */ ChartLegendLabelItem, /* data */ ChartData, _]] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var generateLabels: js.UndefOr[js.Function1[/* chart */ js.Any, _]] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var usePointStyle: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartLegendLabelOptions {
  @scala.inline
  def apply(
    boxWidth: scala.Int | scala.Double = null,
    filter: (/* legendItem */ ChartLegendLabelItem, /* data */ ChartData) => _ = null,
    fontColor: ChartColor = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: java.lang.String = null,
    generateLabels: /* chart */ js.Any => _ = null,
    padding: scala.Int | scala.Double = null,
    usePointStyle: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartLegendLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (generateLabels != null) __obj.updateDynamic("generateLabels")(js.Any.fromFunction1(generateLabels))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(usePointStyle)) __obj.updateDynamic("usePointStyle")(usePointStyle)
    __obj.asInstanceOf[ChartLegendLabelOptions]
  }
}

