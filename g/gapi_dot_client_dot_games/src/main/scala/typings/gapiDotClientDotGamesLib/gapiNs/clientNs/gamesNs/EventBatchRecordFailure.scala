package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBatchRecordFailure extends js.Object {
  /**
    * The cause for the update failure.
    * Possible values are:
    * - "TOO_LARGE": A batch request was issued with more events than are allowed in a single batch.
    * - "TIME_PERIOD_EXPIRED": A batch was sent with data too far in the past to record.
    * - "TIME_PERIOD_SHORT": A batch was sent with a time range that was too short.
    * - "TIME_PERIOD_LONG": A batch was sent with a time range that was too long.
    * - "ALREADY_UPDATED": An attempt was made to record a batch of data which was already seen.
    * - "RECORD_RATE_HIGH": An attempt was made to record data faster than the server will apply updates.
    */
  var failureCause: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventBatchRecordFailure. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The time range which was rejected; empty for a request-wide failure. */
  var range: js.UndefOr[EventPeriodRange] = js.undefined
}

object EventBatchRecordFailure {
  @scala.inline
  def apply(
    failureCause: java.lang.String = null,
    kind: java.lang.String = null,
    range: EventPeriodRange = null
  ): EventBatchRecordFailure = {
    val __obj = js.Dynamic.literal()
    if (failureCause != null) __obj.updateDynamic("failureCause")(failureCause)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[EventBatchRecordFailure]
  }
}

