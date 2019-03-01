package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResetMultipleForAllRequest extends js.Object {
  /** The IDs of events to reset. */
  var event_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#eventsResetMultipleForAllRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object EventsResetMultipleForAllRequest {
  @scala.inline
  def apply(event_ids: js.Array[java.lang.String] = null, kind: java.lang.String = null): EventsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (event_ids != null) __obj.updateDynamic("event_ids")(event_ids)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EventsResetMultipleForAllRequest]
  }
}

