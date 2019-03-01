package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read machine-independent simple data types from a stream.
  * @see com.sun.star.io.XDataOutputStream
  */
trait XDataInputStream extends XInputStream {
  /** reads in a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def readBoolean(): scala.Double
  /** reads an 8-bit byte. */
  def readByte(): scala.Double
  /** reads a 16-bit unicode character. */
  def readChar(): java.lang.String
  /** reads a 64-bit IEEE double. */
  def readDouble(): scala.Double
  /** reads a 32-bit IEEE float. */
  def readFloat(): scala.Double
  /** reads a 64-bit big endian integer. */
  def readHyper(): scala.Double
  /** reads a 32-bit big endian integer. */
  def readLong(): scala.Double
  /** reads a 16-bit big endian integer. */
  def readShort(): scala.Double
  /** reads a string of UTF encoded characters. */
  def readUTF(): java.lang.String
}

object XDataInputStream {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    closeInput: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readBoolean: js.Function0[scala.Double],
    readByte: js.Function0[scala.Double],
    readBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readChar: js.Function0[java.lang.String],
    readDouble: js.Function0[scala.Double],
    readFloat: js.Function0[scala.Double],
    readHyper: js.Function0[scala.Double],
    readLong: js.Function0[scala.Double],
    readShort: js.Function0[scala.Double],
    readSomeBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readUTF: js.Function0[java.lang.String],
    release: js.Function0[scala.Unit],
    skipBytes: js.Function1[scala.Double, scala.Unit]
  ): XDataInputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire, available = available, closeInput = closeInput, queryInterface = queryInterface, readBoolean = readBoolean, readByte = readByte, readBytes = readBytes, readChar = readChar, readDouble = readDouble, readFloat = readFloat, readHyper = readHyper, readLong = readLong, readShort = readShort, readSomeBytes = readSomeBytes, readUTF = readUTF, release = release, skipBytes = skipBytes)
  
    __obj.asInstanceOf[XDataInputStream]
  }
}

