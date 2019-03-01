package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to convert file system folder tree in to a package. */
trait XPackageStructureCreator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * converts file system folder tree in to a package.
    * @param sFolderURL the URL of folder that must be converted, the URL must be in format accepted by UCB
    * @param xTargetStream the result package will be written into this stream
    * @throws com::sun::star::io::IOException in case any problem on reading/writing appears
    */
  def convertToPackage(
    sFolderURL: java.lang.String,
    xTargetStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream
  ): scala.Unit
}

object XPackageStructureCreator {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    convertToPackage: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPackageStructureCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire, convertToPackage = convertToPackage, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPackageStructureCreator]
  }
}

