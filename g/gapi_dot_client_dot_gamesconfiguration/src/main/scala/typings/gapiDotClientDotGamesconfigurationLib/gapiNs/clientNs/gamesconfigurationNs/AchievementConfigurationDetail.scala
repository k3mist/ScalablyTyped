package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationDetail extends js.Object {
  /** Localized strings for the achievement description. */
  var description: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** The icon url of this achievement. Writes to this field are ignored. */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#achievementConfigurationDetail. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Localized strings for the achievement name. */
  var name: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** Point value for the achievement. */
  var pointValue: js.UndefOr[scala.Double] = js.undefined
  /** The sort rank of this achievement. Writes to this field are ignored. */
  var sortRank: js.UndefOr[scala.Double] = js.undefined
}

object AchievementConfigurationDetail {
  @scala.inline
  def apply(
    description: LocalizedStringBundle = null,
    iconUrl: java.lang.String = null,
    kind: java.lang.String = null,
    name: LocalizedStringBundle = null,
    pointValue: scala.Int | scala.Double = null,
    sortRank: scala.Int | scala.Double = null
  ): AchievementConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pointValue != null) __obj.updateDynamic("pointValue")(pointValue.asInstanceOf[js.Any])
    if (sortRank != null) __obj.updateDynamic("sortRank")(sortRank.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchievementConfigurationDetail]
  }
}

