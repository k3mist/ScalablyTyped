package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectedEventArgs extends js.Object {
  /** Returns the specific HeatMap cell
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Value displayed on the cell
    */
  var cellValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the HeatMap cell data
    */
  var source: js.UndefOr[js.Any] = js.undefined
}

object CellSelectedEventArgs {
  @scala.inline
  def apply(cell: js.Any = null, cellValue: java.lang.String = null, source: js.Any = null): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
}

