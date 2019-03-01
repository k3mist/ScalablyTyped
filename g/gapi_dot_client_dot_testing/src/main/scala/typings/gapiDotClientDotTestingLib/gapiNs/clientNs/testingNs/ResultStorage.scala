package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultStorage extends js.Object {
  /** Required. */
  var googleCloudStorage: js.UndefOr[GoogleCloudStorage] = js.undefined
  /**
    * The tool results execution that results are written to.
    * @OutputOnly
    */
  var toolResultsExecution: js.UndefOr[ToolResultsExecution] = js.undefined
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.
    *
    * Optional, if not provided the service will choose an appropriate value.
    */
  var toolResultsHistory: js.UndefOr[ToolResultsHistory] = js.undefined
}

object ResultStorage {
  @scala.inline
  def apply(
    googleCloudStorage: GoogleCloudStorage = null,
    toolResultsExecution: ToolResultsExecution = null,
    toolResultsHistory: ToolResultsHistory = null
  ): ResultStorage = {
    val __obj = js.Dynamic.literal()
    if (googleCloudStorage != null) __obj.updateDynamic("googleCloudStorage")(googleCloudStorage)
    if (toolResultsExecution != null) __obj.updateDynamic("toolResultsExecution")(toolResultsExecution)
    if (toolResultsHistory != null) __obj.updateDynamic("toolResultsHistory")(toolResultsHistory)
    __obj.asInstanceOf[ResultStorage]
  }
}

