package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStepsResponse extends js.Object {
  /**
    * A continuation token to resume the query at the next item.
    *
    * If set, indicates that there are more steps to read, by calling list again with this value in the page_token field.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Steps. */
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
}

object ListStepsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, steps: js.Array[Step] = null): ListStepsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (steps != null) __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[ListStepsResponse]
  }
}

