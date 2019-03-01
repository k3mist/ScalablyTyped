package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * stores {@link XPersistObject} implementations into the stream
  *
  * An implementation of the type {@link XPersistObject} uses this interface to write its internal state into a stream. Have a look there for the
  * explanation of the concept.
  * @see com.sun.star.io.XPersistObject
  */
trait XObjectOutputStream extends XDataOutputStream {
  /**
    * writes an object to the stream.
    * @param Object the object, which shall serialize itself into the stream.
    */
  def writeObject(Object: XPersistObject): scala.Unit
}

object XObjectOutputStream {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    writeBoolean: js.Function1[scala.Boolean, scala.Unit],
    writeByte: js.Function1[scala.Double, scala.Unit],
    writeBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    writeChar: js.Function1[java.lang.String, scala.Unit],
    writeDouble: js.Function1[scala.Double, scala.Unit],
    writeFloat: js.Function1[scala.Double, scala.Unit],
    writeHyper: js.Function1[scala.Double, scala.Unit],
    writeLong: js.Function1[scala.Double, scala.Unit],
    writeObject: js.Function1[XPersistObject, scala.Unit],
    writeShort: js.Function1[scala.Double, scala.Unit],
    writeUTF: js.Function1[java.lang.String, scala.Unit]
  ): XObjectOutputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire, closeOutput = closeOutput, flush = flush, queryInterface = queryInterface, release = release, writeBoolean = writeBoolean, writeByte = writeByte, writeBytes = writeBytes, writeChar = writeChar, writeDouble = writeDouble, writeFloat = writeFloat, writeHyper = writeHyper, writeLong = writeLong, writeObject = writeObject, writeShort = writeShort, writeUTF = writeUTF)
  
    __obj.asInstanceOf[XObjectOutputStream]
  }
}

