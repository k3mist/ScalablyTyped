package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartErrorBarsFormat.toJSON()". */
trait ChartErrorBarsFormatData extends js.Object {
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}

object ChartErrorBarsFormatData {
  @scala.inline
  def apply(line: ChartLineFormatData = null): ChartErrorBarsFormatData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartErrorBarsFormatData]
  }
}

