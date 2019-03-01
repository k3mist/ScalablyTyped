package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarList extends js.Object {
  /** ETag of the collection. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Calendars that are present on the user's calendar list. */
  var items: js.UndefOr[js.Array[CalendarListEntry]] = js.undefined
  /** Type of the collection ("calendar#calendarList"). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token used to access the next page of this result. Omitted if no further results are available, in which case nextSyncToken is provided. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned. Omitted if further results are
    * available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[CalendarListEntry] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    nextSyncToken: java.lang.String = null
  ): CalendarList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    __obj.asInstanceOf[CalendarList]
  }
}

