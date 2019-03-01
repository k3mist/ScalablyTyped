package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * occurs in case of fired database exceptions triggered by a database form.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait ErrorEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  var Reason: js.Any
}

object ErrorEvent {
  @scala.inline
  def apply(Reason: js.Any, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): ErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason, Source = Source)
  
    __obj.asInstanceOf[ErrorEvent]
  }
}

