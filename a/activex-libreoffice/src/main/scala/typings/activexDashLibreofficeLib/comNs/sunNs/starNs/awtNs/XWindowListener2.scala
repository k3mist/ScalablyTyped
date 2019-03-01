package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows receive window-related events, additional to the ones received by an {@link XWindowListener} */
trait XWindowListener2 extends XWindowListener {
  /** is called when the window has been disabled. */
  def windowDisabled(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is called when the window has been enabled. */
  def windowEnabled(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XWindowListener2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    windowDisabled: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    windowEnabled: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    windowHidden: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    windowMoved: js.Function1[WindowEvent, scala.Unit],
    windowResized: js.Function1[WindowEvent, scala.Unit],
    windowShown: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XWindowListener2 = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, windowDisabled = windowDisabled, windowEnabled = windowEnabled, windowHidden = windowHidden, windowMoved = windowMoved, windowResized = windowResized, windowShown = windowShown)
  
    __obj.asInstanceOf[XWindowListener2]
  }
}

