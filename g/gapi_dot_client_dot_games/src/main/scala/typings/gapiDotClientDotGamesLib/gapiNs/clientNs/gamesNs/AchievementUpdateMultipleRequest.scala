package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementUpdateMultipleRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateMultipleRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The individual achievement update requests. */
  var updates: js.UndefOr[js.Array[AchievementUpdateRequest]] = js.undefined
}

object AchievementUpdateMultipleRequest {
  @scala.inline
  def apply(kind: java.lang.String = null, updates: js.Array[AchievementUpdateRequest] = null): AchievementUpdateMultipleRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (updates != null) __obj.updateDynamic("updates")(updates)
    __obj.asInstanceOf[AchievementUpdateMultipleRequest]
  }
}

