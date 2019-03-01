package typings
package rmcDashDateDashPickerLib.libIDatePickerPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[js.Any] = js.undefined
  var defaultDate: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var formatDay: js.UndefOr[js.Function2[/* day */ scala.Double, /* date */ js.UndefOr[js.Any], _]] = js.undefined
  var formatMonth: js.UndefOr[js.Function2[/* month */ scala.Double, /* date */ js.UndefOr[js.Any], _]] = js.undefined
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var maxDate: js.UndefOr[js.Any] = js.undefined
  var minDate: js.UndefOr[js.Any] = js.undefined
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Any, scala.Unit]] = js.undefined
  /** web only */
  var onScrollChange: js.UndefOr[
    js.Function3[/* date */ js.Any, /* vals */ js.Any, /* index */ scala.Double, scala.Unit]
  ] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ scala.Double, scala.Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** web only */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var rootNativeProps: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var use12Hours: js.UndefOr[scala.Boolean] = js.undefined
}

object IDatePickerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    date: js.Any = null,
    defaultDate: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    formatDay: js.Function2[/* day */ scala.Double, /* date */ js.UndefOr[js.Any], _] = null,
    formatMonth: js.Function2[/* month */ scala.Double, /* date */ js.UndefOr[js.Any], _] = null,
    itemStyle: js.Any = null,
    locale: js.Any = null,
    maxDate: js.Any = null,
    minDate: js.Any = null,
    minuteStep: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    onDateChange: js.Function1[/* date */ js.Any, scala.Unit] = null,
    onScrollChange: js.Function3[/* date */ js.Any, /* vals */ js.Any, /* index */ scala.Double, scala.Unit] = null,
    onValueChange: js.Function2[/* vals */ js.Any, /* index */ scala.Double, scala.Unit] = null,
    pickerPrefixCls: java.lang.String = null,
    prefixCls: java.lang.String = null,
    rootNativeProps: js.Object = null,
    style: js.Any = null,
    use12Hours: js.UndefOr[scala.Boolean] = js.undefined
  ): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (date != null) __obj.updateDynamic("date")(date)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (formatDay != null) __obj.updateDynamic("formatDay")(formatDay)
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(formatMonth)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(onDateChange)
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(onScrollChange)
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange)
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours)
    __obj.asInstanceOf[IDatePickerProps]
  }
}

