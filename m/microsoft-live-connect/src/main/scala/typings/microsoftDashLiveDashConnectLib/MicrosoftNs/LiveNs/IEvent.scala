package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Event object contains info about events on a user's Outlook.com
  * calendars. The Live Connect REST API supports creating Event objects. Use
  * the wl.events_create scope to create Event objects on the user's default
  * calendar only. Use the wl.calendars scope to read Event objects on the
  * user's calendars. Use wl.calendars_update to create Event objects on any
  * of the user's calendars. Use the wl.contacts_calendars scope to read
  * Event objects from the user's friend's calendars.
  */
trait IEvent extends js.Object {
  /**
    * The user's availability status for the event. Valid values are:
    * - free
    * - busy
    * - tentative
    * - out_of_office
    * @default "free"
    */
  var availability: java.lang.String
  /**
    * The ID of the calendar that contains the event.
    */
  var calendar_id: java.lang.String
  /**
    * The time, in ISO 8601 format, at which the event was created.
    */
  var created_time: java.lang.String
  /**
    * A description of the event, with a maximum length of 32,768
    * characters. This structure is required.
    */
  var description: java.lang.String
  /**
    * The end time, in ISO 8601 format, of the event. If no end time is
    * specified, the default value is 30 minutes after start_time. This
    * structure is optional when creating an event. When the event is being
    * read, the time will be the user's local time, in ISO 8601 format.
    */
  var end_time: java.lang.String
  /**
    * The object that contains the name and ID of the organizer.
    */
  var from: IUserInfo
  /**
    * The ID of the event.
    */
  var id: java.lang.String
  /**
    * A value that specifies whether the event is an all-day event. If the
    * event is an all-day event, this value is true; otherwise, it is
    * false. If this structure is missing, the default value is false.
    */
  var is_all_day_event: scala.Boolean
  /**
    * A value that specifies whether the event is recurring. If the event
    * is recurring, this value is true; otherwise, it is false.
    */
  var is_recurrent: scala.Boolean
  /**
    * The name of the location at which the event will take place. The
    * maximum length is 1,000 characters.
    */
  var location: java.lang.String
  /**
    * The name of the event, with a maximum length of 255 characters. This
    * structure is required.
    */
  var name: java.lang.String
  /**
    * The text description of the recurrence pattern, for example, "Occurs
    * every week on Tuesday". The value is Null if this is not a recurrent
    * event.
    */
  var recurrence: java.lang.String
  /**
    * The time, in minutes, before the event for the reminder alarm.
    */
  var reminder_time: scala.Double
  /**
    * The start time, in ISO 8601 format, of the event. When the event is
    * being read, the time will be the user's local time, in ISO 8601
    * format.
    */
  var start_time: java.lang.String
  /**
    * The time, in ISO 8601 format, at which the event was updated. This
    * structure is visible only in the Event object that is returned if the
    * event was successfully created.
    */
  var updated_time: java.lang.String
  /**
    * A value that specifies whether the event is publicly visible. Valid
    * values are:
    * - public   the event is visible to anyone who can view the calendar.
    * - private  the event is visible only to the event owner.
    * @default "public"
    */
  var visibility: java.lang.String
}

object IEvent {
  @scala.inline
  def apply(
    availability: java.lang.String,
    calendar_id: java.lang.String,
    created_time: java.lang.String,
    description: java.lang.String,
    end_time: java.lang.String,
    from: IUserInfo,
    id: java.lang.String,
    is_all_day_event: scala.Boolean,
    is_recurrent: scala.Boolean,
    location: java.lang.String,
    name: java.lang.String,
    recurrence: java.lang.String,
    reminder_time: scala.Double,
    start_time: java.lang.String,
    updated_time: java.lang.String,
    visibility: java.lang.String
  ): IEvent = {
    val __obj = js.Dynamic.literal(availability = availability, calendar_id = calendar_id, created_time = created_time, description = description, end_time = end_time, from = from, id = id, is_all_day_event = is_all_day_event, is_recurrent = is_recurrent, location = location, name = name, recurrence = recurrence, reminder_time = reminder_time, start_time = start_time, updated_time = updated_time, visibility = visibility)
  
    __obj.asInstanceOf[IEvent]
  }
}

