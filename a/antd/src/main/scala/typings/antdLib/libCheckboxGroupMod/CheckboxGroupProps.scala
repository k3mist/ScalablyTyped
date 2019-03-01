package typings
package antdLib.libCheckboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxGroupProps extends AbstractCheckboxGroupProps {
  var defaultValue: js.UndefOr[js.Array[CheckboxValueType]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* checkedValue */ js.Array[CheckboxValueType], scala.Unit]] = js.undefined
  var value: js.UndefOr[js.Array[CheckboxValueType]] = js.undefined
}

object CheckboxGroupProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultValue: js.Array[CheckboxValueType] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function1[/* checkedValue */ js.Array[CheckboxValueType], scala.Unit] = null,
    options: js.Array[CheckboxOptionType | java.lang.String] = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: js.Array[CheckboxValueType] = null
  ): CheckboxGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (options != null) __obj.updateDynamic("options")(options)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CheckboxGroupProps]
  }
}

