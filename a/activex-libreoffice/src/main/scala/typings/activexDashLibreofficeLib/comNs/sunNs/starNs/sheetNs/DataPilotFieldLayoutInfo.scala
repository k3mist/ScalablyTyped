package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the layout information of a {@link DataPilotField} . */
trait DataPilotFieldLayoutInfo extends js.Object {
  /** If `TRUE` , an empty row is inserted in the {@link DataPilotTable} result table after the data (including the subtotals) for each item of the field. */
  var AddEmptyLines: scala.Boolean
  /**
    * specifies the layout mode.
    * @see com.sun.star.sheet.DataPilotFieldLayoutMode
    */
  var LayoutMode: scala.Double
}

object DataPilotFieldLayoutInfo {
  @scala.inline
  def apply(AddEmptyLines: scala.Boolean, LayoutMode: scala.Double): DataPilotFieldLayoutInfo = {
    val __obj = js.Dynamic.literal(AddEmptyLines = AddEmptyLines, LayoutMode = LayoutMode)
  
    __obj.asInstanceOf[DataPilotFieldLayoutInfo]
  }
}

