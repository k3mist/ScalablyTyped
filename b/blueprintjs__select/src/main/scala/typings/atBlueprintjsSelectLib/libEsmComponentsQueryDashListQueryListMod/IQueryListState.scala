package typings
package atBlueprintjsSelectLib.libEsmComponentsQueryDashListQueryListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryListState[T] extends js.Object {
  /** The currently focused item (for keyboard interactions). */
  var activeItem: T | scala.Null
  /** The original `items` array filtered by `itemListPredicate` or `itemPredicate`. */
  var filteredItems: js.Array[T]
  /** The current query string. */
  var query: java.lang.String
}

object IQueryListState {
  @scala.inline
  def apply[T](filteredItems: js.Array[T], query: java.lang.String, activeItem: T = null): IQueryListState[T] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems, query = query)
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryListState[T]]
  }
}

