package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRollingModeOption extends js.Object {
  var follow: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object TimelineRollingModeOption {
  @scala.inline
  def apply(follow: js.UndefOr[scala.Boolean] = js.undefined, offset: scala.Int | scala.Double = null): TimelineRollingModeOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRollingModeOption]
  }
}

