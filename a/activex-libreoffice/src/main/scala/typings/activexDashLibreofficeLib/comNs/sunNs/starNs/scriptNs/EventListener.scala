package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListener extends js.Object {
  var AddListenerParam: java.lang.String
  var AllListener: XAllListener
  var EventMethod: java.lang.String
  var Helper: js.Any
  var ListenerType: java.lang.String
}

object EventListener {
  @scala.inline
  def apply(
    AddListenerParam: java.lang.String,
    AllListener: XAllListener,
    EventMethod: java.lang.String,
    Helper: js.Any,
    ListenerType: java.lang.String
  ): EventListener = {
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam, AllListener = AllListener, EventMethod = EventMethod, Helper = Helper, ListenerType = ListenerType)
  
    __obj.asInstanceOf[EventListener]
  }
}

