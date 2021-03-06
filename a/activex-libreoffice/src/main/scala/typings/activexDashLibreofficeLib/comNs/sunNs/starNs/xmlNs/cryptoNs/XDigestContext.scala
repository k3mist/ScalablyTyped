package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to generate the digest.
  *
  * The algorithm to generate the digest is specified on object creation.
  * @see XDigestContextSupplier
  * @since OOo 3.4
  */
trait XDigestContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** finalizes digest and disposes context. */
  def finalizeDigestAndDispose(): stdLib.SafeArray[scala.Double]
  /**
    * update the digest with the given data.
    * @param aData data that should be used to update the digest
    */
  def updateDigest(aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

object XDigestContext {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    finalizeDigestAndDispose: () => stdLib.SafeArray[scala.Double],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    updateDigest: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit
  ): XDigestContext = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), finalizeDigestAndDispose = js.Any.fromFunction0(finalizeDigestAndDispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateDigest = js.Any.fromFunction1(updateDigest))
  
    __obj.asInstanceOf[XDigestContext]
  }
}

