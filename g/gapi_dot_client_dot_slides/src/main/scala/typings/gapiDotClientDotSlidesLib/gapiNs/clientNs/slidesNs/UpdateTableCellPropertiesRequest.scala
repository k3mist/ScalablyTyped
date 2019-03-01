package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableCellPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `tableCellProperties` is
    * implied and should not be specified. A single `"&#42;"` can be used as
    * short-hand for listing every field.
    *
    * For example to update the table cell background solid fill color, set
    * `fields` to `"tableCellBackgroundFill.solidFill.color"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The object ID of the table. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** The table cell properties to update. */
  var tableCellProperties: js.UndefOr[TableCellProperties] = js.undefined
  /**
    * The table range representing the subset of the table to which the updates
    * are applied. If a table range is not specified, the updates will apply to
    * the entire table.
    */
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object UpdateTableCellPropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    tableCellProperties: TableCellProperties = null,
    tableRange: TableRange = null
  ): UpdateTableCellPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (tableCellProperties != null) __obj.updateDynamic("tableCellProperties")(tableCellProperties)
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange)
    __obj.asInstanceOf[UpdateTableCellPropertiesRequest]
  }
}

