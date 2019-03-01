package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfiguration extends js.Object {
  /** The draft data of the leaderboard. */
  var draft: js.UndefOr[LeaderboardConfigurationDetail] = js.undefined
  /** The ID of the leaderboard. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#leaderboardConfiguration. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The read-only published data of the leaderboard. */
  var published: js.UndefOr[LeaderboardConfigurationDetail] = js.undefined
  /** Maximum score that can be posted to this leaderboard. */
  var scoreMax: js.UndefOr[java.lang.String] = js.undefined
  /** Minimum score that can be posted to this leaderboard. */
  var scoreMin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the leaderboard.
    * Possible values are:
    * - "LARGER_IS_BETTER" - Larger scores posted are ranked higher.
    * - "SMALLER_IS_BETTER" - Smaller scores posted are ranked higher.
    */
  var scoreOrder: js.UndefOr[java.lang.String] = js.undefined
  /** The token for this resource. */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object LeaderboardConfiguration {
  @scala.inline
  def apply(
    draft: LeaderboardConfigurationDetail = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    published: LeaderboardConfigurationDetail = null,
    scoreMax: java.lang.String = null,
    scoreMin: java.lang.String = null,
    scoreOrder: java.lang.String = null,
    token: java.lang.String = null
  ): LeaderboardConfiguration = {
    val __obj = js.Dynamic.literal()
    if (draft != null) __obj.updateDynamic("draft")(draft)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (published != null) __obj.updateDynamic("published")(published)
    if (scoreMax != null) __obj.updateDynamic("scoreMax")(scoreMax)
    if (scoreMin != null) __obj.updateDynamic("scoreMin")(scoreMin)
    if (scoreOrder != null) __obj.updateDynamic("scoreOrder")(scoreOrder)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[LeaderboardConfiguration]
  }
}

