package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLogsResource extends js.Object {
  /** Gets one change log by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ChangeLog]
  /** Retrieves a list of change logs. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_Action): gapiDotClientLib.gapiNs.clientNs.Request[ChangeLogsListResponse]
}

object ChangeLogsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotDfareportingLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[ChangeLog],
    list: gapiDotClientDotDfareportingLib.Anon_Action => gapiDotClientLib.gapiNs.clientNs.Request[ChangeLogsListResponse]
  ): ChangeLogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ChangeLogsResource]
  }
}

