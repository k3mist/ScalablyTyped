package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListExecutionsResponse extends js.Object {
  /**
    * Executions.
    *
    * Always set.
    */
  var executions: js.UndefOr[js.Array[Execution]] = js.undefined
  /**
    * A continuation token to resume the query at the next item.
    *
    * Will only be set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListExecutionsResponse {
  @scala.inline
  def apply(executions: js.Array[Execution] = null, nextPageToken: java.lang.String = null): ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (executions != null) __obj.updateDynamic("executions")(executions)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListExecutionsResponse]
  }
}

