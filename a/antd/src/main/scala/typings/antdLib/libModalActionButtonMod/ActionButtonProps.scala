package typings
package antdLib.libModalActionButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var buttonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  var closeModal: js.Function
  var `type`: js.UndefOr[antdLib.libButtonButtonMod.ButtonType] = js.undefined
}

object ActionButtonProps {
  @scala.inline
  def apply(
    closeModal: js.Function,
    actionFn: js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]] = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    buttonProps: antdLib.libButtonButtonMod.NativeButtonProps = null,
    `type`: antdLib.libButtonButtonMod.ButtonType = null
  ): ActionButtonProps = {
    val __obj = js.Dynamic.literal(closeModal = closeModal)
    if (actionFn != null) __obj.updateDynamic("actionFn")(actionFn)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionButtonProps]
  }
}

