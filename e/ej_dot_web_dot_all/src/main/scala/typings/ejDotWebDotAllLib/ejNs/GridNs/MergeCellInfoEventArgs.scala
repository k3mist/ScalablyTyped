package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCellInfoEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns grid cell.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Method to merge Grid columns.
    */
  var colMerge: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Returns the column object.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns current row record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Method to merge Grid rows and columns.
    */
  var merge: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current row record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Method to merge Grid rows.
    */
  var rowMerge: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Returns the text value in the cell.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MergeCellInfoEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cell: js.Any = null,
    colMerge: js.Function0[scala.Unit] = null,
    column: js.Any = null,
    data: js.Any = null,
    merge: js.Function0[scala.Unit] = null,
    model: js.Any = null,
    rowData: js.Any = null,
    rowMerge: js.Function0[scala.Unit] = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): MergeCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (colMerge != null) __obj.updateDynamic("colMerge")(colMerge)
    if (column != null) __obj.updateDynamic("column")(column)
    if (data != null) __obj.updateDynamic("data")(data)
    if (merge != null) __obj.updateDynamic("merge")(merge)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (rowMerge != null) __obj.updateDynamic("rowMerge")(rowMerge)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MergeCellInfoEventArgs]
  }
}

