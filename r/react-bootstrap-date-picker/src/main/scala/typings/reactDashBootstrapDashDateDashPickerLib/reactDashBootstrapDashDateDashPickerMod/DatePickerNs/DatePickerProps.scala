package typings
package reactDashBootstrapDashDateDashPickerLib.reactDashBootstrapDashDateDashPickerMod.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var calendarContainer: js.UndefOr[js.Any] = js.undefined
  var calendarPlacement: js.UndefOr[java.lang.String] = js.undefined
  var cellPadding: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clearButtonElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var customControl: js.UndefOr[
    reactLib.reactMod.ReactNs.StatelessComponent[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState])
  ] = js.undefined
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  var dayLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var maxDate: js.UndefOr[java.lang.String] = js.undefined
  var minDate: js.UndefOr[java.lang.String] = js.undefined
  var monthLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var nextButtonElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[_]] = js.undefined
  var onChange: js.UndefOr[ChangeCallback] = js.undefined
  var onClear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[_]] = js.undefined
  var previousButtonElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var showClearButton: js.UndefOr[scala.Boolean] = js.undefined
  var showTodayButton: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var todayButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var weekStartsOnMonday: js.UndefOr[scala.Boolean] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    calendarContainer: js.Any = null,
    calendarPlacement: java.lang.String = null,
    cellPadding: java.lang.String = null,
    className: java.lang.String = null,
    clearButtonElement: reactLib.reactMod.ReactNs.ReactNode = null,
    customControl: reactLib.reactMod.ReactNs.StatelessComponent[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) = null,
    dateFormat: java.lang.String = null,
    dayLabels: js.Array[java.lang.String] = null,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxDate: java.lang.String = null,
    minDate: java.lang.String = null,
    monthLabels: js.Array[java.lang.String] = null,
    nextButtonElement: reactLib.reactMod.ReactNs.ReactNode = null,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[_] = null,
    onChange: ChangeCallback = null,
    onClear: js.Function0[scala.Unit] = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[_] = null,
    previousButtonElement: reactLib.reactMod.ReactNs.ReactNode = null,
    showClearButton: js.UndefOr[scala.Boolean] = js.undefined,
    showTodayButton: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    todayButtonLabel: java.lang.String = null,
    value: java.lang.String = null,
    weekStartsOnMonday: js.UndefOr[scala.Boolean] = js.undefined
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (calendarContainer != null) __obj.updateDynamic("calendarContainer")(calendarContainer)
    if (calendarPlacement != null) __obj.updateDynamic("calendarPlacement")(calendarPlacement)
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clearButtonElement != null) __obj.updateDynamic("clearButtonElement")(clearButtonElement.asInstanceOf[js.Any])
    if (customControl != null) __obj.updateDynamic("customControl")(customControl.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (dayLabels != null) __obj.updateDynamic("dayLabels")(dayLabels)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (monthLabels != null) __obj.updateDynamic("monthLabels")(monthLabels)
    if (nextButtonElement != null) __obj.updateDynamic("nextButtonElement")(nextButtonElement.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClear != null) __obj.updateDynamic("onClear")(onClear)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (previousButtonElement != null) __obj.updateDynamic("previousButtonElement")(previousButtonElement.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton)
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton)
    if (style != null) __obj.updateDynamic("style")(style)
    if (todayButtonLabel != null) __obj.updateDynamic("todayButtonLabel")(todayButtonLabel)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(weekStartsOnMonday)) __obj.updateDynamic("weekStartsOnMonday")(weekStartsOnMonday)
    __obj.asInstanceOf[DatePickerProps]
  }
}

