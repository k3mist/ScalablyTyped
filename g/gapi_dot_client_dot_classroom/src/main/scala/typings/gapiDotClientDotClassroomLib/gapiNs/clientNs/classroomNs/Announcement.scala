package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Announcement extends js.Object {
  /**
    * Absolute link to this announcement in the Classroom web UI.
    * This is only populated if `state` is `PUBLISHED`.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Assignee mode of the announcement.
    * If unspecified, the default value is `ALL_STUDENTS`.
    */
  var assigneeMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Timestamp when this announcement was created.
    *
    * Read-only.
    */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier for the user that created the announcement.
    *
    * Read-only.
    */
  var creatorUserId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Classroom-assigned identifier of this announcement, unique per course.
    *
    * Read-only.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifiers of students with access to the announcement.
    * This field is set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    * If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students specified in this
    * field will be able to see the announcement.
    */
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
  /**
    * Additional materials.
    *
    * Announcements must have no more than 20 material items.
    */
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  /** Optional timestamp when this announcement is scheduled to be published. */
  var scheduledTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Status of this announcement.
    * If unspecified, the default state is `DRAFT`.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Description of this announcement.
    * The text must be a valid UTF-8 string containing no more
    * than 30,000 characters.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Timestamp of the most recent change to this announcement.
    *
    * Read-only.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object Announcement {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    assigneeMode: java.lang.String = null,
    courseId: java.lang.String = null,
    creationTime: java.lang.String = null,
    creatorUserId: java.lang.String = null,
    id: java.lang.String = null,
    individualStudentsOptions: IndividualStudentsOptions = null,
    materials: js.Array[Material] = null,
    scheduledTime: java.lang.String = null,
    state: java.lang.String = null,
    text: java.lang.String = null,
    updateTime: java.lang.String = null
  ): Announcement = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode)
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (creatorUserId != null) __obj.updateDynamic("creatorUserId")(creatorUserId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (individualStudentsOptions != null) __obj.updateDynamic("individualStudentsOptions")(individualStudentsOptions)
    if (materials != null) __obj.updateDynamic("materials")(materials)
    if (scheduledTime != null) __obj.updateDynamic("scheduledTime")(scheduledTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (text != null) __obj.updateDynamic("text")(text)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[Announcement]
  }
}

