package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeBorderCollection object, for use in "rangeBorderCollection.set({ ... })". */
trait RangeBorderCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
}

object RangeBorderCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[RangeBorderData] = null): RangeBorderCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[RangeBorderCollectionUpdateData]
  }
}

