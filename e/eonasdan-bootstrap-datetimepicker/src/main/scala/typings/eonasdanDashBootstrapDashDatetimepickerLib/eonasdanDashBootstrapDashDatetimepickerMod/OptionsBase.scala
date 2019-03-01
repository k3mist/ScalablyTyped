package typings
package eonasdanDashBootstrapDashDatetimepickerLib.eonasdanDashBootstrapDashDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsBase extends js.Object {
  /**
    * If true, the picker will show on textbox focus and icon click when used in a button group
    * Default: false
    */
  var allowInputToggle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows the week of the year to the left of first day of the week.
    * Default: false
    */
  var calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Using a Bootstraps collapse to switch between date/time pickers.
    * Default: true
    */
  var collapse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: ".datepickerinput"
    */
  var datepickerInput: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Changes the heading of the datepicker when in "days" view.
    * Default: "MMMM YYYY"
    */
  var dayViewHeaderFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Accepts: array of numbers from 0-6
    * Disables the section of days of the week, e.g. weekends.
    * Default: false
    */
  var daysOfWeekDisabled: js.UndefOr[js.Array[DayOfWeek] | scala.Boolean] = js.undefined
  /**
    * Will cause the date picker to stay open after a blur event.
    * Default: false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the picker default date/time. Overrides useCurrent
    * Default: false
    */
  var defaultDate: js.UndefOr[DateComparable | scala.Boolean] = js.undefined
  /**
    * Disables time selection between the given moments.
    * For example:
    * [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
    * Default: false
    */
  var disabledTimeIntervals: js.UndefOr[scala.Boolean | js.Array[FromTo]] = js.undefined
  /**
    * Allows for several input formats to be valid.
    * Default: false
    */
  var extraFormats: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  /**
    * If false, the textbox will not be given focus when the picker is shown
    * Default: true
    */
  var focusOnShow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * See momentjs' docs for valid formats. Format also dictates what components are shown, e.g. MM/dd/YYYY will not display the time picker.
    * Default: false
    */
  var format: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Change the default icons for the pickers functions
    * Default: {
    *              time: "glyphicon glyphicon-time",
    *              date: "glyphicon glyphicon-calendar",
    *              up: "glyphicon glyphicon-chevron-up",
    *              down: "glyphicon glyphicon-chevron-down",
    *              previous: "glyphicon glyphicon-chevron-left",
    *              next: "glyphicon glyphicon-chevron-right",
    *              today: "glyphicon glyphicon-screenshot",
    *              clear: "glyphicon glyphicon-trash",
    *              close: "glyphicon glyphicon-remove"
    *          }
    */
  var icons: js.UndefOr[Icons] = js.undefined
  /**
    * Allow date picker show event to fire even when the associated input element has the readonly="readonly" property.
    * Default: false
    */
  var ignoreReadonly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
    * Default: false
    */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will cause the date picker to not revert or overwrite invalid dates.
    * Default: false
    */
  var keepInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will cause the date picker to stay open after selecting a date if no time components are being used.
    * Default: false
    */
  var keepOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows for custom events to fire on keyboard press.
    * For example:
    *                keybinds:
    *                {
    *                		up: (widget) => console.log(widget),
    *                		"control up": (widget) => console.log(widget)
    *                }
    * The widget parameter is false, if the datepicker is closed.
    * Default: {
    *          up: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().subtract(7, "d"));
    *              } else {
    *                  this.date(this.date().clone().add(1, "m"));
    *              }
    *          },
    *          down: function (widget) {
    *              if (!widget) {
    *                  this.show();
    *              }
    *              else if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().add(7, "d"));
    *              } else {
    *                  this.date(this.date().clone().subtract(1, "m"));
    *              }
    *          },
    *          "control up": function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().subtract(1, "y"));
    *              } else {
    *                  this.date(this.date().clone().add(1, "h"));
    *              }
    *          },
    *          "control down": function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().add(1, "y"));
    *              } else {
    *                  this.date(this.date().clone().subtract(1, "h"));
    *              }
    *          },
    *          left: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().subtract(1, "d"));
    *              }
    *          },
    *          right: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().add(1, "d"));
    *              }
    *          },
    *          pageUp: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().subtract(1, "M"));
    *              }
    *          },
    *          pageDown: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().add(1, "M"));
    *              }
    *          },
    *          enter: function () {
    *              this.hide();
    *          },
    *          escape: function () {
    *              this.hide();
    *          },
    *          "control space": function (widget) {
    *              if (widget.find(".timepicker").is(":visible")) {
    *                  widget.find(".btn[data-action="togglePeriod"]").click();
    *              }
    *          },
    *          t: function () {
    *              this.date(moment());
    *          },
    *          "delete": function () {
    *              this.clear();
    *          }
    *       }
    */
  var keyBinds: js.UndefOr[KeyBinds] = js.undefined
  /**
    * See momentjs for valid locales.
    * You must include moment-with-locales.js or a local js file.
    * Default: moment.locale()
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Prevents date/time selections after this date.
    * maxDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
    * Default: false
    */
  var maxDate: js.UndefOr[DateComparable | scala.Boolean] = js.undefined
  /**
    * Prevents date/time selections before this date.
    * minDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
    * Default: false
    */
  var minDate: js.UndefOr[DateComparable | scala.Boolean] = js.undefined
  /**
    * Allows custom input formatting.
    * For example:
    * The user can enter "yesterday" or "30 days ago".
    */
  var parseInputDate: js.UndefOr[ParseInputDateFunction] = js.undefined
  /**
    * Show the "Clear" button in the icon toolbar.
    * Clicking the "Clear" button will set the calendar to null.
    * Default: false
    */
  var showClear: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show the "Close" button in the icon toolbar.
    * Clicking the "Close" button will call hide()
    * Default: false
    */
  var showClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show the "Today" button in the icon toolbar.
    * Clicking the "Today" button will set the calendar view and set the date to now.
    * Default: false
    */
  var showTodayButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows the picker side by side when using the time and date together.
    * Default: false
    */
  var sideBySide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of minutes the up/down arrow's will move the minutes value in the time picker.
    * Default: 1
    */
  var stepping: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: "Etc/UTC"
    */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Changes the placement of the icon toolbar.
    * Default: "default"
    */
  var toolbarPlacement: js.UndefOr[ToolbarPlacement] = js.undefined
  /**
    * This will change the tooltips over each icon to a custom string
    * Default: {
    *              today: "Go to today",
    *              clear: "Clear selection",
    *              close: "Close the picker",
    *              selectMonth: "Select Month",
    *              prevMonth: "Previous Month",
    *              nextMonth: "Next Month",
    *              selectYear: "Select Year",
    *              prevYear: "Previous Year",
    *              nextYear: "Next Year",
    *              selectDecade: "Select Decade",
    *              prevDecade: "Previous Decade",
    *              nextDecade: "Next Decade",
    *              prevCentury: "Previous Century",
    *              nextCentury: "Next Century"
    *          }
    */
  var tooltips: js.UndefOr[Tooltips] = js.undefined
  /**
    * On show, will set the picker to the current date/time
    * Default: true
    */
  var useCurrent: js.UndefOr[scala.Boolean | UseCurrent] = js.undefined
  /**
    * Defines if moment should use strict date parsing when considering a date to be valid
    * Default: false
    */
  var useStrict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This will change the viewDate without changing or setting the selected date.
    * Default: false
    */
  var viewDate: js.UndefOr[DateComparable | scala.Boolean] = js.undefined
  /**
    * The default view to display when the picker is shown.
    * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY
    * Default: "days"
    */
  var viewMode: js.UndefOr[ViewMode] = js.undefined
  /**
    * On picker show, places the widget at the identifier (string) or jQuery object if the element has css position: "relative"
    * Default: null
    */
  var widgetParent: js.UndefOr[
    java.lang.String | eonasdanDashBootstrapDashDatetimepickerLib.eonasdanDashBootstrapDashDatetimepickerMod.Global.JQuery
  ] = js.undefined
  /**
    * Accepts: object with the all or one of the parameters above
    * horizontal: 'auto', 'left', 'right'
    * vertical: 'auto', 'top', 'bottom'
    * Default: {
    *              horizontal: 'auto'
    *              vertical: 'auto'
    *          }
    */
  var widgetPositioning: js.UndefOr[WidgetPositioning] = js.undefined
}

object OptionsBase {
  @scala.inline
  def apply(
    allowInputToggle: js.UndefOr[scala.Boolean] = js.undefined,
    calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    collapse: js.UndefOr[scala.Boolean] = js.undefined,
    datepickerInput: java.lang.String = null,
    dayViewHeaderFormat: java.lang.String = null,
    daysOfWeekDisabled: js.Array[DayOfWeek] | scala.Boolean = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    defaultDate: DateComparable | scala.Boolean = null,
    disabledTimeIntervals: scala.Boolean | js.Array[FromTo] = null,
    extraFormats: js.Array[java.lang.String] | scala.Boolean = null,
    focusOnShow: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String | scala.Boolean = null,
    icons: Icons = null,
    ignoreReadonly: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    keepInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    keepOpen: js.UndefOr[scala.Boolean] = js.undefined,
    keyBinds: KeyBinds = null,
    locale: java.lang.String = null,
    maxDate: DateComparable | scala.Boolean = null,
    minDate: DateComparable | scala.Boolean = null,
    parseInputDate: ParseInputDateFunction = null,
    showClear: js.UndefOr[scala.Boolean] = js.undefined,
    showClose: js.UndefOr[scala.Boolean] = js.undefined,
    showTodayButton: js.UndefOr[scala.Boolean] = js.undefined,
    sideBySide: js.UndefOr[scala.Boolean] = js.undefined,
    stepping: scala.Int | scala.Double = null,
    timeZone: java.lang.String = null,
    toolbarPlacement: ToolbarPlacement = null,
    tooltips: Tooltips = null,
    useCurrent: scala.Boolean | UseCurrent = null,
    useStrict: js.UndefOr[scala.Boolean] = js.undefined,
    viewDate: DateComparable | scala.Boolean = null,
    viewMode: ViewMode = null,
    widgetParent: java.lang.String | eonasdanDashBootstrapDashDatetimepickerLib.eonasdanDashBootstrapDashDatetimepickerMod.Global.JQuery = null,
    widgetPositioning: WidgetPositioning = null
  ): OptionsBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInputToggle)) __obj.updateDynamic("allowInputToggle")(allowInputToggle)
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks)
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (datepickerInput != null) __obj.updateDynamic("datepickerInput")(datepickerInput)
    if (dayViewHeaderFormat != null) __obj.updateDynamic("dayViewHeaderFormat")(dayViewHeaderFormat)
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (disabledTimeIntervals != null) __obj.updateDynamic("disabledTimeIntervals")(disabledTimeIntervals.asInstanceOf[js.Any])
    if (extraFormats != null) __obj.updateDynamic("extraFormats")(extraFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (!js.isUndefined(ignoreReadonly)) __obj.updateDynamic("ignoreReadonly")(ignoreReadonly)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(keepInvalid)) __obj.updateDynamic("keepInvalid")(keepInvalid)
    if (!js.isUndefined(keepOpen)) __obj.updateDynamic("keepOpen")(keepOpen)
    if (keyBinds != null) __obj.updateDynamic("keyBinds")(keyBinds)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (parseInputDate != null) __obj.updateDynamic("parseInputDate")(parseInputDate)
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear)
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose)
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton)
    if (!js.isUndefined(sideBySide)) __obj.updateDynamic("sideBySide")(sideBySide)
    if (stepping != null) __obj.updateDynamic("stepping")(stepping.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (toolbarPlacement != null) __obj.updateDynamic("toolbarPlacement")(toolbarPlacement)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    if (useCurrent != null) __obj.updateDynamic("useCurrent")(useCurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(useStrict)) __obj.updateDynamic("useStrict")(useStrict)
    if (viewDate != null) __obj.updateDynamic("viewDate")(viewDate.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    if (widgetParent != null) __obj.updateDynamic("widgetParent")(widgetParent.asInstanceOf[js.Any])
    if (widgetPositioning != null) __obj.updateDynamic("widgetPositioning")(widgetPositioning)
    __obj.asInstanceOf[OptionsBase]
  }
}

