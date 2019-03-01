package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events when an embedded object changes it's state. */
trait XStateChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called just before the object changes state.
    *
    * Actually the listener can try to complain about state changing, but it is up to object to decide whether the state change can be prevented. Anyway the
    * possibility to complain must be used very carefully.
    * @param aEvent specifies the object that is going to change own state
    * @param nOldState specifies the old state of the object
    * @param nNewState specifies the new state of the object
    * @throws com::sun::star::embed::WrongStateException the state change is unexpected by listener
    */
  def changingState(
    aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject,
    nOldState: scala.Double,
    nNewState: scala.Double
  ): scala.Unit
  /**
    * is called after the object has changed state.
    * @param aEvent specifies the object that has changed own state
    * @param nOldState specifies the old state of the object
    * @param nNewState specifies the new state of the object
    */
  def stateChanged(
    aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject,
    nOldState: scala.Double,
    nNewState: scala.Double
  ): scala.Unit
}

object XStateChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    changingState: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    stateChanged: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ]
  ): XStateChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, changingState = changingState, disposing = disposing, queryInterface = queryInterface, release = release, stateChanged = stateChanged)
  
    __obj.asInstanceOf[XStateChangeListener]
  }
}

