package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the basic interface to write data to a stream.
  *
  * See the [streaming document]{@link url="http://udk.openoffice.org/common/man/concept/streams.html"} for further information on chaining and piping
  * streams.
  */
trait XOutputStream
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets called to indicate that all data has been written.
    *
    * If this method has not yet been called, no attached {@link XInputStream} receives an EOF signal. No further bytes may be written after this method has
    * been called.
    */
  def closeOutput(): scala.Unit
  /**
    * flushes out of the stream any data that may exist in buffers.
    *
    * The semantics of this method are rather vague. See {@link com.sun.star.io.XAsyncOutputMonitor.waitForCompletion()} for a similar method with very
    * specific semantics, that is useful in certain scenarios.
    */
  def flush(): scala.Unit
  /** writes the whole sequence to the stream. (blocking call) */
  def writeBytes(aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

object XOutputStream {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    closeOutput: () => scala.Unit,
    flush: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    writeBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit
  ): XOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBytes = js.Any.fromFunction1(writeBytes))
  
    __obj.asInstanceOf[XOutputStream]
  }
}

