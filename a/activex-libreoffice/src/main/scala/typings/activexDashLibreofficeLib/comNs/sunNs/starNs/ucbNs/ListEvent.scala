package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of event fired by an {@link XDynamicResultSet} */
trait ListEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * If you apply the given ListActions one after the other to the old version of an result set in given order, you will get the positions in the new
    * version.
    */
  var Changes: activexDashInteropLib.SafeArray[ListAction]
}

object ListEvent {
  @scala.inline
  def apply(
    Changes: activexDashInteropLib.SafeArray[ListAction],
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): ListEvent = {
    val __obj = js.Dynamic.literal(Changes = Changes, Source = Source)
  
    __obj.asInstanceOf[ListEvent]
  }
}

