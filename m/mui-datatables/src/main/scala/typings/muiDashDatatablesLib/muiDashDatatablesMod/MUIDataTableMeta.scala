package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableMeta extends js.Object {
  var columnData: js.Array[MUIDataTableColumnOptions]
  var columnIndex: scala.Double
  var rowData: js.Array[_]
  var rowIndex: scala.Double
  var tableData: js.Array[MUIDataTableData]
  var tableState: MUIDataTableState
}

object MUIDataTableMeta {
  @scala.inline
  def apply(
    columnData: js.Array[MUIDataTableColumnOptions],
    columnIndex: scala.Double,
    rowData: js.Array[_],
    rowIndex: scala.Double,
    tableData: js.Array[MUIDataTableData],
    tableState: MUIDataTableState
  ): MUIDataTableMeta = {
    val __obj = js.Dynamic.literal(columnData = columnData, columnIndex = columnIndex, rowData = rowData, rowIndex = rowIndex, tableData = tableData, tableState = tableState)
  
    __obj.asInstanceOf[MUIDataTableMeta]
  }
}

