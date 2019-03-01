package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAddEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the column index.
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the column object.
    */
  var columnObject: js.UndefOr[js.Any] = js.undefined
  /** Returns deleted data.
    */
  var defaultData: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the primaryKey.
    */
  var primaryKey: js.UndefOr[js.Any] = js.undefined
  /** Returns the row element.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BatchAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cell: js.Any = null,
    columnIndex: scala.Int | scala.Double = null,
    columnObject: js.Any = null,
    defaultData: js.Any = null,
    model: js.Any = null,
    primaryKey: js.Any = null,
    row: js.Any = null,
    `type`: java.lang.String = null
  ): BatchAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnObject != null) __obj.updateDynamic("columnObject")(columnObject)
    if (defaultData != null) __obj.updateDynamic("defaultData")(defaultData)
    if (model != null) __obj.updateDynamic("model")(model)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (row != null) __obj.updateDynamic("row")(row)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BatchAddEventArgs]
  }
}

