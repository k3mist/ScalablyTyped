package typings
package rmcDashCalendarLib.libCalendarPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** 显示开始日期，default: today */
  var defaultDate: js.UndefOr[stdLib.Date] = js.undefined
  /** 默认时间选择值 */
  var defaultTimeValue: js.UndefOr[stdLib.Date] = js.undefined
  /** 默认选择值，开始时间、结束时间 */
  var defaultValue: js.UndefOr[SelectDateType] = js.undefined
  /** 入场方向，default: vertical，vertical: 垂直，horizontal: 水平 */
  var enterDirection: js.UndefOr[
    rmcDashCalendarLib.rmcDashCalendarLibStrings.horizontal | rmcDashCalendarLib.rmcDashCalendarLibStrings.vertical
  ] = js.undefined
  /** 日期扩展数据 */
  var getDateExtra: js.UndefOr[
    js.Function1[/* date */ stdLib.Date, rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.ExtraData]
  ] = js.undefined
  /** 无限滚动优化（大范围选择），default: false */
  var infiniteOpt: js.UndefOr[scala.Boolean] = js.undefined
  /** 初始化月个数，default: 6 */
  var initalMonths: js.UndefOr[scala.Double] = js.undefined
  /** 本地化 */
  var locale: js.UndefOr[rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale] = js.undefined
  /** 最大日期 */
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  /** 最小日期 */
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  /** 关闭时回调 */
  var onCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** 清除时回调 */
  var onClear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** 确认时回调 */
  var onConfirm: js.UndefOr[
    js.Function2[
      /* startDateTime */ js.UndefOr[stdLib.Date], 
      /* endDateTime */ js.UndefOr[stdLib.Date], 
      scala.Unit
    ]
  ] = js.undefined
  /** 选择日期回调，如果有返回值，选择范围将使用返回值 */
  var onSelect: js.UndefOr[
    js.Function2[
      /* date */ stdLib.Date, 
      /* state */ js.UndefOr[js.Tuple2[js.UndefOr[stdLib.Date], js.UndefOr[stdLib.Date]]], 
      SelectDateType | scala.Unit
    ]
  ] = js.undefined
  /** 选择区间包含不可用日期 */
  var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[stdLib.Date], scala.Unit]] = js.undefined
  /** 是否选择时间，default: false */
  var pickTime: js.UndefOr[scala.Boolean] = js.undefined
  /** (web only) 样式前缀，default: rmc-calendar */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** 替换标题栏 */
  var renderHeader: js.UndefOr[
    js.Function1[
      /* prop */ rmcDashCalendarLib.libCalendarHeaderMod.PropsType, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /** 替换快捷选择栏，需要设置showShortcut: true */
  var renderShortcut: js.UndefOr[
    js.Function1[
      /* select */ js.Function2[
        /* startDate */ js.UndefOr[stdLib.Date], 
        /* endDate */ js.UndefOr[stdLib.Date], 
        scala.Unit
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /** 行大小，default: normal */
  var rowSize: js.UndefOr[
    rmcDashCalendarLib.rmcDashCalendarLibStrings.normal | rmcDashCalendarLib.rmcDashCalendarLibStrings.xl
  ] = js.undefined
  /** 快捷日期选择， default: false */
  var showShortcut: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var timePickerPickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var timePickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** header title, default: {locale.title} */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** 选择类型，default: range，one: 单日，range: 日期区间 */
  var `type`: js.UndefOr[
    rmcDashCalendarLib.rmcDashCalendarLibStrings.one | rmcDashCalendarLib.rmcDashCalendarLibStrings.range
  ] = js.undefined
  /** 是否显示，default: false */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    defaultDate: stdLib.Date = null,
    defaultTimeValue: stdLib.Date = null,
    defaultValue: SelectDateType = null,
    enterDirection: rmcDashCalendarLib.rmcDashCalendarLibStrings.horizontal | rmcDashCalendarLib.rmcDashCalendarLibStrings.vertical = null,
    getDateExtra: js.Function1[/* date */ stdLib.Date, rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.ExtraData] = null,
    infiniteOpt: js.UndefOr[scala.Boolean] = js.undefined,
    initalMonths: scala.Int | scala.Double = null,
    locale: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    onCancel: js.Function0[scala.Unit] = null,
    onClear: js.Function0[scala.Unit] = null,
    onConfirm: js.Function2[
      /* startDateTime */ js.UndefOr[stdLib.Date], 
      /* endDateTime */ js.UndefOr[stdLib.Date], 
      scala.Unit
    ] = null,
    onSelect: js.Function2[
      /* date */ stdLib.Date, 
      /* state */ js.UndefOr[js.Tuple2[js.UndefOr[stdLib.Date], js.UndefOr[stdLib.Date]]], 
      SelectDateType | scala.Unit
    ] = null,
    onSelectHasDisableDate: js.Function1[/* date */ js.Array[stdLib.Date], scala.Unit] = null,
    pickTime: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    renderHeader: js.Function1[
      /* prop */ rmcDashCalendarLib.libCalendarHeaderMod.PropsType, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderShortcut: js.Function1[
      /* select */ js.Function2[
        /* startDate */ js.UndefOr[stdLib.Date], 
        /* endDate */ js.UndefOr[stdLib.Date], 
        scala.Unit
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    rowSize: rmcDashCalendarLib.rmcDashCalendarLibStrings.normal | rmcDashCalendarLib.rmcDashCalendarLibStrings.xl = null,
    showShortcut: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    timePickerPickerPrefixCls: java.lang.String = null,
    timePickerPrefixCls: java.lang.String = null,
    title: java.lang.String = null,
    `type`: rmcDashCalendarLib.rmcDashCalendarLibStrings.one | rmcDashCalendarLib.rmcDashCalendarLibStrings.range = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (defaultTimeValue != null) __obj.updateDynamic("defaultTimeValue")(defaultTimeValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (enterDirection != null) __obj.updateDynamic("enterDirection")(enterDirection.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(getDateExtra)
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt)
    if (initalMonths != null) __obj.updateDynamic("initalMonths")(initalMonths.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onClear != null) __obj.updateDynamic("onClear")(onClear)
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(onConfirm)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(onSelectHasDisableDate)
    if (!js.isUndefined(pickTime)) __obj.updateDynamic("pickTime")(pickTime)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader)
    if (renderShortcut != null) __obj.updateDynamic("renderShortcut")(renderShortcut)
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showShortcut)) __obj.updateDynamic("showShortcut")(showShortcut)
    if (style != null) __obj.updateDynamic("style")(style)
    if (timePickerPickerPrefixCls != null) __obj.updateDynamic("timePickerPickerPrefixCls")(timePickerPickerPrefixCls)
    if (timePickerPrefixCls != null) __obj.updateDynamic("timePickerPrefixCls")(timePickerPrefixCls)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PropsType]
  }
}

