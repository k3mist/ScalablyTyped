package typings
package flatpickrLib.distTypesLocaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLocale extends js.Object {
  var amPM: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  var daysInMonth: js.UndefOr[
    js.Tuple12[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ]
  ] = js.undefined
  var firstDayOfWeek: js.UndefOr[scala.Double] = js.undefined
  var months: flatpickrLib.Anon_LonghandShorthand
  var ordinal: js.UndefOr[js.Function1[/* nth */ scala.Double, java.lang.String]] = js.undefined
  var rangeSeparator: js.UndefOr[java.lang.String] = js.undefined
  var scrollTitle: js.UndefOr[java.lang.String] = js.undefined
  var toggleTitle: js.UndefOr[java.lang.String] = js.undefined
  var weekAbbreviation: js.UndefOr[java.lang.String] = js.undefined
  var weekdays: flatpickrLib.Anon_Longhand
  var yearAriaLabel: js.UndefOr[java.lang.String] = js.undefined
}

object CustomLocale {
  @scala.inline
  def apply(
    months: flatpickrLib.Anon_LonghandShorthand,
    weekdays: flatpickrLib.Anon_Longhand,
    amPM: js.Tuple2[java.lang.String, java.lang.String] = null,
    daysInMonth: js.Tuple12[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ] = null,
    firstDayOfWeek: scala.Int | scala.Double = null,
    ordinal: js.Function1[/* nth */ scala.Double, java.lang.String] = null,
    rangeSeparator: java.lang.String = null,
    scrollTitle: java.lang.String = null,
    toggleTitle: java.lang.String = null,
    weekAbbreviation: java.lang.String = null,
    yearAriaLabel: java.lang.String = null
  ): CustomLocale = {
    val __obj = js.Dynamic.literal(months = months, weekdays = weekdays)
    if (amPM != null) __obj.updateDynamic("amPM")(amPM)
    if (daysInMonth != null) __obj.updateDynamic("daysInMonth")(daysInMonth)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal)
    if (rangeSeparator != null) __obj.updateDynamic("rangeSeparator")(rangeSeparator)
    if (scrollTitle != null) __obj.updateDynamic("scrollTitle")(scrollTitle)
    if (toggleTitle != null) __obj.updateDynamic("toggleTitle")(toggleTitle)
    if (weekAbbreviation != null) __obj.updateDynamic("weekAbbreviation")(weekAbbreviation)
    if (yearAriaLabel != null) __obj.updateDynamic("yearAriaLabel")(yearAriaLabel)
    __obj.asInstanceOf[CustomLocale]
  }
}

