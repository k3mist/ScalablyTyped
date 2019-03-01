package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileSettings extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#profileSettings. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The player's current profile visibility. This field is visible to both 1P and 3P APIs. */
  var profileVisible: js.UndefOr[scala.Boolean] = js.undefined
}

object ProfileSettings {
  @scala.inline
  def apply(kind: java.lang.String = null, profileVisible: js.UndefOr[scala.Boolean] = js.undefined): ProfileSettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(profileVisible)) __obj.updateDynamic("profileVisible")(profileVisible)
    __obj.asInstanceOf[ProfileSettings]
  }
}

