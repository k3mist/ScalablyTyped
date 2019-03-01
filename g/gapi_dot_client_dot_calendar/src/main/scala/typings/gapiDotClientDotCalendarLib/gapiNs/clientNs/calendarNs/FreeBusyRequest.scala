package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequest extends js.Object {
  /** Maximal number of calendars for which FreeBusy information is to be provided. Optional. */
  var calendarExpansionMax: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximal number of calendar identifiers to be provided for a single group. Optional. An error will be returned for a group with more members than this
    * value.
    */
  var groupExpansionMax: js.UndefOr[scala.Double] = js.undefined
  /** List of calendars and/or groups to query. */
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.undefined
  /** The end of the interval for the query. */
  var timeMax: js.UndefOr[java.lang.String] = js.undefined
  /** The start of the interval for the query. */
  var timeMin: js.UndefOr[java.lang.String] = js.undefined
  /** Time zone used in the response. Optional. The default is UTC. */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object FreeBusyRequest {
  @scala.inline
  def apply(
    calendarExpansionMax: scala.Int | scala.Double = null,
    groupExpansionMax: scala.Int | scala.Double = null,
    items: js.Array[FreeBusyRequestItem] = null,
    timeMax: java.lang.String = null,
    timeMin: java.lang.String = null,
    timeZone: java.lang.String = null
  ): FreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    if (calendarExpansionMax != null) __obj.updateDynamic("calendarExpansionMax")(calendarExpansionMax.asInstanceOf[js.Any])
    if (groupExpansionMax != null) __obj.updateDynamic("groupExpansionMax")(groupExpansionMax.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax)
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[FreeBusyRequest]
  }
}

