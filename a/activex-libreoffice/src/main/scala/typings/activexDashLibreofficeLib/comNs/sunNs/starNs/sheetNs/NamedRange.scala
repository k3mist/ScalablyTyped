package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a named range in a spreadsheet document.
  *
  * In fact a named range is a named formula expression. A cell range address is one possible content of a named range.
  * @see com.sun.star.sheet.NamedRanges
  */
trait NamedRange
  extends XNamedRange
     with XCellRangeReferrer {
  /**
    * Determines if this defined name represents a shared formula.
    *
    * This special property shall not be used externally. It is used by import and export filters for compatibility with spreadsheet documents containing
    * shared formulas. Shared formulas are shared by several cells to save memory and to decrease file size.
    *
    * A defined name with this property set will not appear in the user interface of Calc, and its name will not appear in cell formulas. A formula
    * referring to this defined name will show the formula definition contained in the name instead.
    * @since OOo 3.0
    */
  var IsSharedFormula: scala.Boolean
  /**
    * returns the index used to refer to this name in token arrays.
    *
    * A token describing a defined name shall contain the op-code obtained from the {@link FormulaMapGroupSpecialOffset.NAME} offset and this index as data
    * part.
    * @see com.sun.star.sheet.FormulaToken
    * @see com.sun.star.sheet.FormulaMapGroupSpecialOffset.NAME
    * @since OOo 3.0
    */
  var TokenIndex: scala.Double
}

object NamedRange {
  @scala.inline
  def apply(
    Content: java.lang.String,
    IsSharedFormula: scala.Boolean,
    Name: java.lang.String,
    ReferencePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    ReferredCells: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    TokenIndex: scala.Double,
    Type: scala.Double,
    acquire: () => scala.Unit,
    getContent: () => java.lang.String,
    getName: () => java.lang.String,
    getReferencePosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    getReferredCells: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setContent: java.lang.String => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setReferencePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Unit,
    setType: scala.Double => scala.Unit
  ): NamedRange = {
    val __obj = js.Dynamic.literal(Content = Content, IsSharedFormula = IsSharedFormula, Name = Name, ReferencePosition = ReferencePosition, ReferredCells = ReferredCells, TokenIndex = TokenIndex, Type = Type, acquire = js.Any.fromFunction0(acquire), getContent = js.Any.fromFunction0(getContent), getName = js.Any.fromFunction0(getName), getReferencePosition = js.Any.fromFunction0(getReferencePosition), getReferredCells = js.Any.fromFunction0(getReferredCells), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContent = js.Any.fromFunction1(setContent), setName = js.Any.fromFunction1(setName), setReferencePosition = js.Any.fromFunction1(setReferencePosition), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[NamedRange]
  }
}

