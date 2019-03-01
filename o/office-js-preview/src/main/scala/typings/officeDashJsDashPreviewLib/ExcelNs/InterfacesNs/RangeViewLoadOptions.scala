package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * RangeView represents a set of visible cells of the parent range.
  *
  * [Api set: ExcelApi 1.3]
  */
trait RangeViewLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the cell addresses of the RangeView. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var cellAddresses: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the number of visible columns. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var columnCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns a value that represents the index of the RangeView. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var index: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the number of visible rows. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rowCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var text: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the type of data of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var valueTypes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[scala.Boolean] = js.undefined
}

object RangeViewLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    cellAddresses: js.UndefOr[scala.Boolean] = js.undefined,
    columnCount: js.UndefOr[scala.Boolean] = js.undefined,
    formulas: js.UndefOr[scala.Boolean] = js.undefined,
    formulasLocal: js.UndefOr[scala.Boolean] = js.undefined,
    formulasR1C1: js.UndefOr[scala.Boolean] = js.undefined,
    index: js.UndefOr[scala.Boolean] = js.undefined,
    numberFormat: js.UndefOr[scala.Boolean] = js.undefined,
    rowCount: js.UndefOr[scala.Boolean] = js.undefined,
    text: js.UndefOr[scala.Boolean] = js.undefined,
    valueTypes: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.UndefOr[scala.Boolean] = js.undefined
  ): RangeViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(cellAddresses)) __obj.updateDynamic("cellAddresses")(cellAddresses)
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount)
    if (!js.isUndefined(formulas)) __obj.updateDynamic("formulas")(formulas)
    if (!js.isUndefined(formulasLocal)) __obj.updateDynamic("formulasLocal")(formulasLocal)
    if (!js.isUndefined(formulasR1C1)) __obj.updateDynamic("formulasR1C1")(formulasR1C1)
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat)
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(valueTypes)) __obj.updateDynamic("valueTypes")(valueTypes)
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[RangeViewLoadOptions]
  }
}

