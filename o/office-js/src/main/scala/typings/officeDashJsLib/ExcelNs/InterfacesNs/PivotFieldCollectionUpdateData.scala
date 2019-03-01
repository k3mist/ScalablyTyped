package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotFieldCollection object, for use in "pivotFieldCollection.set({ ... })". */
trait PivotFieldCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
}

object PivotFieldCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[PivotFieldData] = null): PivotFieldCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PivotFieldCollectionUpdateData]
  }
}

