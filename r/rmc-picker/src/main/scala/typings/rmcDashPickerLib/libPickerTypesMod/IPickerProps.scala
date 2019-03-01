package typings
package rmcDashPickerLib.libPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultSelectedValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var indicatorClassName: js.UndefOr[java.lang.String] = js.undefined
  var indicatorStyle: js.UndefOr[js.Any] = js.undefined
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var noAnimate: js.UndefOr[scala.Boolean] = js.undefined
  var onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  /** web only */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var selectedValue: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object IPickerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultSelectedValue: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    indicatorClassName: java.lang.String = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    noAnimate: js.UndefOr[scala.Boolean] = js.undefined,
    onScrollChange: js.Function1[/* value */ js.Any, scala.Unit] = null,
    onValueChange: js.Function1[/* value */ js.Any, scala.Unit] = null,
    prefixCls: java.lang.String = null,
    selectedValue: js.Any = null,
    style: js.Any = null
  ): IPickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultSelectedValue != null) __obj.updateDynamic("defaultSelectedValue")(defaultSelectedValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (indicatorClassName != null) __obj.updateDynamic("indicatorClassName")(indicatorClassName)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (!js.isUndefined(noAnimate)) __obj.updateDynamic("noAnimate")(noAnimate)
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(onScrollChange)
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IPickerProps]
  }
}

