package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the element of clicked cell.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the clicked cell.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the data of clicked cell.
    */
  var cellValue: js.UndefOr[js.Any] = js.undefined
  /** Returns the column name of the clicked cell.
    */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the element of the clicked row.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the clicked row.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object RecordClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cell: js.Any = null,
    cellIndex: scala.Int | scala.Double = null,
    cellValue: js.Any = null,
    columnName: java.lang.String = null,
    row: js.Any = null,
    rowIndex: scala.Int | scala.Double = null
  ): RecordClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordClickEventArgs]
  }
}

