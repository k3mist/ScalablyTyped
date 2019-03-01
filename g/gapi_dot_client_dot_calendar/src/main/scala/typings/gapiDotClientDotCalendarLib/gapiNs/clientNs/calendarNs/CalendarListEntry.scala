package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListEntry extends js.Object {
  /**
    * The effective access role that the authenticated user has on the calendar. Read-only. Possible values are:
    * - "freeBusyReader" - Provides read access to free/busy information.
    * - "reader" - Provides read access to the calendar. Private events will appear to users with reader access, but event details will be hidden.
    * - "writer" - Provides read and write access to the calendar. Private events will appear to users with writer access, and event details will be visible.
    *
    * - "owner" - Provides ownership of the calendar. This role has all of the permissions of the writer role with the additional ability to see and
    * manipulate ACLs.
    */
  var accessRole: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The main color of the calendar in the hexadecimal format "#0088aa". This property supersedes the index-based colorId property. To set or change this
    * property, you need to specify colorRgbFormat=true in the parameters of the insert, update and patch methods. Optional.
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color of the calendar. This is an ID referring to an entry in the calendar section of the colors definition (see the colors endpoint). This
    * property is superseded by the backgroundColor and foregroundColor properties and can be ignored when using these properties. Optional.
    */
  var colorId: js.UndefOr[java.lang.String] = js.undefined
  /** The default reminders that the authenticated user has for this calendar. */
  var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.undefined
  /** Whether this calendar list entry has been deleted from the calendar list. Read-only. Optional. The default is False. */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Description of the calendar. Optional. Read-only. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The foreground color of the calendar in the hexadecimal format "#ffffff". This property supersedes the index-based colorId property. To set or change
    * this property, you need to specify colorRgbFormat=true in the parameters of the insert, update and patch methods. Optional.
    */
  var foregroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the calendar has been hidden from the list. Optional. The default is False. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifier of the calendar. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource ("calendar#calendarListEntry"). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Geographic location of the calendar as free-form text. Optional. Read-only. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The notifications that the authenticated user is receiving for this calendar. */
  var notificationSettings: js.UndefOr[gapiDotClientDotCalendarLib.Anon_Notifications] = js.undefined
  /** Whether the calendar is the primary calendar of the authenticated user. Read-only. Optional. The default is False. */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the calendar content shows up in the calendar UI. Optional. The default is False. */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** Title of the calendar. Read-only. */
  var summary: js.UndefOr[java.lang.String] = js.undefined
  /** The summary that the authenticated user has set for this calendar. Optional. */
  var summaryOverride: js.UndefOr[java.lang.String] = js.undefined
  /** The time zone of the calendar. Optional. Read-only. */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarListEntry {
  @scala.inline
  def apply(
    accessRole: java.lang.String = null,
    backgroundColor: java.lang.String = null,
    colorId: java.lang.String = null,
    defaultReminders: js.Array[EventReminder] = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    etag: java.lang.String = null,
    foregroundColor: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    location: java.lang.String = null,
    notificationSettings: gapiDotClientDotCalendarLib.Anon_Notifications = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    summary: java.lang.String = null,
    summaryOverride: java.lang.String = null,
    timeZone: java.lang.String = null
  ): CalendarListEntry = {
    val __obj = js.Dynamic.literal()
    if (accessRole != null) __obj.updateDynamic("accessRole")(accessRole)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (colorId != null) __obj.updateDynamic("colorId")(colorId)
    if (defaultReminders != null) __obj.updateDynamic("defaultReminders")(defaultReminders)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (description != null) __obj.updateDynamic("description")(description)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (summaryOverride != null) __obj.updateDynamic("summaryOverride")(summaryOverride)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[CalendarListEntry]
  }
}

