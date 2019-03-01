package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryCellInfoEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns grid cell.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the column object.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns current row record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the foreign key record object (JSON).
    */
  var foreignKeyData: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current row record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the text value in the cell.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object QueryCellInfoEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cell: js.Any = null,
    column: js.Any = null,
    data: js.Any = null,
    foreignKeyData: js.Any = null,
    model: js.Any = null,
    rowData: js.Any = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): QueryCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (column != null) __obj.updateDynamic("column")(column)
    if (data != null) __obj.updateDynamic("data")(data)
    if (foreignKeyData != null) __obj.updateDynamic("foreignKeyData")(foreignKeyData)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryCellInfoEventArgs]
  }
}

