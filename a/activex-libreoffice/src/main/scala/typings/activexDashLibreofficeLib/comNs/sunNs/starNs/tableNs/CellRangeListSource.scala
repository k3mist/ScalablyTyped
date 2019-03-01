package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the a source of list entries coming from a cell range in a table document
  *
  * The component cannot be instantiated at a global service factory, instead it's usually provided by a document instance.
  * @see com.sun.star.document.OfficeDocument
  */
trait CellRangeListSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ListEntrySource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /** specifies the cell range within a document to which the component is bound. */
  var CellRange: CellRangeAddress
}

object CellRangeListSource {
  @scala.inline
  def apply(
    AllListEntries: activexDashInteropLib.SafeArray[java.lang.String],
    CellRange: CellRangeAddress,
    ListEntryCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addListEntryListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.XListEntryListener, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    getAllListEntries: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getListEntry: js.Function1[scala.Double, java.lang.String],
    getListEntryCount: js.Function0[scala.Double],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeListEntryListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.XListEntryListener, 
      scala.Unit
    ]
  ): CellRangeListSource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries, CellRange = CellRange, ListEntryCount = ListEntryCount, acquire = acquire, addEventListener = addEventListener, addListEntryListener = addListEntryListener, dispose = dispose, getAllListEntries = getAllListEntries, getListEntry = getListEntry, getListEntryCount = getListEntryCount, initialize = initialize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeListEntryListener = removeListEntryListener)
  
    __obj.asInstanceOf[CellRangeListSource]
  }
}

