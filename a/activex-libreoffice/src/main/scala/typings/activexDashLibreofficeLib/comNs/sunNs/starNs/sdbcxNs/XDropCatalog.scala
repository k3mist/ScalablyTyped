package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * may be implemented to hide the complexity of dropping a database catalog. Could normally be used only in offline mode, no connection on the database.
  * This should be checked by the driver.
  */
trait XDropCatalog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * drops a catalog identified by its name.
    * @param catalogName the catalog name
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropCatalog(
    catalogName: java.lang.String,
    info: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XDropCatalog {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    dropCatalog: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDropCatalog = {
    val __obj = js.Dynamic.literal(acquire = acquire, dropCatalog = dropCatalog, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDropCatalog]
  }
}

