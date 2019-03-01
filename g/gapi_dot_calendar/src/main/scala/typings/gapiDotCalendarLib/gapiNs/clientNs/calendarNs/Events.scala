package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  // The user's access role for this calendar. Read-only. Possible values are:
  var accessRole: AccessRole
  var defaultReminders: js.Array[gapiDotCalendarLib.Anon_Method]
  var description: java.lang.String
  var etag: etag
  var items: js.Array[Event]
  var kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#events`
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var nextSyncToken: js.UndefOr[java.lang.String] = js.undefined
  var summary: java.lang.String
  var timeZone: java.lang.String
  var updated: datetime
}

@JSGlobal("gapi.client.calendar.events")
@js.native
class events () extends js.Object

object Events {
  @scala.inline
  def apply(
    accessRole: AccessRole,
    defaultReminders: js.Array[gapiDotCalendarLib.Anon_Method],
    description: java.lang.String,
    etag: etag,
    items: js.Array[Event],
    kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#events`,
    summary: java.lang.String,
    timeZone: java.lang.String,
    updated: datetime,
    nextPageToken: java.lang.String = null,
    nextSyncToken: java.lang.String = null
  ): Events = {
    val __obj = js.Dynamic.literal(accessRole = accessRole, defaultReminders = defaultReminders, description = description, etag = etag, items = items, kind = kind, summary = summary, timeZone = timeZone, updated = updated)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    __obj.asInstanceOf[Events]
  }
}

/* static members */
@JSGlobal("gapi.client.calendar.events")
@js.native
object events extends js.Object {
  // delete the existing event from calendar
  def delete(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.EventsDeleteParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Event] = js.native
  def get(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.EventsGetParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Event] = js.native
  def insert(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.EventsInsertParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Event] = js.native
  def list(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.EventsListParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Events] = js.native
  def update(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.EventsUpdateParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Event] = js.native
}

