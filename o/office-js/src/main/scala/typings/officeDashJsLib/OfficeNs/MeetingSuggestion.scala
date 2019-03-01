package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a suggested meeting found in an item. Read mode only.
  *
  * The list of meetings suggested in an email message is returned in the meetingSuggestions property of the Entities object that is returned when 
  * the getEntities or getEntitiesByType method is called on the active item.
  *
  * The start and end values are string representations of a Date object that contains the date and time at which the suggested meeting is to 
  * begin and end. 
  * The values are in the default time zone specified for the current user.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
  * </table>
  */
trait MeetingSuggestion extends js.Object {
  /**
    * Gets the attendees for a suggested meeting.
    */
  var attendees: js.Array[EmailUser]
  /**
    * Gets the date and time that a suggested meeting is to end.
    */
  var end: java.lang.String
  /**
    * Gets the location of a suggested meeting.
    */
  var location: java.lang.String
  /**
    * Gets a string that was identified as a meeting suggestion.
    */
  var meetingString: java.lang.String
  /**
    * Gets the date and time that a suggested meeting is to begin.
    */
  var start: java.lang.String
  /**
    * Gets the subject of a suggested meeting.
    */
  var subject: java.lang.String
}

object MeetingSuggestion {
  @scala.inline
  def apply(
    attendees: js.Array[EmailUser],
    end: java.lang.String,
    location: java.lang.String,
    meetingString: java.lang.String,
    start: java.lang.String,
    subject: java.lang.String
  ): MeetingSuggestion = {
    val __obj = js.Dynamic.literal(attendees = attendees, end = end, location = location, meetingString = meetingString, start = start, subject = subject)
  
    __obj.asInstanceOf[MeetingSuggestion]
  }
}

