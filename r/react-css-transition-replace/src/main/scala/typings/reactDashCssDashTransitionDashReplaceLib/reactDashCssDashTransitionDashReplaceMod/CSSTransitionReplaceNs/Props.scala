package typings
package reactDashCssDashTransitionDashReplaceLib.reactDashCssDashTransitionDashReplaceMod.CSSTransitionReplaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Props extends js.Object {
  var changeWidth: js.UndefOr[scala.Boolean] = js.undefined
  var overflowHidden: js.UndefOr[scala.Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    changeWidth: js.UndefOr[scala.Boolean] = js.undefined,
    overflowHidden: js.UndefOr[scala.Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changeWidth)) __obj.updateDynamic("changeWidth")(changeWidth)
    if (!js.isUndefined(overflowHidden)) __obj.updateDynamic("overflowHidden")(overflowHidden)
    __obj.asInstanceOf[Props]
  }
}

