package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerScoreListResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerScoreListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The score submissions statuses. */
  var submittedScores: js.UndefOr[js.Array[PlayerScoreResponse]] = js.undefined
}

object PlayerScoreListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, submittedScores: js.Array[PlayerScoreResponse] = null): PlayerScoreListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (submittedScores != null) __obj.updateDynamic("submittedScores")(submittedScores)
    __obj.asInstanceOf[PlayerScoreListResponse]
  }
}

