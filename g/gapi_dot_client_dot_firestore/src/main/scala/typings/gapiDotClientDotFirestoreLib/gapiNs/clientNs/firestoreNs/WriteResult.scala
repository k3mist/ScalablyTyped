package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  /**
    * The results of applying each DocumentTransform.FieldTransform, in the
    * same order.
    */
  var transformResults: js.UndefOr[js.Array[Value]] = js.undefined
  /**
    * The last update time of the document after applying the write. Not set
    * after a `delete`.
    *
    * If the write did not actually change the document, this will be the
    * previous update_time.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object WriteResult {
  @scala.inline
  def apply(transformResults: js.Array[Value] = null, updateTime: java.lang.String = null): WriteResult = {
    val __obj = js.Dynamic.literal()
    if (transformResults != null) __obj.updateDynamic("transformResults")(transformResults)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[WriteResult]
  }
}

