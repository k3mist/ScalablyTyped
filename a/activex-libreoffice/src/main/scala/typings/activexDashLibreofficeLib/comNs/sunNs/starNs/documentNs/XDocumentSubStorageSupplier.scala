package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * through this interface documents can provide access to their substorages
  *
  * A temporary interface to get access to documents substorages.
  */
trait XDocumentSubStorageSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  val DocumentSubStoragesNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * provides the access to a substorage with specified name
    * @param StorageName the name of requested substorage
    * @param nMode a mode the storage should be opened in can take value from {@link com.sun.star.embed.ElementModes}
    * @returns XStorage implementation that refers to specified substorage
    */
  def getDocumentSubStorage(StorageName: java.lang.String, nMode: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  def getDocumentSubStoragesNames(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XDocumentSubStorageSupplier {
  @scala.inline
  def apply(
    DocumentSubStoragesNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getDocumentSubStorage: js.Function2[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
    ],
    getDocumentSubStoragesNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDocumentSubStorageSupplier = {
    val __obj = js.Dynamic.literal(DocumentSubStoragesNames = DocumentSubStoragesNames, acquire = acquire, getDocumentSubStorage = getDocumentSubStorage, getDocumentSubStoragesNames = getDocumentSubStoragesNames, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDocumentSubStorageSupplier]
  }
}

