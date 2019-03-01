package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet extends js.Object {
  /** Specifies the border for the cell in the Spreadsheet.
    * @Default {[]}
    */
  var border: js.UndefOr[js.Array[SheetsBorder]] = js.undefined
  /** Specifies the conditional formatting for the range of cell in Spreadsheet.
    * @Default {[]}
    */
  var cFormatRule: js.UndefOr[js.Array[SheetsCFormatRule]] = js.undefined
  /** Specifies the cell types for a cell or range in Spreadsheet.
    * @Default {[]}
    */
  var cellTypes: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates to define column count in the Spreadsheet.
    * @Default {21}
    */
  var colCount: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates to define column width in the Spreadsheet.
    * @Default {64}
    */
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets the data to render the Spreadsheet.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable field as column header in the Spreadsheet.
    * @Default {false}
    */
  var fieldAsColumnHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value to freeze columns in the Spreadsheet.
    * @Default {0}
    */
  var frozenColumns: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value to freeze rows in the Spreadsheet.
    * @Default {0}
    */
  var frozenRows: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the header styles for the headers in datasource range.
    * @Default {null}
    */
  var headerStyles: js.UndefOr[js.Any] = js.undefined
  /** To hide the specified columns in Spreadsheet.
    * @Default {[]}
    */
  var hideColumns: js.UndefOr[js.Array[_]] = js.undefined
  /** To hide the specified rows in Spreadsheet.
    * @Default {[]}
    */
  var hideRows: js.UndefOr[js.Array[_]] = js.undefined
  /** To merge specified ranges in Spreadsheet.
    * @Default {[]}
    */
  var mergeCells: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the primary key for the datasource in Spreadsheet.
    */
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the query for the dataSource in Spreadsheet.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Specifies single range or multiple range settings for a sheet in Spreadsheet.
    * @Default {[]}
    */
  var rangeSettings: js.UndefOr[js.Array[SheetsRangeSetting]] = js.undefined
  /** Gets or sets a value that indicates to define row count in the Spreadsheet.
    * @Default {20}
    */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the rows for a sheet in Spreadsheet.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[SheetsRow]] = js.undefined
  /** Specifies the name for sheet in the Spreadsheet.
    * @Default {string}
    */
  var sheetName: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide grid lines in the Spreadsheet.
    * @Default {true}
    */
  var showGridlines: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
    * @Default {true}
    */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide headings in the Spreadsheet.
    * @Default {true}
    */
  var showHeadings: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the start cell for the datasource range in Spreadsheet.
    * @Default {A1}
    */
  var startCell: js.UndefOr[java.lang.String] = js.undefined
}

object Sheet {
  @scala.inline
  def apply(
    border: js.Array[SheetsBorder] = null,
    cFormatRule: js.Array[SheetsCFormatRule] = null,
    cellTypes: js.Array[_] = null,
    colCount: scala.Int | scala.Double = null,
    columnWidth: scala.Int | scala.Double = null,
    dataSource: js.Any = null,
    fieldAsColumnHeader: js.UndefOr[scala.Boolean] = js.undefined,
    frozenColumns: scala.Int | scala.Double = null,
    frozenRows: scala.Int | scala.Double = null,
    headerStyles: js.Any = null,
    hideColumns: js.Array[_] = null,
    hideRows: js.Array[_] = null,
    mergeCells: js.Array[_] = null,
    primaryKey: java.lang.String = null,
    query: js.Any = null,
    rangeSettings: js.Array[SheetsRangeSetting] = null,
    rowCount: scala.Int | scala.Double = null,
    rows: js.Array[SheetsRow] = null,
    sheetName: java.lang.String = null,
    showGridlines: js.UndefOr[scala.Boolean] = js.undefined,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showHeadings: js.UndefOr[scala.Boolean] = js.undefined,
    startCell: java.lang.String = null
  ): Sheet = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (cFormatRule != null) __obj.updateDynamic("cFormatRule")(cFormatRule)
    if (cellTypes != null) __obj.updateDynamic("cellTypes")(cellTypes)
    if (colCount != null) __obj.updateDynamic("colCount")(colCount.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(fieldAsColumnHeader)) __obj.updateDynamic("fieldAsColumnHeader")(fieldAsColumnHeader)
    if (frozenColumns != null) __obj.updateDynamic("frozenColumns")(frozenColumns.asInstanceOf[js.Any])
    if (frozenRows != null) __obj.updateDynamic("frozenRows")(frozenRows.asInstanceOf[js.Any])
    if (headerStyles != null) __obj.updateDynamic("headerStyles")(headerStyles)
    if (hideColumns != null) __obj.updateDynamic("hideColumns")(hideColumns)
    if (hideRows != null) __obj.updateDynamic("hideRows")(hideRows)
    if (mergeCells != null) __obj.updateDynamic("mergeCells")(mergeCells)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (query != null) __obj.updateDynamic("query")(query)
    if (rangeSettings != null) __obj.updateDynamic("rangeSettings")(rangeSettings)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName)
    if (!js.isUndefined(showGridlines)) __obj.updateDynamic("showGridlines")(showGridlines)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (!js.isUndefined(showHeadings)) __obj.updateDynamic("showHeadings")(showHeadings)
    if (startCell != null) __obj.updateDynamic("startCell")(startCell)
    __obj.asInstanceOf[Sheet]
  }
}

