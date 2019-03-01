package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheet extends js.Object {
  var activeCell: js.UndefOr[java.lang.String] = js.undefined
  var columns: js.UndefOr[js.Array[SpreadsheetSheetColumn]] = js.undefined
  var dataSource: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var filter: js.UndefOr[SpreadsheetSheetFilter] = js.undefined
  var frozenColumns: js.UndefOr[scala.Double] = js.undefined
  var frozenRows: js.UndefOr[scala.Double] = js.undefined
  var mergedCells: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[SpreadsheetSheetRow]] = js.undefined
  var selection: js.UndefOr[java.lang.String] = js.undefined
  var showGridLines: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[SpreadsheetSheetSort] = js.undefined
}

object SpreadsheetSheet {
  @scala.inline
  def apply(
    activeCell: java.lang.String = null,
    columns: js.Array[SpreadsheetSheetColumn] = null,
    dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    filter: SpreadsheetSheetFilter = null,
    frozenColumns: scala.Int | scala.Double = null,
    frozenRows: scala.Int | scala.Double = null,
    mergedCells: js.Any = null,
    name: java.lang.String = null,
    rows: js.Array[SpreadsheetSheetRow] = null,
    selection: java.lang.String = null,
    showGridLines: js.UndefOr[scala.Boolean] = js.undefined,
    sort: SpreadsheetSheetSort = null
  ): SpreadsheetSheet = {
    val __obj = js.Dynamic.literal()
    if (activeCell != null) __obj.updateDynamic("activeCell")(activeCell)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (frozenColumns != null) __obj.updateDynamic("frozenColumns")(frozenColumns.asInstanceOf[js.Any])
    if (frozenRows != null) __obj.updateDynamic("frozenRows")(frozenRows.asInstanceOf[js.Any])
    if (mergedCells != null) __obj.updateDynamic("mergedCells")(mergedCells)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[SpreadsheetSheet]
  }
}

