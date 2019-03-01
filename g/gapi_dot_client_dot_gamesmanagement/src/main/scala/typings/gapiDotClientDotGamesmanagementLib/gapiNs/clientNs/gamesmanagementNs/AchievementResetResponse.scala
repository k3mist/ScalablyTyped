package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementResetResponse extends js.Object {
  /**
    * The current state of the achievement. This is the same as the initial state of the achievement.
    * Possible values are:
    * - "HIDDEN"- Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var currentState: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of an achievement for which player state has been updated. */
  var definitionId: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#achievementResetResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Flag to indicate if the requested update actually occurred. */
  var updateOccurred: js.UndefOr[scala.Boolean] = js.undefined
}

object AchievementResetResponse {
  @scala.inline
  def apply(
    currentState: java.lang.String = null,
    definitionId: java.lang.String = null,
    kind: java.lang.String = null,
    updateOccurred: js.UndefOr[scala.Boolean] = js.undefined
  ): AchievementResetResponse = {
    val __obj = js.Dynamic.literal()
    if (currentState != null) __obj.updateDynamic("currentState")(currentState)
    if (definitionId != null) __obj.updateDynamic("definitionId")(definitionId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(updateOccurred)) __obj.updateDynamic("updateOccurred")(updateOccurred)
    __obj.asInstanceOf[AchievementResetResponse]
  }
}

