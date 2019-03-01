package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access all property values and to set them at once.
  *
  * In most cases this interface will be in addition to {@link XPropertySet} . It is especially useful for remote communication because it lessens the
  * number of calls for getting property values; that is especially important because these calls are necessarily synchronous.
  *
  * Another advantage of this method is that conflicts are avoided if property value restrictions depend on the value of other properties.
  */
trait XPropertyAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a sequence of all property values within the object in a single call. */
  var PropertyValues: activexDashInteropLib.SafeArray[PropertyValue]
  /** @returns a sequence of all property values within the object in a single call. */
  def getPropertyValues(): activexDashInteropLib.SafeArray[PropertyValue]
  /**
    * sets the values of given properties.
    *
    * All properties which are not contained in the sequence **aProps** will be left unchanged.
    */
  def setPropertyValues(aProps: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyValue]): scala.Unit
}

object XPropertyAccess {
  @scala.inline
  def apply(
    PropertyValues: activexDashInteropLib.SafeArray[PropertyValue],
    acquire: js.Function0[scala.Unit],
    getPropertyValues: js.Function0[activexDashInteropLib.SafeArray[PropertyValue]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPropertyValues: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyValue], scala.Unit]
  ): XPropertyAccess = {
    val __obj = js.Dynamic.literal(PropertyValues = PropertyValues, acquire = acquire, getPropertyValues = getPropertyValues, queryInterface = queryInterface, release = release, setPropertyValues = setPropertyValues)
  
    __obj.asInstanceOf[XPropertyAccess]
  }
}

