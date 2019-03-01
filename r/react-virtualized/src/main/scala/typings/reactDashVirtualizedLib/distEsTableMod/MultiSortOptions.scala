package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSortOptions extends js.Object {
  var defaultSortBy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var defaultSortDirection: js.UndefOr[SortDirectionMap] = js.undefined
}

object MultiSortOptions {
  @scala.inline
  def apply(defaultSortBy: js.Array[java.lang.String] = null, defaultSortDirection: SortDirectionMap = null): MultiSortOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultSortBy != null) __obj.updateDynamic("defaultSortBy")(defaultSortBy)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    __obj.asInstanceOf[MultiSortOptions]
  }
}

