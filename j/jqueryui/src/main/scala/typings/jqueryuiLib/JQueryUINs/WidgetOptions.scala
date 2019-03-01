package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Widget //////////////////////////////////////////////////
trait WidgetOptions extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var hide: js.UndefOr[js.Any] = js.undefined
  var show: js.UndefOr[js.Any] = js.undefined
}

object WidgetOptions {
  @scala.inline
  def apply(disabled: js.UndefOr[scala.Boolean] = js.undefined, hide: js.Any = null, show: js.Any = null): WidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[WidgetOptions]
  }
}

