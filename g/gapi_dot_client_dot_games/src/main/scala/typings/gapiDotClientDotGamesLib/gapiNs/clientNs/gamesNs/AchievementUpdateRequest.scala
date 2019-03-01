package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementUpdateRequest extends js.Object {
  /** The achievement this update is being applied to. */
  var achievementId: js.UndefOr[java.lang.String] = js.undefined
  /** The payload if an update of type INCREMENT was requested for the achievement. */
  var incrementPayload: js.UndefOr[GamesAchievementIncrement] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The payload if an update of type SET_STEPS_AT_LEAST was requested for the achievement. */
  var setStepsAtLeastPayload: js.UndefOr[GamesAchievementSetStepsAtLeast] = js.undefined
  /**
    * The type of update being applied.
    * Possible values are:
    * - "REVEAL" - Achievement is revealed.
    * - "UNLOCK" - Achievement is unlocked.
    * - "INCREMENT" - Achievement is incremented.
    * - "SET_STEPS_AT_LEAST" - Achievement progress is set to at least the passed value.
    */
  var updateType: js.UndefOr[java.lang.String] = js.undefined
}

object AchievementUpdateRequest {
  @scala.inline
  def apply(
    achievementId: java.lang.String = null,
    incrementPayload: GamesAchievementIncrement = null,
    kind: java.lang.String = null,
    setStepsAtLeastPayload: GamesAchievementSetStepsAtLeast = null,
    updateType: java.lang.String = null
  ): AchievementUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (achievementId != null) __obj.updateDynamic("achievementId")(achievementId)
    if (incrementPayload != null) __obj.updateDynamic("incrementPayload")(incrementPayload)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (setStepsAtLeastPayload != null) __obj.updateDynamic("setStepsAtLeastPayload")(setStepsAtLeastPayload)
    if (updateType != null) __obj.updateDynamic("updateType")(updateType)
    __obj.asInstanceOf[AchievementUpdateRequest]
  }
}

