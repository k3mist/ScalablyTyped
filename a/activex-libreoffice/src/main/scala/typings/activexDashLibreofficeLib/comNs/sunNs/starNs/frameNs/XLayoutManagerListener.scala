package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from a layout manager.
  *
  * Events are provided **only** for notification purposes only. All operations are handled internally by the layout manager component, so that GUI layout
  * works properly regardless of whether a component registers such a listener or not.
  * @see com.sun.star.frame.LayoutManager
  * @see com.sun.star.frame.LayoutManagerEvents
  * @since OOo 2.0
  */
trait XLayoutManagerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a layout manager has made a certain operation.
    * @param aSource reference to the layout manager which invoked the event.
    * @param eLayoutEvent identifies the layout event that has occurred.
    * @param aInfo provides additional information about the event. The type of info depends on the event.
    */
  def layoutEvent(
    aSource: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject,
    eLayoutEvent: scala.Double,
    aInfo: js.Any
  ): scala.Unit
}

object XLayoutManagerListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    layoutEvent: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, 
      scala.Double, 
      js.Any, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLayoutManagerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, layoutEvent = layoutEvent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLayoutManagerListener]
  }
}

