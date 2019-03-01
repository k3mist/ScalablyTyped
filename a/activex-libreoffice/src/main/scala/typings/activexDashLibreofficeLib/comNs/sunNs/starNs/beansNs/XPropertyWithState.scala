package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to query information about the state of this object, seen as a property contained in a property set.
  *
  * This interface provides direct access to operations that are available if the containing property set implements {@link XPropertyState} .
  *
  * The state contains the information if:
  *
  * a value is available or voidthe value is stored in the object itself, or if a default value is being usedor if the value cannot be determined, due to
  * ambiguity (multi selection with multiple values).
  *
  * Generally objects that implement this interface also implement {@link XProperty} .
  */
trait XPropertyWithState
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns an object representing the default state of this object (as a property).  If no default exists, is not known or is void, then the return value is
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  val DefaultAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** @returns the state of this as a property. */
  val StateAsProperty: PropertyState
  /**
    * @returns an object representing the default state of this object (as a property).  If no default exists, is not known or is void, then the return value is
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getDefaultAsProperty(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** @returns the state of this as a property. */
  def getStateAsProperty(): PropertyState
  /**
    * sets this to its default value.
    *
    * The value depends on the implementation of this interface. If this is a bound property, the value changes before the change events are fired. If this
    * is a constrained property, the vetoable event is fired before the property value changes.
    * @@throws com::sun::star::lang::WrappedTargetException    if the implementation has an internal reason for the exception.      In this case the original ex
    */
  def setToDefaultAsProperty(): scala.Unit
}

object XPropertyWithState {
  @scala.inline
  def apply(
    DefaultAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    StateAsProperty: PropertyState,
    acquire: js.Function0[scala.Unit],
    getDefaultAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getStateAsProperty: js.Function0[PropertyState],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setToDefaultAsProperty: js.Function0[scala.Unit]
  ): XPropertyWithState = {
    val __obj = js.Dynamic.literal(DefaultAsProperty = DefaultAsProperty, StateAsProperty = StateAsProperty, acquire = acquire, getDefaultAsProperty = getDefaultAsProperty, getStateAsProperty = getStateAsProperty, queryInterface = queryInterface, release = release, setToDefaultAsProperty = setToDefaultAsProperty)
  
    __obj.asInstanceOf[XPropertyWithState]
  }
}

