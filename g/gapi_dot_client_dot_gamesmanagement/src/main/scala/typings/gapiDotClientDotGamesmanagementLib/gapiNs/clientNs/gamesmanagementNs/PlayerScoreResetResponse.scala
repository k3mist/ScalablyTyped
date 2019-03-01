package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerScoreResetResponse extends js.Object {
  /** The ID of an leaderboard for which player state has been updated. */
  var definitionId: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#playerScoreResetResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time spans of the updated score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time score.
    * - "WEEKLY" - The score is a weekly score.
    * - "DAILY" - The score is a daily score.
    */
  var resetScoreTimeSpans: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PlayerScoreResetResponse {
  @scala.inline
  def apply(
    definitionId: java.lang.String = null,
    kind: java.lang.String = null,
    resetScoreTimeSpans: js.Array[java.lang.String] = null
  ): PlayerScoreResetResponse = {
    val __obj = js.Dynamic.literal()
    if (definitionId != null) __obj.updateDynamic("definitionId")(definitionId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resetScoreTimeSpans != null) __obj.updateDynamic("resetScoreTimeSpans")(resetScoreTimeSpans)
    __obj.asInstanceOf[PlayerScoreResetResponse]
  }
}

