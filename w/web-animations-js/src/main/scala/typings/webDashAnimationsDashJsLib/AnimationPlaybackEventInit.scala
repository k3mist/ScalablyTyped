package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPlaybackEventInit
  extends stdLib.EventInit {
  var currentTime: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var timelineTime: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object AnimationPlaybackEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    currentTime: scala.Int | scala.Double = null,
    timelineTime: scala.Int | scala.Double = null
  ): AnimationPlaybackEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (timelineTime != null) __obj.updateDynamic("timelineTime")(timelineTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlaybackEventInit]
  }
}

