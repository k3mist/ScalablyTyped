package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseMaterialSet extends js.Object {
  /** Materials attached to this set. */
  var materials: js.UndefOr[js.Array[CourseMaterial]] = js.undefined
  /** Title for this set. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object CourseMaterialSet {
  @scala.inline
  def apply(materials: js.Array[CourseMaterial] = null, title: java.lang.String = null): CourseMaterialSet = {
    val __obj = js.Dynamic.literal()
    if (materials != null) __obj.updateDynamic("materials")(materials)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CourseMaterialSet]
  }
}

