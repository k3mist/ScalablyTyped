package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main task of this service is to close an office document frame embedded in an application running in another process correctly.
  *
  * The usual usage of this service is to create it, initialize with document frame, and to dispose the service. While disposing the service will do all
  * the required actions to let the frame be closed using com::sun::star::util::XCloseable::close( true ). Thus in case there is a code that prevents
  * closing of the frame the code automatically becomes the owner of the frame.
  *
  * In addition the code will disconnect the VCL window the frame is based on from the container system window.
  */
trait DocumentCloser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * is used to initialize the object on it's creation.
    * @param xFrame the frame of the document that should be closed.
    */
  def DocumentCloserCtor1(xFrame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame): scala.Unit
}

object DocumentCloser {
  @scala.inline
  def apply(
    DocumentCloserCtor1: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, scala.Unit],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): DocumentCloser = {
    val __obj = js.Dynamic.literal(DocumentCloserCtor1 = DocumentCloserCtor1, acquire = acquire, addEventListener = addEventListener, dispose = dispose, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[DocumentCloser]
  }
}

