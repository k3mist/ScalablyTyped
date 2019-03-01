package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actions: js.UndefOr[
    js.Array[java.lang.String] | js.Array[reactLib.reactMod.Global.JSXNs.Element] | js.Array[reactDashNativeDashMaterialDashUiLib.Anon_Icon]
  ] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_Container] = js.undefined
  var transition: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.toolbar | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.speedDial
  ] = js.undefined
}

object ActionButtonProps {
  @scala.inline
  def apply(
    actions: js.Array[java.lang.String] | js.Array[reactLib.reactMod.Global.JSXNs.Element] | js.Array[reactDashNativeDashMaterialDashUiLib.Anon_Icon] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    onLongPress: js.Function0[scala.Unit] = null,
    onPress: js.Function0[scala.Unit] = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_Container = null,
    transition: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.toolbar | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.speedDial = null
  ): ActionButtonProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonProps]
  }
}

