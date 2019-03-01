package typings
package electronDashSettingsLib.electronDashSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsOptions extends js.Object {
  /**
    * Prettify the JSON output. Defaults to `false`.
    */
  var prettify: js.UndefOr[scala.Boolean] = js.undefined
}

object SettingsOptions {
  @scala.inline
  def apply(prettify: js.UndefOr[scala.Boolean] = js.undefined): SettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(prettify)) __obj.updateDynamic("prettify")(prettify)
    __obj.asInstanceOf[SettingsOptions]
  }
}

