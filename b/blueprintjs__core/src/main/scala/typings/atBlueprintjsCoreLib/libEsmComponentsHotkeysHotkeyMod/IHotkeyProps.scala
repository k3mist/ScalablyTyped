package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotkeyProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Whether the hotkey should be triggerable when focused in a text input.
    * @default false
    */
  var allowInInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hotkey combination string, such as "space" or "cmd+n".
    */
  var combo: java.lang.String
  /**
    * Whether the hotkey cannot be triggered.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false`, the hotkey is active only when the target is focused. If
    * `true`, the hotkey can be triggered regardless of what component is
    * focused.
    * @default false
    */
  var global: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Unless the hotkey is global, you must specify a group where the hotkey
    * will be displayed in the hotkeys dialog. This string will be displayed
    * in a header at the start of the group of hotkeys.
    */
  var group: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Human-friendly label for the hotkey.
    */
  var label: java.lang.String
  /**
    * `keydown` event handler.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ reactLib.KeyboardEvent, _]] = js.undefined
  /**
    * `keyup` event handler.
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ reactLib.KeyboardEvent, _]] = js.undefined
  /**
    * When `true`, invokes `event.preventDefault()` before the respective `onKeyDown` and
    * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
    * @default false
    */
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true`, invokes `event.stopPropagation()` before the respective `onKeyDown` and
    * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
    * @default false
    */
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
}

object IHotkeyProps {
  @scala.inline
  def apply(
    combo: java.lang.String,
    label: java.lang.String,
    allowInInput: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    group: java.lang.String = null,
    onKeyDown: js.Function1[/* e */ reactLib.KeyboardEvent, _] = null,
    onKeyUp: js.Function1[/* e */ reactLib.KeyboardEvent, _] = null,
    preventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  ): IHotkeyProps = {
    val __obj = js.Dynamic.literal(combo = combo, label = label)
    if (!js.isUndefined(allowInInput)) __obj.updateDynamic("allowInInput")(allowInInput)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (group != null) __obj.updateDynamic("group")(group)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[IHotkeyProps]
  }
}

