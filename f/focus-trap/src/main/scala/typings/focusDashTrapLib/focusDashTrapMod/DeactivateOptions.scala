package typings
package focusDashTrapLib.focusDashTrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'onDeactivate' ]: focus-trap.focus-trap.Options[P]} */ trait DeactivateOptions extends js.Object {
  var returnFocus: js.UndefOr[scala.Boolean] = js.undefined
}

object DeactivateOptions {
  @scala.inline
  def apply(returnFocus: js.UndefOr[scala.Boolean] = js.undefined): DeactivateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus)
    __obj.asInstanceOf[DeactivateOptions]
  }
}

