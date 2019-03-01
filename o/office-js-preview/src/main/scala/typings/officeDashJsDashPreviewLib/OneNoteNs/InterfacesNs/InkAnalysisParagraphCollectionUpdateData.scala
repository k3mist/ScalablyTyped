package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisParagraphCollection object, for use in "inkAnalysisParagraphCollection.set({ ... })". */
trait InkAnalysisParagraphCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.undefined
}

object InkAnalysisParagraphCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[InkAnalysisParagraphData] = null): InkAnalysisParagraphCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[InkAnalysisParagraphCollectionUpdateData]
  }
}

