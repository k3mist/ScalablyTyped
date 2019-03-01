package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostOptions extends js.Object {
  var clicks: js.UndefOr[scala.Boolean] = js.undefined
  var forms: js.UndefOr[FormsOptions | scala.Boolean] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
}

object GhostOptions {
  @scala.inline
  def apply(
    clicks: js.UndefOr[scala.Boolean] = js.undefined,
    forms: FormsOptions | scala.Boolean = null,
    scroll: js.UndefOr[scala.Boolean] = js.undefined
  ): GhostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clicks)) __obj.updateDynamic("clicks")(clicks)
    if (forms != null) __obj.updateDynamic("forms")(forms.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    __obj.asInstanceOf[GhostOptions]
  }
}

