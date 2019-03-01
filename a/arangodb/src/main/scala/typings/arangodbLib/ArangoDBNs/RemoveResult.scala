package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResult[T /* <: js.Object */] extends DocumentMetadata {
  var old: js.UndefOr[Document[T]] = js.undefined
}

object RemoveResult {
  @scala.inline
  def apply[T /* <: js.Object */](_id: java.lang.String, _key: java.lang.String, _rev: java.lang.String, old: Document[T] = null): RemoveResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id, _key = _key, _rev = _rev)
    if (old != null) __obj.updateDynamic("old")(old)
    __obj.asInstanceOf[RemoveResult[T]]
  }
}

