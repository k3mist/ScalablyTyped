package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the service {@link com.sun.star.sdbc.Driver} by beans for data definition.
  *
  * This service is optional for each driver. Its purpose is to define a common way for database definition, as the DDL differs between most DBMS.
  *
  * Definition and deletion of database catalogs can't be defined in a common manner for DBMS, but it should be possible to hide much of the complexity of
  * creation and deletion of catalogs. Each driver could provide methods to cover these tasks.
  */
trait Driver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDriver
     with XDataDefinitionSupplier
     with XCreateCatalog
     with XDropCatalog

object Driver {
  @scala.inline
  def apply(
    MajorVersion: scala.Double,
    MinorVersion: scala.Double,
    acceptsURL: java.lang.String => scala.Boolean,
    acquire: () => scala.Unit,
    connect: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    createCatalog: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Unit,
    dropCatalog: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    getDataDefinitionByConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection => XTablesSupplier,
    getDataDefinitionByURL: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => XTablesSupplier,
    getMajorVersion: () => scala.Double,
    getMinorVersion: () => scala.Double,
    getPropertyInfo: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DriverPropertyInfo],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): Driver = {
    val __obj = js.Dynamic.literal(MajorVersion = MajorVersion, MinorVersion = MinorVersion, acceptsURL = js.Any.fromFunction1(acceptsURL), acquire = js.Any.fromFunction0(acquire), connect = js.Any.fromFunction2(connect), createCatalog = js.Any.fromFunction1(createCatalog), dropCatalog = js.Any.fromFunction2(dropCatalog), getDataDefinitionByConnection = js.Any.fromFunction1(getDataDefinitionByConnection), getDataDefinitionByURL = js.Any.fromFunction2(getDataDefinitionByURL), getMajorVersion = js.Any.fromFunction0(getMajorVersion), getMinorVersion = js.Any.fromFunction0(getMinorVersion), getPropertyInfo = js.Any.fromFunction2(getPropertyInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[Driver]
  }
}

