package typings
package antdLib.libSwitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var checkedChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* checked */ scala.Boolean, /* event */ reactLib.MouseEvent, _]] = js.undefined
  var onClick: js.UndefOr[js.Function2[/* checked */ scala.Boolean, /* event */ reactLib.MouseEvent, _]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[antdLib.antdLibStrings.small | antdLib.antdLibStrings.default] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var unCheckedChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkedChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function2[/* checked */ scala.Boolean, /* event */ reactLib.MouseEvent, _] = null,
    onClick: js.Function2[/* checked */ scala.Boolean, /* event */ reactLib.MouseEvent, _] = null,
    prefixCls: java.lang.String = null,
    size: antdLib.antdLibStrings.small | antdLib.antdLibStrings.default = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    unCheckedChildren: reactLib.reactMod.ReactNs.ReactNode = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedChildren != null) __obj.updateDynamic("checkedChildren")(checkedChildren.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (unCheckedChildren != null) __obj.updateDynamic("unCheckedChildren")(unCheckedChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

