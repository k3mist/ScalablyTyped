package typings
package ejDotWebDotAllLib.ejNs.DateRangePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires when the DateRangePicker values get changed.
    */
  var Change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Used to allow or restrict the editing in DateRangePicker input field directly. By setting false to this API, You can only pick the date ranges from DateRangePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires before closing the DateRangePicker popup.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, scala.Unit]] = js.undefined
  /** Fires before opening the DateRangePicker popup.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Sets the specified text value to the available buttons (Reset, Cancel, Apply) in the DateRangePicker popup.
    * @Default {{ reset: Reset, cancel: Cancel, apply: Apply}}
    */
  var buttonText: js.UndefOr[js.Any] = js.undefined
  /** Fires when DateRangePicker popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Fires when the DateRangePicker is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for DateRangePicker theme, which is used to customize.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Formats the date value of the DateRangePicker in to the specified date format. If this API is not specified, dateFormat will be set based on the current culture of DateRangePicker.
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the DateRangePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Sustain the entire widget model of DateRangePicker even after form post or browser refresh
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows to embed the Timepicker align with the calendars in the page, two timepicker will be render, for selecting start and end date.
    * @Default {false}
    */
  var enableTimePicker: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable the DateRangePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the end date of the date ranges.
    * @Default {null}
    */
  var endDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Specifies the height of the DateRangePicker input.
    * @Default {28px}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Change the DateRangePicker calendar and date format based on given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum date in the calendar that the user can select as a startDate or endDate.
    * @Default {new Date(2099, 11, 31)}
    */
  var maxDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Specifies the minimum date in the calendar that the user can select as a startDate or endDate.
    * @Default {new Date(1900, 00, 01)}
    */
  var minDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Fires when DateRangePicker popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Used to add the preset ranges. Added ranges using this, will show in popup in right side for easy selection of different preset ranges.
    * @Default {null}
    */
  var ranges: js.UndefOr[js.Any] = js.undefined
  /** Fires when a date ranges is selected from the DateRangePicker popup.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** Used to separate the two date strings of the value in the DateRangePicker popup.
    * @Default {-}
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /** Shows/hides the date icon button at right side of textbox, which is used to open or close the DateRangePicker calendar popup.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[scala.Boolean] = js.undefined
  /** DateRangePicker input and popup is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the start date of the date ranges
    * @Default {null}
    */
  var startDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  /** Formats the date value of the DateRangePicker in to the specified time format. If this API is not specified, timeFormat will be set based on the current culture of DateRangePicker.
    * @Default {HH:mm tt}
    */
  var timeFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Separated two date values in string format to sets the date ranges in calendars.
    * @Default {null}
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select Range}
    */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the DateRangePicker input text.
    * @Default {160px}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Change: js.Function1[/* e */ ChangeEventArgs, scala.Unit] = null,
    allowEdit: js.UndefOr[scala.Boolean] = js.undefined,
    beforeClose: js.Function1[/* e */ BeforeCloseEventArgs, scala.Unit] = null,
    beforeOpen: js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit] = null,
    buttonText: js.Any = null,
    close: js.Function1[/* e */ CloseEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    dateFormat: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableTimePicker: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    endDate: java.lang.String | stdLib.Date = null,
    height: java.lang.String | scala.Double = null,
    locale: java.lang.String = null,
    maxDate: java.lang.String | stdLib.Date = null,
    minDate: java.lang.String | stdLib.Date = null,
    open: js.Function1[/* e */ OpenEventArgs, scala.Unit] = null,
    ranges: js.Any = null,
    select: js.Function1[/* e */ SelectEventArgs, scala.Unit] = null,
    separator: java.lang.String = null,
    showPopupButton: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    startDate: java.lang.String | stdLib.Date = null,
    timeFormat: java.lang.String = null,
    value: java.lang.String = null,
    watermarkText: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Change != null) __obj.updateDynamic("Change")(Change)
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (close != null) __obj.updateDynamic("close")(close)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableTimePicker)) __obj.updateDynamic("enableTimePicker")(enableTimePicker)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (select != null) __obj.updateDynamic("select")(select)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(showPopupButton)) __obj.updateDynamic("showPopupButton")(showPopupButton)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (value != null) __obj.updateDynamic("value")(value)
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

