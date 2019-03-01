package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * information about a cell positioned within the result area of a DataPilot table.
  *
  * {@link DataPilotTableResultData} contains information about a particular cell positioned within the result area of a DataPilot table.
  * @see com.sun.star.sheet.DataPilotTablePositionData
  * @see com.sun.star.sheet.DataPilotTablePositionType
  * @see com.sun.star.sheet.DataPilotFieldFilter
  * @see com.sun.star.sheet.DataResult
  * @since OOo 3.0
  */
trait DataPilotTableResultData extends js.Object {
  /**
    * This is a 0-based index that specifies which data field the data displayed in the cell is for; the value of 0 means the cell is for the first data
    * field, 1 for the second, and so on.
    */
  var DataFieldIndex: scala.Double
  /**
    * This is a set of filter criteria that can be used to re-create those data rows that contribute to the value shown in the cell.
    * @see com.sun.star.sheet.DataPilotFieldFilter
    */
  var FieldFilters: activexDashInteropLib.SafeArray[DataPilotFieldFilter]
  /**
    * more information about the result contained in the {@link DataResult} type.
    * @see com.sun.star.sheet.DataResult
    */
  var Result: DataResult
}

object DataPilotTableResultData {
  @scala.inline
  def apply(
    DataFieldIndex: scala.Double,
    FieldFilters: activexDashInteropLib.SafeArray[DataPilotFieldFilter],
    Result: DataResult
  ): DataPilotTableResultData = {
    val __obj = js.Dynamic.literal(DataFieldIndex = DataFieldIndex, FieldFilters = FieldFilters, Result = Result)
  
    __obj.asInstanceOf[DataPilotTableResultData]
  }
}

