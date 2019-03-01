package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stream which allows writing the data of persistent objects.
  *
  * Implementations of this service must fulfill the specifications of the {@link DataOutputStream} service; furthermore, the stream needs to be chained
  * to a {@link XMarkableStream} . Therefore, it also provides the {@link XMarkableStream} interface, but it delegates the calls to the chained object.
  * The written objects are held until this instance is destroyed. The references to the objects are written as four-byte integers and begin at 1. Data
  * format is written:
  *
  * `; short   InfoLength; long    ObjectReference // 0 indicates no object; UTF     ServiceName     // length of 0 indicates this is only a reference;
  * long    ObjectLength    // 0 if it is a reference or no object, otherwise the len of the object data; Object  ObjectData      // the data of the
  * object; `
  */
trait ObjectOutputStream
  extends XObjectOutputStream
     with XActiveDataSource
     with XConnectable

object ObjectOutputStream {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getOutputStream: js.Function0[XOutputStream],
    getPredecessor: js.Function0[XConnectable],
    getSuccessor: js.Function0[XConnectable],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setOutputStream: js.Function1[XOutputStream, scala.Unit],
    setPredecessor: js.Function1[XConnectable, scala.Unit],
    setSuccessor: js.Function1[XConnectable, scala.Unit],
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
  ): ObjectOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, Predecessor = Predecessor, Successor = Successor, acquire = acquire, closeOutput = closeOutput, flush = flush, getOutputStream = getOutputStream, getPredecessor = getPredecessor, getSuccessor = getSuccessor, queryInterface = queryInterface, release = release, setOutputStream = setOutputStream, setPredecessor = setPredecessor, setSuccessor = setSuccessor, writeBoolean = writeBoolean, writeByte = writeByte, writeBytes = writeBytes, writeChar = writeChar, writeDouble = writeDouble, writeFloat = writeFloat, writeHyper = writeHyper, writeLong = writeLong, writeObject = writeObject, writeShort = writeShort, writeUTF = writeUTF)
  
    __obj.asInstanceOf[ObjectOutputStream]
  }
}

