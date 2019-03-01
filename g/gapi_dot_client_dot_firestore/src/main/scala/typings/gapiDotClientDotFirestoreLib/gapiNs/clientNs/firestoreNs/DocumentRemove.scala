package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRemove extends js.Object {
  /** The resource name of the Document that has gone out of view. */
  var document: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The read timestamp at which the remove was observed.
    *
    * Greater or equal to the `commit_time` of the change/delete/remove.
    */
  var readTime: js.UndefOr[java.lang.String] = js.undefined
  /** A set of target IDs for targets that previously matched this document. */
  var removedTargetIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object DocumentRemove {
  @scala.inline
  def apply(
    document: java.lang.String = null,
    readTime: java.lang.String = null,
    removedTargetIds: js.Array[scala.Double] = null
  ): DocumentRemove = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (readTime != null) __obj.updateDynamic("readTime")(readTime)
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds)
    __obj.asInstanceOf[DocumentRemove]
  }
}

