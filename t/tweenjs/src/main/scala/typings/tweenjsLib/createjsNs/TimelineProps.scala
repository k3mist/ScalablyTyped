package typings
package tweenjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineProps extends js.Object {
  var bounce: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreGlobalPause: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ createjsDashLibLib.createjsNs.Event, scala.Unit]] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* e */ createjsDashLibLib.createjsNs.Event, scala.Unit]] = js.undefined
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  var timeScale: js.UndefOr[scala.Double] = js.undefined
  var useTicks: js.UndefOr[scala.Boolean] = js.undefined
}

object TimelineProps {
  @scala.inline
  def apply(
    bounce: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreGlobalPause: js.UndefOr[scala.Boolean] = js.undefined,
    loop: scala.Int | scala.Double = null,
    onChange: /* e */ createjsDashLibLib.createjsNs.Event => scala.Unit = null,
    onComplete: /* e */ createjsDashLibLib.createjsNs.Event => scala.Unit = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    position: scala.Int | scala.Double = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    timeScale: scala.Int | scala.Double = null,
    useTicks: js.UndefOr[scala.Boolean] = js.undefined
  ): TimelineProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce)
    if (!js.isUndefined(ignoreGlobalPause)) __obj.updateDynamic("ignoreGlobalPause")(ignoreGlobalPause)
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useTicks)) __obj.updateDynamic("useTicks")(useTicks)
    __obj.asInstanceOf[TimelineProps]
  }
}

