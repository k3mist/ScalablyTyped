package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateValuesResponse extends js.Object {
  /**
    * One UpdateValuesResponse per requested range, in the same order as
    * the requests appeared.
    */
  var responses: js.UndefOr[js.Array[UpdateValuesResponse]] = js.undefined
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of cells updated. */
  var totalUpdatedCells: js.UndefOr[scala.Double] = js.undefined
  /**
    * The total number of columns where at least one cell in the column was
    * updated.
    */
  var totalUpdatedColumns: js.UndefOr[scala.Double] = js.undefined
  /** The total number of rows where at least one cell in the row was updated. */
  var totalUpdatedRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * The total number of sheets where at least one cell in the sheet was
    * updated.
    */
  var totalUpdatedSheets: js.UndefOr[scala.Double] = js.undefined
}

object BatchUpdateValuesResponse {
  @scala.inline
  def apply(
    responses: js.Array[UpdateValuesResponse] = null,
    spreadsheetId: java.lang.String = null,
    totalUpdatedCells: scala.Int | scala.Double = null,
    totalUpdatedColumns: scala.Int | scala.Double = null,
    totalUpdatedRows: scala.Int | scala.Double = null,
    totalUpdatedSheets: scala.Int | scala.Double = null
  ): BatchUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (totalUpdatedCells != null) __obj.updateDynamic("totalUpdatedCells")(totalUpdatedCells.asInstanceOf[js.Any])
    if (totalUpdatedColumns != null) __obj.updateDynamic("totalUpdatedColumns")(totalUpdatedColumns.asInstanceOf[js.Any])
    if (totalUpdatedRows != null) __obj.updateDynamic("totalUpdatedRows")(totalUpdatedRows.asInstanceOf[js.Any])
    if (totalUpdatedSheets != null) __obj.updateDynamic("totalUpdatedSheets")(totalUpdatedSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateValuesResponse]
  }
}

