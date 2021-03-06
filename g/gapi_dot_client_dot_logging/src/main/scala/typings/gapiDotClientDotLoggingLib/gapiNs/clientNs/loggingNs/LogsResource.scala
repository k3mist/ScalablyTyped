package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogsResource extends js.Object {
  /**
    * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not
    * be deleted.
    */
  def delete(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed. */
  def list(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListLogsResponse]
}

object LogsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    list: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ListLogsResponse]
  ): LogsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LogsResource]
  }
}

