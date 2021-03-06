package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to execute operations on a cell range or ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetOperation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * clears the specified contents of the current cell range(s).
    * @param nContentFlags a combination of {@link CellFlags} flags selecting the contents to be deleted.
    */
  def clearContents(nContentFlags: scala.Double): scala.Unit
  /**
    * computes a general function based on all cells in the current cell range(s).
    * @param nFunction is the function used to compute the result.
    * @returns the result of the calculation.
    */
  def computeFunction(nFunction: GeneralFunction): scala.Double
}

object XSheetOperation {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    clearContents: scala.Double => scala.Unit,
    computeFunction: GeneralFunction => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSheetOperation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clearContents = js.Any.fromFunction1(clearContents), computeFunction = js.Any.fromFunction1(computeFunction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetOperation]
  }
}

