package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRecordFailure extends js.Object {
  /** The ID of the event that was not updated. */
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The cause for the update failure.
    * Possible values are:
    * - "NOT_FOUND" - An attempt was made to set an event that was not defined.
    * - "INVALID_UPDATE_VALUE" - An attempt was made to increment an event by a non-positive value.
    */
  var failureCause: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventRecordFailure. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object EventRecordFailure {
  @scala.inline
  def apply(
    eventId: java.lang.String = null,
    failureCause: java.lang.String = null,
    kind: java.lang.String = null
  ): EventRecordFailure = {
    val __obj = js.Dynamic.literal()
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (failureCause != null) __obj.updateDynamic("failureCause")(failureCause)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EventRecordFailure]
  }
}

