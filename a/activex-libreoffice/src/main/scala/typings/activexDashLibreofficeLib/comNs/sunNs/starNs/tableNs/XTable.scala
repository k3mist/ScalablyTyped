package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifiable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XCellRange
     with XColumnRowRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XFastPropertySet {
  /** stores the current column count of this table */
  var ColumnCount: scala.Double
  /** stores the current row count of this table */
  var RowCount: scala.Double
  /**
    * creates a cell cursor including the whole table
    * @see com.sun.star.table.CellCursor
    */
  def createCursor(): XCellCursor
  /**
    * creates a cell cursor to travel in the given range context.
    * @param Range the cell range for the cursor.
    * @see com.sun.star.table.CellCursor
    * @throws com::sun::star::lang::IllegalArgumentException if the given reference is empty or not a range from this table.
    */
  def createCursorByRange(Range: XCellRange): XCellCursor
}

object XTable {
  @scala.inline
  def apply(
    ColumnCount: scala.Double,
    Columns: XTableColumns,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RowCount: scala.Double,
    Rows: XTableRows,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    createCursor: () => XCellCursor,
    createCursorByRange: XCellRange => XCellCursor,
    dispose: () => scala.Unit,
    getCellByPosition: (scala.Double, scala.Double) => XCell,
    getCellRangeByName: java.lang.String => XCellRange,
    getCellRangeByPosition: (scala.Double, scala.Double, scala.Double, scala.Double) => XCellRange,
    getColumns: () => XTableColumns,
    getFastPropertyValue: scala.Double => js.Any,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getRows: () => XTableRows,
    isModified: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setFastPropertyValue: (scala.Double, js.Any) => scala.Unit,
    setModified: scala.Boolean => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): XTable = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, Columns = Columns, PropertySetInfo = PropertySetInfo, RowCount = RowCount, Rows = Rows, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createCursor = js.Any.fromFunction0(createCursor), createCursorByRange = js.Any.fromFunction1(createCursorByRange), dispose = js.Any.fromFunction0(dispose), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getColumns = js.Any.fromFunction0(getColumns), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRows = js.Any.fromFunction0(getRows), isModified = js.Any.fromFunction0(isModified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue), setModified = js.Any.fromFunction1(setModified), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XTable]
  }
}

