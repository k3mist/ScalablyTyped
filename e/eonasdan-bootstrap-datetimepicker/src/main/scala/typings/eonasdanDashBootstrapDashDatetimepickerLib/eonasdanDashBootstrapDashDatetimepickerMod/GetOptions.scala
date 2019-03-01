package typings
package eonasdanDashBootstrapDashDatetimepickerLib.eonasdanDashBootstrapDashDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends OptionsBase {
  /**
    * Disables selection of dates in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var disabledDates: js.UndefOr[IndexedDates | scala.Boolean] = js.undefined
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var disabledHours: js.UndefOr[IndexedHours | scala.Boolean] = js.undefined
  /**
    * Enables selection of dates NOT in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var enabledDates: js.UndefOr[IndexedDates | scala.Boolean] = js.undefined
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var enabledHours: js.UndefOr[IndexedHours | scala.Boolean] = js.undefined
}

object GetOptions {
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
    disabledDates: IndexedDates | scala.Boolean = null,
    disabledHours: IndexedHours | scala.Boolean = null,
    disabledTimeIntervals: scala.Boolean | js.Array[FromTo] = null,
    enabledDates: IndexedDates | scala.Boolean = null,
    enabledHours: IndexedHours | scala.Boolean = null,
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
  ): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInputToggle)) __obj.updateDynamic("allowInputToggle")(allowInputToggle)
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks)
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (datepickerInput != null) __obj.updateDynamic("datepickerInput")(datepickerInput)
    if (dayViewHeaderFormat != null) __obj.updateDynamic("dayViewHeaderFormat")(dayViewHeaderFormat)
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(disabledHours.asInstanceOf[js.Any])
    if (disabledTimeIntervals != null) __obj.updateDynamic("disabledTimeIntervals")(disabledTimeIntervals.asInstanceOf[js.Any])
    if (enabledDates != null) __obj.updateDynamic("enabledDates")(enabledDates.asInstanceOf[js.Any])
    if (enabledHours != null) __obj.updateDynamic("enabledHours")(enabledHours.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[GetOptions]
  }
}

