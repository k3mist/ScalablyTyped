package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a service, supporting single-interface  -  based services.
  *
  * This type supersedes {@link XServiceTypeDescription} , which only supports obsolete, accumulation-based services.
  * @since OOo 2.0
  */
trait XServiceTypeDescription2 extends XServiceTypeDescription {
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  val Constructors: activexDashInteropLib.SafeArray[XServiceConstructorDescription]
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  val Interface: XTypeDescription
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  def getConstructors(): activexDashInteropLib.SafeArray[XServiceConstructorDescription]
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  def getInterface(): XTypeDescription
  /**
    * Returns whether this object reflects a single-interface  -  based service.
    * @returns `TRUE` if this object reflects a single-interface  -  based service, and `FALSE` if this object reflects an obsolete, accumulation-based service
    */
  def isSingleInterfaceBased(): scala.Boolean
}

object XServiceTypeDescription2 {
  @scala.inline
  def apply(
    Constructors: activexDashInteropLib.SafeArray[XServiceConstructorDescription],
    Interface: XTypeDescription,
    MandatoryInterfaces: activexDashInteropLib.SafeArray[XInterfaceTypeDescription],
    MandatoryServices: activexDashInteropLib.SafeArray[XServiceTypeDescription],
    Name: java.lang.String,
    OptionalInterfaces: activexDashInteropLib.SafeArray[XInterfaceTypeDescription],
    OptionalServices: activexDashInteropLib.SafeArray[XServiceTypeDescription],
    Properties: activexDashInteropLib.SafeArray[XPropertyTypeDescription],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getConstructors: js.Function0[activexDashInteropLib.SafeArray[XServiceConstructorDescription]],
    getInterface: js.Function0[XTypeDescription],
    getMandatoryInterfaces: js.Function0[activexDashInteropLib.SafeArray[XInterfaceTypeDescription]],
    getMandatoryServices: js.Function0[activexDashInteropLib.SafeArray[XServiceTypeDescription]],
    getName: js.Function0[java.lang.String],
    getOptionalInterfaces: js.Function0[activexDashInteropLib.SafeArray[XInterfaceTypeDescription]],
    getOptionalServices: js.Function0[activexDashInteropLib.SafeArray[XServiceTypeDescription]],
    getProperties: js.Function0[activexDashInteropLib.SafeArray[XPropertyTypeDescription]],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    isSingleInterfaceBased: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XServiceTypeDescription2 = {
    val __obj = js.Dynamic.literal(Constructors = Constructors, Interface = Interface, MandatoryInterfaces = MandatoryInterfaces, MandatoryServices = MandatoryServices, Name = Name, OptionalInterfaces = OptionalInterfaces, OptionalServices = OptionalServices, Properties = Properties, TypeClass = TypeClass, acquire = acquire, getConstructors = getConstructors, getInterface = getInterface, getMandatoryInterfaces = getMandatoryInterfaces, getMandatoryServices = getMandatoryServices, getName = getName, getOptionalInterfaces = getOptionalInterfaces, getOptionalServices = getOptionalServices, getProperties = getProperties, getTypeClass = getTypeClass, isSingleInterfaceBased = isSingleInterfaceBased, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XServiceTypeDescription2]
  }
}

