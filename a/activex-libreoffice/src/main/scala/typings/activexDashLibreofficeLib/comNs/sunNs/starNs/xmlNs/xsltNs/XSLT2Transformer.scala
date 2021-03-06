package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xsltNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get XSLT filter transformer supporting XSLT 2.0.
  * @since LibreOffice 4.0
  */
trait XSLT2Transformer extends XXSLTTransformer {
  def create(args: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Unit
}

object XSLT2Transformer {
  @scala.inline
  def apply(
    InputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    OutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    acquire: () => scala.Unit,
    addListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener => scala.Unit,
    create: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    getInputStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getOutputStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener => scala.Unit,
    setInputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream => scala.Unit,
    setOutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream => scala.Unit,
    start: () => scala.Unit,
    terminate: () => scala.Unit
  ): XSLT2Transformer = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), create = js.Any.fromFunction1(create), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
  
    __obj.asInstanceOf[XSLT2Transformer]
  }
}

