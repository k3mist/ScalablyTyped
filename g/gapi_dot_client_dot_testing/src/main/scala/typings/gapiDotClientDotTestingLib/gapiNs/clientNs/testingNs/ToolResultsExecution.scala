package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolResultsExecution extends js.Object {
  /**
    * A tool results execution ID.
    * @OutputOnly
    */
  var executionId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A tool results history ID.
    * @OutputOnly
    */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The cloud project that owns the tool results execution.
    * @OutputOnly
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object ToolResultsExecution {
  @scala.inline
  def apply(
    executionId: java.lang.String = null,
    historyId: java.lang.String = null,
    projectId: java.lang.String = null
  ): ToolResultsExecution = {
    val __obj = js.Dynamic.literal()
    if (executionId != null) __obj.updateDynamic("executionId")(executionId)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ToolResultsExecution]
  }
}

