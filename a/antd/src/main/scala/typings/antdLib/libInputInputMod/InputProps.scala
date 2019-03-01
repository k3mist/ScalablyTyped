package typings
package antdLib.libInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.InputHTMLAttributes<react.HTMLInputElement>, 'size' | 'prefix'> ]: react.react.InputHTMLAttributes<react.HTMLInputElement>[P]} */ trait InputProps extends js.Object {
  var addonAfter: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var addonBefore: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var onPressEnter: js.UndefOr[reactLib.reactMod.ReactNs.KeyboardEventHandler[reactLib.HTMLInputElement]] = js.undefined
  var prefix: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var size: /* import warning: ImportType.apply Failed type conversion: ['small', 'default', 'large'][number] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: ['small', 'default', 'large'][number] */ js.Any
  ] = js.undefined
  var suffix: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    addonAfter: reactLib.reactMod.ReactNs.ReactNode = null,
    addonBefore: reactLib.reactMod.ReactNs.ReactNode = null,
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    onPressEnter: reactLib.reactMod.ReactNs.KeyboardEventHandler[reactLib.HTMLInputElement] = null,
    prefix: reactLib.reactMod.ReactNs.ReactNode = null,
    prefixCls: java.lang.String = null,
    size: /* import warning: ImportType.apply Failed type conversion: ['small', 'default', 'large'][number] */ js.Any = null,
    suffix: reactLib.reactMod.ReactNs.ReactNode = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter.asInstanceOf[js.Any])
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(onPressEnter)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps]
  }
}

