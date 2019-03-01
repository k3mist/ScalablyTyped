package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementResetAllResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#achievementResetAllResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The achievement reset results. */
  var results: js.UndefOr[js.Array[AchievementResetResponse]] = js.undefined
}

object AchievementResetAllResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, results: js.Array[AchievementResetResponse] = null): AchievementResetAllResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[AchievementResetAllResponse]
  }
}

