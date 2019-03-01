package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentDelete extends js.Object {
  /** The resource name of the Document that was deleted. */
  var document: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The read timestamp at which the delete was observed.
    *
    * Greater or equal to the `commit_time` of the delete.
    */
  var readTime: js.UndefOr[java.lang.String] = js.undefined
  /** A set of target IDs for targets that previously matched this entity. */
  var removedTargetIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object DocumentDelete {
  @scala.inline
  def apply(
    document: java.lang.String = null,
    readTime: java.lang.String = null,
    removedTargetIds: js.Array[scala.Double] = null
  ): DocumentDelete = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (readTime != null) __obj.updateDynamic("readTime")(readTime)
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds)
    __obj.asInstanceOf[DocumentDelete]
  }
}

