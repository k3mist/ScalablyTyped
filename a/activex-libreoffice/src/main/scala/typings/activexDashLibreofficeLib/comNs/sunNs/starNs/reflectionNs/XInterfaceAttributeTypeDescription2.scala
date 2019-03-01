package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an interface attribute, supporting extended attributes that are bound or raise exceptions.
  *
  * This type supersedes {@link XInterfaceAttributeTypeDescription} , which does not support extended attributes.
  * @since OOo 2.0
  */
trait XInterfaceAttributeTypeDescription2 extends XInterfaceAttributeTypeDescription {
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  val GetExceptions: activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  val SetExceptions: activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  def getGetExceptions(): activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  def getSetExceptions(): activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns whether this object reflects a bound attribute.
    * @returns `TRUE` iff this object reflects a bound attribute
    */
  def isBound(): scala.Boolean
}

object XInterfaceAttributeTypeDescription2 {
  @scala.inline
  def apply(
    GetExceptions: activexDashInteropLib.SafeArray[XCompoundTypeDescription],
    MemberName: java.lang.String,
    Name: java.lang.String,
    Position: scala.Double,
    SetExceptions: activexDashInteropLib.SafeArray[XCompoundTypeDescription],
    Type: XTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getGetExceptions: js.Function0[activexDashInteropLib.SafeArray[XCompoundTypeDescription]],
    getMemberName: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[scala.Double],
    getSetExceptions: js.Function0[activexDashInteropLib.SafeArray[XCompoundTypeDescription]],
    getType: js.Function0[XTypeDescription],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    isBound: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInterfaceAttributeTypeDescription2 = {
    val __obj = js.Dynamic.literal(GetExceptions = GetExceptions, MemberName = MemberName, Name = Name, Position = Position, SetExceptions = SetExceptions, Type = Type, TypeClass = TypeClass, acquire = acquire, getGetExceptions = getGetExceptions, getMemberName = getMemberName, getName = getName, getPosition = getPosition, getSetExceptions = getSetExceptions, getType = getType, getTypeClass = getTypeClass, isBound = isBound, isReadOnly = isReadOnly, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription2]
  }
}

