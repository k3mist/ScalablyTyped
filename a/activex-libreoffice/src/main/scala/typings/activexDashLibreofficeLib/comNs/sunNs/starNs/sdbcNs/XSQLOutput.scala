package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used as an output stream for writing the attributes of a user-defined type back to the database. This interface, used only for custom mapping, is
  * used by the driver, and its methods are never directly invoked by a programmer.
  *
  * When an object of a class implementing interface {@link com.sun.star.sdbc.XSQLData} is passed as an argument to a SQL statement, the JDBC driver calls
  * com::sun::star::sdbc::SQLData::getSQLType() to determine the kind of SQL datum being passed to the database. ;  The driver then creates an instance of
  * `XSQLOutput` and passes it to the method {@link com.sun.star.sdbc.XSQLData.writeSQL()} . The method `writeSQL` in turn calls the appropriate
  * `XSQLOutput.writeXXX` methods to write data from the {@link com.sun.star.sdbc.XSQLData} object to the `XSQLOutput` output stream as the representation
  * of a SQL user-defined type.
  */
trait XSQLOutput
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * writes an array to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeArray(x: XArray): scala.Unit
  /**
    * writes the next attribute to the stream as a stream of uninterpreted bytes.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBinaryStream(x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
  /**
    * writes a BLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBlob(x: XBlob): scala.Unit
  /**
    * writes the next attribute to the stream as boolean.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBoolean(x: scala.Boolean): scala.Unit
  /**
    * writes the next attribute to the stream as byte.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeByte(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as byte sequence.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBytes(x: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * writes the next attribute to the stream as a stream of Unicode string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeCharacterStream(x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
  /**
    * writes a CLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeClob(x: XClob): scala.Unit
  /**
    * writes the next attribute to the stream as a date.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDate(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /**
    * writes the next attribute to the stream as double.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDouble(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as float.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeFloat(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as long.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeInt(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as hyper.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeLong(x: scala.Double): scala.Unit
  /**
    * writes to the stream the data contained in the given `XSQLData` object.
    *
    * When the `XSQLData` object is `NULL` , this method writes an SQL NULL to the stream. Otherwise, it calls the {@link
    * com.sun.star.sdbc.XSQLData.writeSQL()} method of the given object, which writes the object's attributes to the stream. The implementation of the
    * method `XSQLData::writeSQL()` calls the appropriate `XSQLOutput.writeXXX` method(s) for writing each of the object's attributes in order. ;  The
    * attributes must be read from an {@link com.sun.star.sdbc.XSQLInput} input stream and written to an `XSQLOutput` output stream in the same order in
    * which they were listed in the SQL definition of the user-defined type.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeObject(x: XSQLData): scala.Unit
  /**
    * writes a REF(&lt;structured-type&gt;) to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeRef(x: XRef): scala.Unit
  /**
    * writes the next attribute to the stream as short.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeShort(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as a string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeString(x: java.lang.String): scala.Unit
  /**
    * writes a structured-type to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeStruct(x: XStruct): scala.Unit
  /**
    * writes the next attribute to the stream as a time.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTime(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /**
    * writes the next attribute to the stream as a datetime.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTimestamp(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime): scala.Unit
}

object XSQLOutput {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    writeArray: XArray => scala.Unit,
    writeBinaryStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream => scala.Unit,
    writeBlob: XBlob => scala.Unit,
    writeBoolean: scala.Boolean => scala.Unit,
    writeByte: scala.Double => scala.Unit,
    writeBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    writeCharacterStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream => scala.Unit,
    writeClob: XClob => scala.Unit,
    writeDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date => scala.Unit,
    writeDouble: scala.Double => scala.Unit,
    writeFloat: scala.Double => scala.Unit,
    writeInt: scala.Double => scala.Unit,
    writeLong: scala.Double => scala.Unit,
    writeObject: XSQLData => scala.Unit,
    writeRef: XRef => scala.Unit,
    writeShort: scala.Double => scala.Unit,
    writeString: java.lang.String => scala.Unit,
    writeStruct: XStruct => scala.Unit,
    writeTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time => scala.Unit,
    writeTimestamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime => scala.Unit
  ): XSQLOutput = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeArray = js.Any.fromFunction1(writeArray), writeBinaryStream = js.Any.fromFunction1(writeBinaryStream), writeBlob = js.Any.fromFunction1(writeBlob), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeCharacterStream = js.Any.fromFunction1(writeCharacterStream), writeClob = js.Any.fromFunction1(writeClob), writeDate = js.Any.fromFunction1(writeDate), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeInt = js.Any.fromFunction1(writeInt), writeLong = js.Any.fromFunction1(writeLong), writeObject = js.Any.fromFunction1(writeObject), writeRef = js.Any.fromFunction1(writeRef), writeShort = js.Any.fromFunction1(writeShort), writeString = js.Any.fromFunction1(writeString), writeStruct = js.Any.fromFunction1(writeStruct), writeTime = js.Any.fromFunction1(writeTime), writeTimestamp = js.Any.fromFunction1(writeTimestamp))
  
    __obj.asInstanceOf[XSQLOutput]
  }
}

