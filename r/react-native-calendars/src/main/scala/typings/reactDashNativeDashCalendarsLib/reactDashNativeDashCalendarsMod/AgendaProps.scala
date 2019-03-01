package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgendaProps[TItem] extends js.Object {
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  If firstDay = 1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Hide knob button. Default = false
    */
  var hideKnob: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  The list of items that have to be displayed in agenda. If you want to render item as empty date
    *  the value of date key kas to be an empty array []. If there exists no value for date key it is
    *  considered that the date in question is not yet loaded
    */
  var items: js.UndefOr[AgendaItemsMap[TItem]] = js.undefined
  /**
    * callback that gets called when items for a certain month should be loaded (month became visible)
    */
  var loadItemsForMonth: js.UndefOr[js.Function1[/* date */ DateObject, scala.Unit]] = js.undefined
  /**
    * Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
    */
  var maxDate: js.UndefOr[TCalendarDate] = js.undefined
  /**
    * Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
    */
  var minDate: js.UndefOr[TCalendarDate] = js.undefined
  /**
    *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
    */
  var monthFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Handler which gets executed when the calendar is opened or closed. Default = undefined
    */
  var onCalendarToggled: js.UndefOr[js.Function1[/* calendarOpened */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    *  Handler that gets called when day changes while scrolling agenda list. Default = undefined
    */
  var onDayChange: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
    *  Handler which gets executed on day press. Default = undefined
    */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
    *  If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality.
    *  Make sure to also set the refreshing prop correctly. Default = undefined
    */
  var onRefresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[scala.Double] = js.undefined
  /**
    *  A RefreshControl component, used to provide pull-to-refresh funtionality for the ScrollView.
    */
  var refreshControl: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    *  Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Specify how each day should be rendered.
    *  Date can be undefined if the item has not property date.
    */
  var renderDay: js.UndefOr[
    js.Function2[
      /* date */ js.UndefOr[DateObject], 
      /* item */ TItem, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
    *  Specify what should be rendered instead of ActivityIndicator
    */
  var renderEmptyData: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    *  Specify how agenda knob should look like.
    */
  var renderKnob: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /**
    *  Initially visible month. Default = Date()
    */
  var selected: js.UndefOr[TCalendarDate] = js.undefined
  /**
    *  Agenda container style.
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    *  Specify theme properties to override specific styles for agenda parts. Default = {}
    */
  var theme: js.UndefOr[AgendaThemeStyle] = js.undefined
  /**
    *  Specify how empty date content with no items should be rendered.
    */
  def renderEmptyDate(): reactLib.reactMod.ReactNs.ReactNode
  /**
    *  Specify how each item should be rendered in agenda.
    */
  def renderItem(item: TItem, firstDayInDay: scala.Boolean): reactLib.reactMod.ReactNs.ReactNode
  /**
    * specify your item comparison function for increased performance
    */
  def rowHasChanged(r1: TItem, r2: TItem): scala.Boolean
}

object AgendaProps {
  @scala.inline
  def apply[TItem](
    renderEmptyDate: js.Function0[reactLib.reactMod.ReactNs.ReactNode],
    renderItem: js.Function2[TItem, scala.Boolean, reactLib.reactMod.ReactNs.ReactNode],
    rowHasChanged: js.Function2[TItem, TItem, scala.Boolean],
    displayLoadingIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    firstDay: scala.Int | scala.Double = null,
    futureScrollRange: scala.Int | scala.Double = null,
    hideKnob: js.UndefOr[scala.Boolean] = js.undefined,
    items: AgendaItemsMap[TItem] = null,
    loadItemsForMonth: js.Function1[/* date */ DateObject, scala.Unit] = null,
    maxDate: TCalendarDate = null,
    minDate: TCalendarDate = null,
    monthFormat: java.lang.String = null,
    onCalendarToggled: js.Function1[/* calendarOpened */ scala.Boolean, scala.Unit] = null,
    onDayChange: DateCallbackHandler = null,
    onDayPress: DateCallbackHandler = null,
    onRefresh: js.Function0[scala.Unit] = null,
    pastScrollRange: scala.Int | scala.Double = null,
    refreshControl: reactLib.reactMod.ReactNs.ReactNode = null,
    refreshing: js.UndefOr[scala.Boolean] = js.undefined,
    renderDay: js.Function2[
      /* date */ js.UndefOr[DateObject], 
      /* item */ TItem, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderEmptyData: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    renderKnob: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    selected: TCalendarDate = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    theme: AgendaThemeStyle = null
  ): AgendaProps[TItem] = {
    val __obj = js.Dynamic.literal(renderEmptyDate = renderEmptyDate, renderItem = renderItem, rowHasChanged = rowHasChanged)
    if (!js.isUndefined(displayLoadingIndicator)) __obj.updateDynamic("displayLoadingIndicator")(displayLoadingIndicator)
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (futureScrollRange != null) __obj.updateDynamic("futureScrollRange")(futureScrollRange.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKnob)) __obj.updateDynamic("hideKnob")(hideKnob)
    if (items != null) __obj.updateDynamic("items")(items)
    if (loadItemsForMonth != null) __obj.updateDynamic("loadItemsForMonth")(loadItemsForMonth)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat)
    if (onCalendarToggled != null) __obj.updateDynamic("onCalendarToggled")(onCalendarToggled)
    if (onDayChange != null) __obj.updateDynamic("onDayChange")(onDayChange)
    if (onDayPress != null) __obj.updateDynamic("onDayPress")(onDayPress)
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(onRefresh)
    if (pastScrollRange != null) __obj.updateDynamic("pastScrollRange")(pastScrollRange.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing)
    if (renderDay != null) __obj.updateDynamic("renderDay")(renderDay)
    if (renderEmptyData != null) __obj.updateDynamic("renderEmptyData")(renderEmptyData)
    if (renderKnob != null) __obj.updateDynamic("renderKnob")(renderKnob)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[AgendaProps[TItem]]
  }
}

