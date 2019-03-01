package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "dataBarConditionalFormat.toJSON()". */
trait DataBarConditionalFormatData extends js.Object {
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: js.UndefOr[
    officeDashJsLib.ExcelNs.ConditionalDataBarAxisFormat | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.CellMidPoint
  ] = js.undefined
  /**
    *
    * Represents the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: js.UndefOr[
    officeDashJsLib.ExcelNs.ConditionalDataBarDirection | officeDashJsLib.officeDashJsLibStrings.Context | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft
  ] = js.undefined
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: js.UndefOr[officeDashJsLib.ExcelNs.ConditionalDataBarRule] = js.undefined
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var negativeFormat: js.UndefOr[ConditionalDataBarNegativeFormatData] = js.undefined
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var positiveFormat: js.UndefOr[ConditionalDataBarPositiveFormatData] = js.undefined
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: js.UndefOr[officeDashJsLib.ExcelNs.ConditionalDataBarRule] = js.undefined
}

object DataBarConditionalFormatData {
  @scala.inline
  def apply(
    axisColor: java.lang.String = null,
    axisFormat: officeDashJsLib.ExcelNs.ConditionalDataBarAxisFormat | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.CellMidPoint = null,
    barDirection: officeDashJsLib.ExcelNs.ConditionalDataBarDirection | officeDashJsLib.officeDashJsLibStrings.Context | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft = null,
    lowerBoundRule: officeDashJsLib.ExcelNs.ConditionalDataBarRule = null,
    negativeFormat: ConditionalDataBarNegativeFormatData = null,
    positiveFormat: ConditionalDataBarPositiveFormatData = null,
    showDataBarOnly: js.UndefOr[scala.Boolean] = js.undefined,
    upperBoundRule: officeDashJsLib.ExcelNs.ConditionalDataBarRule = null
  ): DataBarConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (axisColor != null) __obj.updateDynamic("axisColor")(axisColor)
    if (axisFormat != null) __obj.updateDynamic("axisFormat")(axisFormat.asInstanceOf[js.Any])
    if (barDirection != null) __obj.updateDynamic("barDirection")(barDirection.asInstanceOf[js.Any])
    if (lowerBoundRule != null) __obj.updateDynamic("lowerBoundRule")(lowerBoundRule)
    if (negativeFormat != null) __obj.updateDynamic("negativeFormat")(negativeFormat)
    if (positiveFormat != null) __obj.updateDynamic("positiveFormat")(positiveFormat)
    if (!js.isUndefined(showDataBarOnly)) __obj.updateDynamic("showDataBarOnly")(showDataBarOnly)
    if (upperBoundRule != null) __obj.updateDynamic("upperBoundRule")(upperBoundRule)
    __obj.asInstanceOf[DataBarConditionalFormatData]
  }
}

