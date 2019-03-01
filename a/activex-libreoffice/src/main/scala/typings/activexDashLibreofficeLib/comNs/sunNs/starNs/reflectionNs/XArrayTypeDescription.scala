package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated, UNOIDL does not have an array concept.
  * @deprecated Deprecated
  */
trait XArrayTypeDescription extends XTypeDescription {
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  val Dimensions: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  val NumberOfDimensions: scala.Double
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  val Type: XTypeDescription
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  def getDimensions(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  def getNumberOfDimensions(): scala.Double
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  def getType(): XTypeDescription
}

object XArrayTypeDescription {
  @scala.inline
  def apply(
    Dimensions: activexDashInteropLib.SafeArray[scala.Double],
    Name: java.lang.String,
    NumberOfDimensions: scala.Double,
    Type: XTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getDimensions: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getName: js.Function0[java.lang.String],
    getNumberOfDimensions: js.Function0[scala.Double],
    getType: js.Function0[XTypeDescription],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XArrayTypeDescription = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions, Name = Name, NumberOfDimensions = NumberOfDimensions, Type = Type, TypeClass = TypeClass, acquire = acquire, getDimensions = getDimensions, getName = getName, getNumberOfDimensions = getNumberOfDimensions, getType = getType, getTypeClass = getTypeClass, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XArrayTypeDescription]
  }
}

