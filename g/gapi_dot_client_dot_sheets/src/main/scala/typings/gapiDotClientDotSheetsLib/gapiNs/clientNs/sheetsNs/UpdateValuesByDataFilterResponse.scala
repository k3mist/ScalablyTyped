package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateValuesByDataFilterResponse extends js.Object {
  /** The data filter that selected the range that was updated. */
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
  /** The number of cells updated. */
  var updatedCells: js.UndefOr[scala.Double] = js.undefined
  /** The number of columns where at least one cell in the column was updated. */
  var updatedColumns: js.UndefOr[scala.Double] = js.undefined
  /**
    * The values of the cells in the range matched by the dataFilter after all
    * updates were applied. This is only included if the request's
    * `includeValuesInResponse` field was `true`.
    */
  var updatedData: js.UndefOr[ValueRange] = js.undefined
  /** The range (in A1 notation) that updates were applied to. */
  var updatedRange: js.UndefOr[java.lang.String] = js.undefined
  /** The number of rows where at least one cell in the row was updated. */
  var updatedRows: js.UndefOr[scala.Double] = js.undefined
}

object UpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(
    dataFilter: DataFilter = null,
    updatedCells: scala.Int | scala.Double = null,
    updatedColumns: scala.Int | scala.Double = null,
    updatedData: ValueRange = null,
    updatedRange: java.lang.String = null,
    updatedRows: scala.Int | scala.Double = null
  ): UpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter)
    if (updatedCells != null) __obj.updateDynamic("updatedCells")(updatedCells.asInstanceOf[js.Any])
    if (updatedColumns != null) __obj.updateDynamic("updatedColumns")(updatedColumns.asInstanceOf[js.Any])
    if (updatedData != null) __obj.updateDynamic("updatedData")(updatedData)
    if (updatedRange != null) __obj.updateDynamic("updatedRange")(updatedRange)
    if (updatedRows != null) __obj.updateDynamic("updatedRows")(updatedRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValuesByDataFilterResponse]
  }
}

