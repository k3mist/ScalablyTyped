package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The implementation of an output stream and an input stream.
  *
  * All data written through the outputstream is buffered until it is read again from the input stream. Often two different threads access input and
  * outputstream.
  *
  * With the pipe-service, an outputstream can be converted into an input stream at the cost of an additional buffer.
  * @since LibreOffice 4.0
  */
trait XPipe
  extends XOutputStream
     with XInputStream

object XPipe {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    closeInput: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readSomeBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    release: js.Function0[scala.Unit],
    skipBytes: js.Function1[scala.Double, scala.Unit],
    writeBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): XPipe = {
    val __obj = js.Dynamic.literal(acquire = acquire, available = available, closeInput = closeInput, closeOutput = closeOutput, flush = flush, queryInterface = queryInterface, readBytes = readBytes, readSomeBytes = readSomeBytes, release = release, skipBytes = skipBytes, writeBytes = writeBytes)
  
    __obj.asInstanceOf[XPipe]
  }
}

