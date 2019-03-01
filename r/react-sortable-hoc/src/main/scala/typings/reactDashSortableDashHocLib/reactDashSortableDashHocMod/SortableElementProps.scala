package typings
package reactDashSortableDashHocLib.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableElementProps extends js.Object {
  var collection: js.UndefOr[Offset] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var index: scala.Double
}

object SortableElementProps {
  @scala.inline
  def apply(index: scala.Double, collection: Offset = null, disabled: js.UndefOr[scala.Boolean] = js.undefined): SortableElementProps = {
    val __obj = js.Dynamic.literal(index = index)
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[SortableElementProps]
  }
}

