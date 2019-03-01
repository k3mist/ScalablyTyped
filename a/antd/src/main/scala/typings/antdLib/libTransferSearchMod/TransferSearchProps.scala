package typings
package antdLib.libTransferSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferSearchProps extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var handleClear: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ reactLib.reactMod.ReactNs.FormEvent[_], scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object TransferSearchProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    handleClear: js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onChange: js.Function1[/* e */ reactLib.reactMod.ReactNs.FormEvent[_], scala.Unit] = null,
    placeholder: java.lang.String = null,
    prefixCls: java.lang.String = null,
    value: js.Any = null
  ): TransferSearchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (handleClear != null) __obj.updateDynamic("handleClear")(handleClear)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TransferSearchProps]
  }
}

