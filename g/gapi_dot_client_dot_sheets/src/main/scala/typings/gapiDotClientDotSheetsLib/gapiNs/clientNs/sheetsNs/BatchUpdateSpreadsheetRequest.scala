package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateSpreadsheetRequest extends js.Object {
  /**
    * Determines if the update response should include the spreadsheet
    * resource.
    */
  var includeSpreadsheetInResponse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of updates to apply to the spreadsheet.
    * Requests will be applied in the order they are specified.
    * If any request is not valid, no requests will be applied.
    */
  var requests: js.UndefOr[js.Array[Request]] = js.undefined
  /**
    * True if grid data should be returned. Meaningful only if
    * if include_spreadsheet_response is 'true'.
    * This parameter is ignored if a field mask was set in the request.
    */
  var responseIncludeGridData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Limits the ranges included in the response spreadsheet.
    * Meaningful only if include_spreadsheet_response is 'true'.
    */
  var responseRanges: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BatchUpdateSpreadsheetRequest {
  @scala.inline
  def apply(
    includeSpreadsheetInResponse: js.UndefOr[scala.Boolean] = js.undefined,
    requests: js.Array[Request] = null,
    responseIncludeGridData: js.UndefOr[scala.Boolean] = js.undefined,
    responseRanges: js.Array[java.lang.String] = null
  ): BatchUpdateSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSpreadsheetInResponse)) __obj.updateDynamic("includeSpreadsheetInResponse")(includeSpreadsheetInResponse)
    if (requests != null) __obj.updateDynamic("requests")(requests)
    if (!js.isUndefined(responseIncludeGridData)) __obj.updateDynamic("responseIncludeGridData")(responseIncludeGridData)
    if (responseRanges != null) __obj.updateDynamic("responseRanges")(responseRanges)
    __obj.asInstanceOf[BatchUpdateSpreadsheetRequest]
  }
}

