package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldableProps extends js.Object {
  /** @see defineHold */
  var config: js.UndefOr[HoldableConfig] = js.undefined
  var onHoldComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHoldProgress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object HoldableProps {
  @scala.inline
  def apply(
    config: HoldableConfig = null,
    onHoldComplete: () => scala.Unit = null,
    onHoldProgress: () => scala.Unit = null,
    onMouseDown: () => scala.Unit = null,
    onTouchStart: () => scala.Unit = null
  ): HoldableProps = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (onHoldComplete != null) __obj.updateDynamic("onHoldComplete")(js.Any.fromFunction0(onHoldComplete))
    if (onHoldProgress != null) __obj.updateDynamic("onHoldProgress")(js.Any.fromFunction0(onHoldProgress))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction0(onMouseDown))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction0(onTouchStart))
    __obj.asInstanceOf[HoldableProps]
  }
}

