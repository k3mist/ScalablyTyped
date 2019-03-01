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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createCursor: js.Function0[XCellCursor],
    createCursorByRange: js.Function1[XCellRange, XCellCursor],
    dispose: js.Function0[scala.Unit],
    getCellByPosition: js.Function2[scala.Double, scala.Double, XCell],
    getCellRangeByName: js.Function1[java.lang.String, XCellRange],
    getCellRangeByPosition: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, XCellRange],
    getColumns: js.Function0[XTableColumns],
    getFastPropertyValue: js.Function1[scala.Double, js.Any],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRows: js.Function0[XTableRows],
    isModified: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setFastPropertyValue: js.Function2[scala.Double, js.Any, scala.Unit],
    setModified: js.Function1[scala.Boolean, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XTable = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, Columns = Columns, PropertySetInfo = PropertySetInfo, RowCount = RowCount, Rows = Rows, acquire = acquire, addEventListener = addEventListener, addModifyListener = addModifyListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createCursor = createCursor, createCursorByRange = createCursorByRange, dispose = dispose, getCellByPosition = getCellByPosition, getCellRangeByName = getCellRangeByName, getCellRangeByPosition = getCellRangeByPosition, getColumns = getColumns, getFastPropertyValue = getFastPropertyValue, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getRows = getRows, isModified = isModified, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeModifyListener = removeModifyListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setFastPropertyValue = setFastPropertyValue, setModified = setModified, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[XTable]
  }
}

