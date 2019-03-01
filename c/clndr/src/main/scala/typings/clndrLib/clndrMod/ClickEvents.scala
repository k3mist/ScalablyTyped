package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEvents extends js.Object {
  /**
    * Fired whenever a calendar box is clicked. Returns a 'target' object
    * containing the DOM element, any events, and the date as a moment.js
    * object.
    */
  var click: js.UndefOr[js.Function1[/* target */ Target, scala.Unit]] = js.undefined
  /**
    * Fired when a user goes forward a period. Returns moment.js objects
    * for the updated start and end date.
    */
  var nextInterval: js.UndefOr[
    js.Function2[
      /* start */ momentLib.momentMod.momentNs.Moment, 
      /* end */ momentLib.momentMod.momentNs.Moment, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when a user goes forward a month. Returns a moment.js object
    * set to the correct month.
    */
  var nextMonth: js.UndefOr[js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  /**
    * Fired when the next year button is clicked. Returns a moment.js
    * object set to the correct month and year.
    */
  var nextYear: js.UndefOr[js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  /**
    * Fired whenever the time period changes as configured in lengthOfTime.
    * Returns moment.js objects for the updated start and end date.
    */
  var onIntervalChange: js.UndefOr[
    js.Function2[
      /* start */ momentLib.momentMod.momentNs.Moment, 
      /* end */ momentLib.momentMod.momentNs.Moment, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fires any time the month changes as a result of a click action.
    * Returns a moment.js object set to the correct month.
    */
  var onMonthChange: js.UndefOr[js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  /**
    * Fires any time the year changes as a result of a click action. If
    * onMonthChange is also set, it is fired BEFORE onYearChange. Returns
    * a moment.js object set to the correct month and year.
    */
  var onYearChange: js.UndefOr[js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  /**
    * Fired when a user goes back an interval. Returns moment.js objects for
    * the updated start and end date.
    */
  var previousInterval: js.UndefOr[
    js.Function2[
      /* start */ momentLib.momentMod.momentNs.Moment, 
      /* end */ momentLib.momentMod.momentNs.Moment, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when a user goes back a month. Returns a moment.js object set
    * to the correct month.
    *
    */
  var previousMonth: js.UndefOr[js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  /**
    * Fired when the previous year button is clicked. Returns a moment.js
    * object set to the correct month and year.
    */
  var previousYear: js.UndefOr[js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  /**
    * Fired when a user goes to the current month and year. Returns a
    * moment.js object set to the correct month.
    */
  var today: js.UndefOr[js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
}

object ClickEvents {
  @scala.inline
  def apply(
    click: js.Function1[/* target */ Target, scala.Unit] = null,
    nextInterval: js.Function2[
      /* start */ momentLib.momentMod.momentNs.Moment, 
      /* end */ momentLib.momentMod.momentNs.Moment, 
      scala.Unit
    ] = null,
    nextMonth: js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null,
    nextYear: js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null,
    onIntervalChange: js.Function2[
      /* start */ momentLib.momentMod.momentNs.Moment, 
      /* end */ momentLib.momentMod.momentNs.Moment, 
      scala.Unit
    ] = null,
    onMonthChange: js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null,
    onYearChange: js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null,
    previousInterval: js.Function2[
      /* start */ momentLib.momentMod.momentNs.Moment, 
      /* end */ momentLib.momentMod.momentNs.Moment, 
      scala.Unit
    ] = null,
    previousMonth: js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null,
    previousYear: js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null,
    today: js.Function1[/* month */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null
  ): ClickEvents = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (nextInterval != null) __obj.updateDynamic("nextInterval")(nextInterval)
    if (nextMonth != null) __obj.updateDynamic("nextMonth")(nextMonth)
    if (nextYear != null) __obj.updateDynamic("nextYear")(nextYear)
    if (onIntervalChange != null) __obj.updateDynamic("onIntervalChange")(onIntervalChange)
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(onMonthChange)
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(onYearChange)
    if (previousInterval != null) __obj.updateDynamic("previousInterval")(previousInterval)
    if (previousMonth != null) __obj.updateDynamic("previousMonth")(previousMonth)
    if (previousYear != null) __obj.updateDynamic("previousYear")(previousYear)
    if (today != null) __obj.updateDynamic("today")(today)
    __obj.asInstanceOf[ClickEvents]
  }
}

