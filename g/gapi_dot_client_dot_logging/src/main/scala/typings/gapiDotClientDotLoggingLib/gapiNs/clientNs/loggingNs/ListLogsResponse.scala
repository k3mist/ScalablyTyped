package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLogsResponse extends js.Object {
  /** A list of log names. For example, "projects/my-project/syslog" or "organizations/123/cloudresourcemanager.googleapis.com%2Factivity". */
  var logNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method
    * again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListLogsResponse {
  @scala.inline
  def apply(logNames: js.Array[java.lang.String] = null, nextPageToken: java.lang.String = null): ListLogsResponse = {
    val __obj = js.Dynamic.literal()
    if (logNames != null) __obj.updateDynamic("logNames")(logNames)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListLogsResponse]
  }
}

