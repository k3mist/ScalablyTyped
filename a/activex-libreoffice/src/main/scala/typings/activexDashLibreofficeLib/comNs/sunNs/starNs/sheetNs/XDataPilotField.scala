package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to control a data pilot field which has already been created.
  * @see com.sun.star.sheet.DataPilotField
  */
trait XDataPilotField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  val Items: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  def getItems(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XDataPilotField {
  @scala.inline
  def apply(
    Items: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: () => scala.Unit,
    getItems: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDataPilotField = {
    val __obj = js.Dynamic.literal(Items = Items, acquire = js.Any.fromFunction0(acquire), getItems = js.Any.fromFunction0(getItems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataPilotField]
  }
}

