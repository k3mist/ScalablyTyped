package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionSelector extends js.Object {
  /**
    * When false, selects only collections that are immediate children of
    * the `parent` specified in the containing `RunQueryRequest`.
    * When true, selects all descendant collections.
    */
  var allDescendants: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The collection ID.
    * When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[java.lang.String] = js.undefined
}

object CollectionSelector {
  @scala.inline
  def apply(allDescendants: js.UndefOr[scala.Boolean] = js.undefined, collectionId: java.lang.String = null): CollectionSelector = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allDescendants)) __obj.updateDynamic("allDescendants")(allDescendants)
    if (collectionId != null) __obj.updateDynamic("collectionId")(collectionId)
    __obj.asInstanceOf[CollectionSelector]
  }
}

