package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyIndividualStudentsOptions extends js.Object {
  /**
    * Ids of students to be added as having access to this
    * coursework/announcement.
    */
  var addStudentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Ids of students to be removed from having access to this
    * coursework/announcement.
    */
  var removeStudentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ModifyIndividualStudentsOptions {
  @scala.inline
  def apply(
    addStudentIds: js.Array[java.lang.String] = null,
    removeStudentIds: js.Array[java.lang.String] = null
  ): ModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (addStudentIds != null) __obj.updateDynamic("addStudentIds")(addStudentIds)
    if (removeStudentIds != null) __obj.updateDynamic("removeStudentIds")(removeStudentIds)
    __obj.asInstanceOf[ModifyIndividualStudentsOptions]
  }
}

