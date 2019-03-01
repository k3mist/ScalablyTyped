package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides easy read/write access to the complete configuration.
  *
  * This service is still unpublished and unstable.
  * @since LibreOffice 4.0
  */
trait ReadWriteAccess extends XReadWriteAccess {
  /**
    * Service constructor.
    * @param locale a string representation of the locale to use for localized properties; use `*` for all-locale access
    */
  def create(locale: java.lang.String): scala.Unit
}

object ReadWriteAccess {
  @scala.inline
  def apply(
    PendingChanges: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    acquire: js.Function0[scala.Unit],
    commitChanges: js.Function0[scala.Unit],
    create: js.Function1[java.lang.String, scala.Unit],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getPendingChanges: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet],
    getPropertyByHierarchicalName: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    hasPendingChanges: js.Function0[scala.Boolean],
    hasPropertyByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    replaceByHierarchicalName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): ReadWriteAccess = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = acquire, commitChanges = commitChanges, create = create, getByHierarchicalName = getByHierarchicalName, getPendingChanges = getPendingChanges, getPropertyByHierarchicalName = getPropertyByHierarchicalName, hasByHierarchicalName = hasByHierarchicalName, hasPendingChanges = hasPendingChanges, hasPropertyByHierarchicalName = hasPropertyByHierarchicalName, queryInterface = queryInterface, release = release, replaceByHierarchicalName = replaceByHierarchicalName)
  
    __obj.asInstanceOf[ReadWriteAccess]
  }
}

