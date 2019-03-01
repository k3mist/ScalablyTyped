package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the layout settings of a data pilot table.
  *
  * This interface extends the interface {@link com.sun.star.container.XNamed} which provides access to the name of the data pilot table used e.g. in
  * collections.
  * @see com.sun.star.sheet.DataPilotDescriptor
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val ColumnFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val DataFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the collection of all the data pilot fields. */
  val DataPilotFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  val FilterDescriptor: XSheetFilterDescriptor
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val HiddenFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val PageFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val RowFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the cell range containing the data for the data pilot table. */
  var SourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns an additional string stored in the data pilot table. */
  var Tag: java.lang.String
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getColumnFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getDataFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the collection of all the data pilot fields. */
  def getDataPilotFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  def getFilterDescriptor(): XSheetFilterDescriptor
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getHiddenFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getPageFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getRowFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the cell range containing the data for the data pilot table. */
  def getSourceRange(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns an additional string stored in the data pilot table. */
  def getTag(): java.lang.String
  /** sets the cell range containing the data for the data pilot table. */
  def setSourceRange(aSourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /** sets an additional string stored in the data pilot table. */
  def setTag(aTag: java.lang.String): scala.Unit
}

object XDataPilotDescriptor {
  @scala.inline
  def apply(
    ColumnFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    DataFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    DataPilotFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Name: java.lang.String,
    PageFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    RowFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    SourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    Tag: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getColumnFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getDataFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getDataPilotFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getFilterDescriptor: js.Function0[XSheetFilterDescriptor],
    getHiddenFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getName: js.Function0[java.lang.String],
    getPageFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getRowFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getSourceRange: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getTag: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setSourceRange: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    setTag: js.Function1[java.lang.String, scala.Unit]
  ): XDataPilotDescriptor = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields, DataFields = DataFields, DataPilotFields = DataPilotFields, FilterDescriptor = FilterDescriptor, HiddenFields = HiddenFields, Name = Name, PageFields = PageFields, RowFields = RowFields, SourceRange = SourceRange, Tag = Tag, acquire = acquire, getColumnFields = getColumnFields, getDataFields = getDataFields, getDataPilotFields = getDataPilotFields, getFilterDescriptor = getFilterDescriptor, getHiddenFields = getHiddenFields, getName = getName, getPageFields = getPageFields, getRowFields = getRowFields, getSourceRange = getSourceRange, getTag = getTag, queryInterface = queryInterface, release = release, setName = setName, setSourceRange = setSourceRange, setTag = setTag)
  
    __obj.asInstanceOf[XDataPilotDescriptor]
  }
}

