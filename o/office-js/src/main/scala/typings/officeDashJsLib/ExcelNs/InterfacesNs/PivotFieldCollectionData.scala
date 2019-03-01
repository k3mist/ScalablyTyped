package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotFieldCollection.toJSON()". */
trait PivotFieldCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
}

object PivotFieldCollectionData {
  @scala.inline
  def apply(items: js.Array[PivotFieldData] = null): PivotFieldCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PivotFieldCollectionData]
  }
}

