package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Segmentid extends js.Object {
  var segment_id: js.UndefOr[java.lang.String] = js.undefined
  var tag_id: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Segmentid {
  @scala.inline
  def apply(segment_id: java.lang.String = null, tag_id: java.lang.String = null): Anon_Segmentid = {
    val __obj = js.Dynamic.literal()
    if (segment_id != null) __obj.updateDynamic("segment_id")(segment_id)
    if (tag_id != null) __obj.updateDynamic("tag_id")(tag_id)
    __obj.asInstanceOf[Anon_Segmentid]
  }
}

