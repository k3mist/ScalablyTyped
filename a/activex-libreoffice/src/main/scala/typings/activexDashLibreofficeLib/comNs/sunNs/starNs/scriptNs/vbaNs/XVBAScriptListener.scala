package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVBAScriptListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  def notifyVBAScriptEvent(Event: VBAScriptEvent): scala.Unit
}

object XVBAScriptListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    notifyVBAScriptEvent: js.Function1[VBAScriptEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XVBAScriptListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, notifyVBAScriptEvent = notifyVBAScriptEvent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XVBAScriptListener]
  }
}

