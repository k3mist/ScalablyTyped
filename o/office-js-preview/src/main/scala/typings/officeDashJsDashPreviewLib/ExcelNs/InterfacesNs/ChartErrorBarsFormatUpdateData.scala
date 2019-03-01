package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartErrorBarsFormat object, for use in "chartErrorBarsFormat.set({ ... })". */
trait ChartErrorBarsFormatUpdateData extends js.Object {
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}

object ChartErrorBarsFormatUpdateData {
  @scala.inline
  def apply(line: ChartLineFormatUpdateData = null): ChartErrorBarsFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartErrorBarsFormatUpdateData]
  }
}

