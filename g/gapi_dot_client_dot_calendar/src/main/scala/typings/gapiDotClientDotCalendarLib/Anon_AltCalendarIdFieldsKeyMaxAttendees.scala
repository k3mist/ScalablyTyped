package typings
package gapiDotClientDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCalendarIdFieldsKeyMaxAttendees extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in
    * user, use the "primary" keyword.
    */
  var calendarId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned.
    * Optional.
    */
  var maxAttendees: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to send notifications about the creation of the new event. Optional. The default is False. */
  var sendNotifications: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether API client performing operation supports event attachments. Optional. The default is False. */
  var supportsAttachments: js.UndefOr[scala.Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCalendarIdFieldsKeyMaxAttendees {
  @scala.inline
  def apply(
    calendarId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    maxAttendees: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    sendNotifications: js.UndefOr[scala.Boolean] = js.undefined,
    supportsAttachments: js.UndefOr[scala.Boolean] = js.undefined,
    userIp: java.lang.String = null
  ): Anon_AltCalendarIdFieldsKeyMaxAttendees = {
    val __obj = js.Dynamic.literal(calendarId = calendarId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxAttendees != null) __obj.updateDynamic("maxAttendees")(maxAttendees.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications)
    if (!js.isUndefined(supportsAttachments)) __obj.updateDynamic("supportsAttachments")(supportsAttachments)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCalendarIdFieldsKeyMaxAttendees]
  }
}

