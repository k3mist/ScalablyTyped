package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XContextChangeEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  def notifyContextChangeEvent(event: ContextChangeEventObject): scala.Unit
}

object XContextChangeEventListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    notifyContextChangeEvent: js.Function1[ContextChangeEventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContextChangeEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, notifyContextChangeEvent = notifyContextChangeEvent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XContextChangeEventListener]
  }
}

