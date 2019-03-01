package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information reflecting an UNO type. */
trait XIdlClass[T]
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * If the reflected type is an array, then you get a {@link XIdlArray} interface to modify instances of the array type. ;  If the reflected type is not
    * an array, then a null-reference is returned.
    * @returns interface to modify array instances (or null-reference)
    */
  val Array: XIdlArray
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  val Classes: activexDashInteropLib.SafeArray[XIdlClass[_]]
  /**
    * If the reflected type is an array or sequence, then this method returns a {@link XIdlClass} interface reflecting the element.
    * @returns reflection interface of the element type of an array or sequence type (null-reference otherwise).
    */
  val ComponentType: XIdlClass[_]
  /**
    * If the reflected type is an interface, struct or union, then you get a sequence of {@link XIdlField} interfaces reflecting all fields (/interface
    * attributes). This also includes all inherited fields (/interface attributes) of the interface, struct of union. ;  If the reflected type is not an
    * interface, struct or union or the interface, struct or union does not have any field (/interface attribute), then an empty sequence is returned.
    * @returns all field (/interface attribute) reflections (or empty sequence)
    */
  val Fields: activexDashInteropLib.SafeArray[XIdlField]
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  val Interfaces: activexDashInteropLib.SafeArray[XIdlClass[_]]
  /**
    * If the reflected type is an interface, then you get a sequence of {@link XIdlMethod} interfaces reflecting all methods of the interface. This also
    * includes the inherited methods of the interface. ;  If the reflected type is not an interface or the interface does not have any methods, then a
    * null-reference is returned.
    * @returns all method reflections (or empty sequence)
    */
  val Methods: activexDashInteropLib.SafeArray[XIdlMethod]
  /**
    * Returns the fully-qualified name of the reflected type.
    * @returns the fully-qualified name of the type
    */
  val Name: java.lang.String
  /**
    * If the reflected type is an interface, then the returned sequence of {@link XIdlClass} reflect the base interfaces. ;  If the reflected type is not an
    * interface or an interface that is not derived from another, then an empty sequence is returned.
    * @returns all base interfaces of an interface type or an empty sequence.
    */
  val Superclasses: activexDashInteropLib.SafeArray[XIdlClass[_]]
  /**
    * Returns the {@link com.sun.star.uno.TypeClass} of the reflected type.
    * @returns type class of the reflected type.
    */
  val TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  val Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik
  /**
    * This method creates instances of the reflected type.
    * @param obj pure out parameter to pass the created instance
    */
  def createObject(obj: js.Array[T]): scala.Unit
  /**
    * Tests whether two reflecting objects reflect the same type.
    * @returns true, if the objects reflect the same type, false otherwise.
    */
  def equals(Type: XIdlClass[_]): scala.Boolean
  /**
    * If the reflected type is an array, then you get a {@link XIdlArray} interface to modify instances of the array type. ;  If the reflected type is not
    * an array, then a null-reference is returned.
    * @returns interface to modify array instances (or null-reference)
    */
  def getArray(): XIdlArray
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getClass(aName: java.lang.String): XIdlClass[_]
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getClasses(): activexDashInteropLib.SafeArray[XIdlClass[_]]
  /**
    * If the reflected type is an array or sequence, then this method returns a {@link XIdlClass} interface reflecting the element.
    * @returns reflection interface of the element type of an array or sequence type (null-reference otherwise).
    */
  def getComponentType(): XIdlClass[_]
  /**
    * If the reflected type is an interface, struct or union, then you get a {@link XIdlField} interface reflecting the demanded field (/interface
    * attribute) by name. ;  If the reflected type is not an interface, struct or union or the interface, struct or union does not have a field (/interface
    * attribute) with the demanded name, then a null-reference is returned.
    * @param aName name of the demanded field reflection
    * @returns demanded field (/interface attribute) reflection (or null-reference)
    */
  def getField(aName: java.lang.String): XIdlField
  /**
    * If the reflected type is an interface, struct or union, then you get a sequence of {@link XIdlField} interfaces reflecting all fields (/interface
    * attributes). This also includes all inherited fields (/interface attributes) of the interface, struct of union. ;  If the reflected type is not an
    * interface, struct or union or the interface, struct or union does not have any field (/interface attribute), then an empty sequence is returned.
    * @returns all field (/interface attribute) reflections (or empty sequence)
    */
  def getFields(): activexDashInteropLib.SafeArray[XIdlField]
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getInterfaces(): activexDashInteropLib.SafeArray[XIdlClass[_]]
  /**
    * If the reflected type is an interface, then you get a {@link XIdlMethod} interface reflecting the demanded method by name. ;  If the reflected type is
    * not an interface or the interface does not have a method with the demanded name (including inherited methods), then a null-reference is returned.
    * @param aName name of demanded method reflection
    * @returns demanded method reflection (or null-reference)
    */
  def getMethod(aName: java.lang.String): XIdlMethod
  /**
    * If the reflected type is an interface, then you get a sequence of {@link XIdlMethod} interfaces reflecting all methods of the interface. This also
    * includes the inherited methods of the interface. ;  If the reflected type is not an interface or the interface does not have any methods, then a
    * null-reference is returned.
    * @returns all method reflections (or empty sequence)
    */
  def getMethods(): activexDashInteropLib.SafeArray[XIdlMethod]
  /**
    * Returns the fully-qualified name of the reflected type.
    * @returns the fully-qualified name of the type
    */
  def getName(): java.lang.String
  /**
    * If the reflected type is an interface, then the returned sequence of {@link XIdlClass} reflect the base interfaces. ;  If the reflected type is not an
    * interface or an interface that is not derived from another, then an empty sequence is returned.
    * @returns all base interfaces of an interface type or an empty sequence.
    */
  def getSuperclasses(): activexDashInteropLib.SafeArray[XIdlClass[_]]
  /**
    * Returns the {@link com.sun.star.uno.TypeClass} of the reflected type.
    * @returns type class of the reflected type.
    */
  def getTypeClass(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getUik(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik
  /**
    * Tests whether values of this reflected type are assignable from values of a second one ( `xType` ).
    * @param xType another reflected type
    * @returns true, if values of this reflected type are assignable from values of `xType` .
    */
  def isAssignableFrom(xType: XIdlClass[_]): scala.Boolean
}

object XIdlClass {
  @scala.inline
  def apply[T](
    Array: XIdlArray,
    Classes: activexDashInteropLib.SafeArray[XIdlClass[_]],
    ComponentType: XIdlClass[_],
    Fields: activexDashInteropLib.SafeArray[XIdlField],
    Interfaces: activexDashInteropLib.SafeArray[XIdlClass[_]],
    Methods: activexDashInteropLib.SafeArray[XIdlMethod],
    Name: java.lang.String,
    Superclasses: activexDashInteropLib.SafeArray[XIdlClass[_]],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik,
    acquire: js.Function0[scala.Unit],
    createObject: js.Function1[js.Array[T], scala.Unit],
    equals: js.Function1[XIdlClass[_], scala.Boolean],
    getArray: js.Function0[XIdlArray],
    getClass: js.Function1[java.lang.String, XIdlClass[_]],
    getClasses: js.Function0[activexDashInteropLib.SafeArray[XIdlClass[_]]],
    getComponentType: js.Function0[XIdlClass[_]],
    getField: js.Function1[java.lang.String, XIdlField],
    getFields: js.Function0[activexDashInteropLib.SafeArray[XIdlField]],
    getInterfaces: js.Function0[activexDashInteropLib.SafeArray[XIdlClass[_]]],
    getMethod: js.Function1[java.lang.String, XIdlMethod],
    getMethods: js.Function0[activexDashInteropLib.SafeArray[XIdlMethod]],
    getName: js.Function0[java.lang.String],
    getSuperclasses: js.Function0[activexDashInteropLib.SafeArray[XIdlClass[_]]],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    getUik: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik],
    isAssignableFrom: js.Function1[XIdlClass[_], scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIdlClass[T] = {
    val __obj = js.Dynamic.literal(Array = Array, Classes = Classes, ComponentType = ComponentType, Fields = Fields, Interfaces = Interfaces, Methods = Methods, Name = Name, Superclasses = Superclasses, TypeClass = TypeClass, Uik = Uik, acquire = acquire, createObject = createObject, equals = equals, getArray = getArray, getClass = getClass, getClasses = getClasses, getComponentType = getComponentType, getField = getField, getFields = getFields, getInterfaces = getInterfaces, getMethod = getMethod, getMethods = getMethods, getName = getName, getSuperclasses = getSuperclasses, getTypeClass = getTypeClass, getUik = getUik, isAssignableFrom = isAssignableFrom, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XIdlClass[T]]
  }
}

