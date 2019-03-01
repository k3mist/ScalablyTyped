package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cell index on the selection.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selecting record object
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Gantt object Model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected cell index
    */
  var previousCellIndex: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row data
    */
  var previousData: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row index
    */
  var previousRowIndex: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected cell element
    */
  var previousTargetCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row element
    */
  var previousTargetRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index on the selection
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selecting cell element
    */
  var targetCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the selecting row element
    */
  var targetRow: js.UndefOr[js.Any] = js.undefined
}

object CellSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cellIndex: scala.Int | scala.Double = null,
    data: js.Any = null,
    model: js.Any = null,
    previousCellIndex: js.Any = null,
    previousData: js.Any = null,
    previousRowIndex: js.Any = null,
    previousTargetCell: js.Any = null,
    previousTargetRow: js.Any = null,
    rowIndex: scala.Int | scala.Double = null,
    targetCell: js.Any = null,
    targetRow: js.Any = null
  ): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousCellIndex != null) __obj.updateDynamic("previousCellIndex")(previousCellIndex)
    if (previousData != null) __obj.updateDynamic("previousData")(previousData)
    if (previousRowIndex != null) __obj.updateDynamic("previousRowIndex")(previousRowIndex)
    if (previousTargetCell != null) __obj.updateDynamic("previousTargetCell")(previousTargetCell)
    if (previousTargetRow != null) __obj.updateDynamic("previousTargetRow")(previousTargetRow)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (targetCell != null) __obj.updateDynamic("targetCell")(targetCell)
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow)
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
}

