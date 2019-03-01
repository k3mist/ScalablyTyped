package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentText extends js.Object {
  var currentText: js.UndefOr[java.lang.String] = js.undefined
  var dateRestriction: js.UndefOr[Anon_Hint] = js.undefined
  var dateTimeRange: js.UndefOr[Anon_HintMessageDetail] = js.undefined
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  var regexp: js.UndefOr[Anon_MessageDetail] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
  var tooltipCalendar: js.UndefOr[java.lang.String] = js.undefined
  var tooltipCalendarDisabled: js.UndefOr[java.lang.String] = js.undefined
  var tooltipCalendarTime: js.UndefOr[java.lang.String] = js.undefined
  var tooltipCalendarTimeDisabled: js.UndefOr[java.lang.String] = js.undefined
  var weekHeader: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CurrentText {
  @scala.inline
  def apply(
    currentText: java.lang.String = null,
    dateRestriction: Anon_Hint = null,
    dateTimeRange: Anon_HintMessageDetail = null,
    nextText: java.lang.String = null,
    prevText: java.lang.String = null,
    regexp: Anon_MessageDetail = null,
    required: Anon_Hint = null,
    tooltipCalendar: java.lang.String = null,
    tooltipCalendarDisabled: java.lang.String = null,
    tooltipCalendarTime: java.lang.String = null,
    tooltipCalendarTimeDisabled: java.lang.String = null,
    weekHeader: java.lang.String = null
  ): Anon_CurrentText = {
    val __obj = js.Dynamic.literal()
    if (currentText != null) __obj.updateDynamic("currentText")(currentText)
    if (dateRestriction != null) __obj.updateDynamic("dateRestriction")(dateRestriction)
    if (dateTimeRange != null) __obj.updateDynamic("dateTimeRange")(dateTimeRange)
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (regexp != null) __obj.updateDynamic("regexp")(regexp)
    if (required != null) __obj.updateDynamic("required")(required)
    if (tooltipCalendar != null) __obj.updateDynamic("tooltipCalendar")(tooltipCalendar)
    if (tooltipCalendarDisabled != null) __obj.updateDynamic("tooltipCalendarDisabled")(tooltipCalendarDisabled)
    if (tooltipCalendarTime != null) __obj.updateDynamic("tooltipCalendarTime")(tooltipCalendarTime)
    if (tooltipCalendarTimeDisabled != null) __obj.updateDynamic("tooltipCalendarTimeDisabled")(tooltipCalendarTimeDisabled)
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader)
    __obj.asInstanceOf[Anon_CurrentText]
  }
}

