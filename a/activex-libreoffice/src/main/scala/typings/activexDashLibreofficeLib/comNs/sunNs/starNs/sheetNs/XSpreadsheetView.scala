package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the main interface of a {@link SpreadsheetView} . It manages the active sheet within this view. */
trait XSpreadsheetView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the sheet that is shown in the view. */
  var ActiveSheet: XSpreadsheet
  /** returns the sheet that is shown in the view. */
  def getActiveSheet(): XSpreadsheet
  /** sets the sheet that is shown in the view. */
  def setActiveSheet(xActiveSheet: XSpreadsheet): scala.Unit
}

object XSpreadsheetView {
  @scala.inline
  def apply(
    ActiveSheet: XSpreadsheet,
    acquire: () => scala.Unit,
    getActiveSheet: () => XSpreadsheet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setActiveSheet: XSpreadsheet => scala.Unit
  ): XSpreadsheetView = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet, acquire = js.Any.fromFunction0(acquire), getActiveSheet = js.Any.fromFunction0(getActiveSheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setActiveSheet = js.Any.fromFunction1(setActiveSheet))
  
    __obj.asInstanceOf[XSpreadsheetView]
  }
}

