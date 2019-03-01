package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give access to a single numerical value.
  *
  * The {@link XAccessibleValue} interface represents a single numerical value and should be implemented by any class that supports numerical value like
  * scroll bars and spin boxes. This interface lets you access the value and its upper and lower bounds.
  * @since OOo 1.1.2
  */
trait XAccessibleValue
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the value of this object as a number.
    *
    * The exact return type is implementation dependent. Typical types are long and double.
    * @returns Returns the current value represented by this object.
    */
  var CurrentValue: js.Any
  /**
    * Returns the maximal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the maximal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  val MaximumValue: js.Any
  /**
    * Returns the minimal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the minimal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  val MinimumValue: js.Any
  /**
    * Returns the value of this object as a number.
    *
    * The exact return type is implementation dependent. Typical types are long and double.
    * @returns Returns the current value represented by this object.
    */
  def getCurrentValue(): js.Any
  /**
    * Returns the maximal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the maximal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  def getMaximumValue(): js.Any
  /**
    * Returns the minimal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the minimal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  def getMinimumValue(): js.Any
  /**
    * Sets the value of this object to the given number.
    *
    * The argument is clipped to the valid interval whose upper and lower bounds are returned by the methods getMaximumAccessibleValue() and
    * getMinimumAccessibleValue(), i.e. if it is lower than the minimum value the new value will be the minimum and if it is greater than the maximum then
    * the new value will be the maximum.
    * @param aNumber The new value represented by this object. The set of admissible types for this argument is implementation dependent.
    * @returns Returns `TRUE` if the new value could successfully be set and `FALSE` otherwise.
    */
  def setCurrentValue(aNumber: js.Any): scala.Boolean
}

object XAccessibleValue {
  @scala.inline
  def apply(
    CurrentValue: js.Any,
    MaximumValue: js.Any,
    MinimumValue: js.Any,
    acquire: js.Function0[scala.Unit],
    getCurrentValue: js.Function0[js.Any],
    getMaximumValue: js.Function0[js.Any],
    getMinimumValue: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCurrentValue: js.Function1[js.Any, scala.Boolean]
  ): XAccessibleValue = {
    val __obj = js.Dynamic.literal(CurrentValue = CurrentValue, MaximumValue = MaximumValue, MinimumValue = MinimumValue, acquire = acquire, getCurrentValue = getCurrentValue, getMaximumValue = getMaximumValue, getMinimumValue = getMinimumValue, queryInterface = queryInterface, release = release, setCurrentValue = setCurrentValue)
  
    __obj.asInstanceOf[XAccessibleValue]
  }
}

