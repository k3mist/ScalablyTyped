package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart plotArea object.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartPlotAreaLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartPlotAreaLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartPlotAreaFormatLoadOptions = null,
    height: js.UndefOr[scala.Boolean] = js.undefined,
    insideHeight: js.UndefOr[scala.Boolean] = js.undefined,
    insideLeft: js.UndefOr[scala.Boolean] = js.undefined,
    insideTop: js.UndefOr[scala.Boolean] = js.undefined,
    insideWidth: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.UndefOr[scala.Boolean] = js.undefined,
    top: js.UndefOr[scala.Boolean] = js.undefined,
    width: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartPlotAreaLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(insideHeight)) __obj.updateDynamic("insideHeight")(insideHeight)
    if (!js.isUndefined(insideLeft)) __obj.updateDynamic("insideLeft")(insideLeft)
    if (!js.isUndefined(insideTop)) __obj.updateDynamic("insideTop")(insideTop)
    if (!js.isUndefined(insideWidth)) __obj.updateDynamic("insideWidth")(insideWidth)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartPlotAreaLoadOptions]
  }
}

