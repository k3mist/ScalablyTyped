package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var onEnd: js.UndefOr[js.Function] = js.undefined
  var onPause: js.UndefOr[js.Function] = js.undefined
  var onPlay: js.UndefOr[js.Function] = js.undefined
  var onResume: js.UndefOr[js.Function] = js.undefined
  var onStop: js.UndefOr[js.Function] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var startTime: js.UndefOr[scala.Double] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    onEnd: js.Function = null,
    onPause: js.Function = null,
    onPlay: js.Function = null,
    onResume: js.Function = null,
    onStop: js.Function = null,
    pitch: scala.Int | scala.Double = null,
    startTime: scala.Int | scala.Double = null,
    volume: scala.Int | scala.Double = null
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onResume != null) __obj.updateDynamic("onResume")(onResume)
    if (onStop != null) __obj.updateDynamic("onStop")(onStop)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Duration]
  }
}

