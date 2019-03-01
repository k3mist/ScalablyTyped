package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuAnimation extends js.Object {
  var close: js.UndefOr[MenuAnimationClose] = js.undefined
  var open: js.UndefOr[MenuAnimationOpen] = js.undefined
}

object MenuAnimation {
  @scala.inline
  def apply(close: MenuAnimationClose = null, open: MenuAnimationOpen = null): MenuAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[MenuAnimation]
  }
}

