package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to make UNO objects persistent
  *
  * Every UNO object, that wants to be serializable, should implement this interface. The object stores stores itself, when the write method is called.
  *
  * The object needs to be created before it deserializes itself again (by using the read method). Therefore it must be creatable by name via a factory,
  * which is in general the global service manager. The create and read mechanism is implemented by the {@link com.sun.star.io.ObjectInputStream} .
  *
  * The serialization format (the series of strings, integers, objects) must be specified at the specification of the concrete service.
  *
  * The interface does not support any special versioning mechanism.
  * @see com.sun.star.io.XObjectOutputStream
  * @see com.sun.star.io.XObjectInputStream
  */
trait XPersistObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gives the service name of the object
    *
    * This name is used to create such an object by a factory during deserialization.
    * @returns the service name that specifies the behavior and the persistent data format of this implementation.
    * @see com.sun.star.lang.XMultiComponentFactory.getAvailableServiceNames()
    */
  val ServiceName: java.lang.String
  /**
    * gives the service name of the object
    *
    * This name is used to create such an object by a factory during deserialization.
    * @returns the service name that specifies the behavior and the persistent data format of this implementation.
    * @see com.sun.star.lang.XMultiComponentFactory.getAvailableServiceNames()
    */
  def getServiceName(): java.lang.String
  /**
    * reads all the persistent data of the object from the stream.
    *
    * In case other XPersistObjects are read from the stream, the implementation uses a factory to create these objects (in general the global service
    * manager).
    *
    * The implementation must read the data in the order documented at the service specification.
    * @param InStream the stream, the data shall be read from.
    */
  def read(InStream: XObjectInputStream): scala.Unit
  /**
    * writes all the persistent data of the object to the stream.
    *
    * The implementation must write the data in the order documented in the service specification.
    * @param OutStream the stream, the data shall be written to. The stream supports simple types and other {@link XPersistObject} implementations.
    */
  def write(OutStream: XObjectOutputStream): scala.Unit
}

object XPersistObject {
  @scala.inline
  def apply(
    ServiceName: java.lang.String,
    acquire: () => scala.Unit,
    getServiceName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    read: XObjectInputStream => scala.Unit,
    release: () => scala.Unit,
    write: XObjectOutputStream => scala.Unit
  ): XPersistObject = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName, acquire = js.Any.fromFunction0(acquire), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[XPersistObject]
  }
}

