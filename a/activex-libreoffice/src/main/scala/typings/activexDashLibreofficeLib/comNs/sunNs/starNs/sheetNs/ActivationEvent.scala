package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a change of the active sheet. The new active sheet is given with this event.
  * @since OOo 2.0
  */
trait ActivationEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies the new active {@link Spreadsheet} . */
  var ActiveSheet: XSpreadsheet
}

object ActivationEvent {
  @scala.inline
  def apply(ActiveSheet: XSpreadsheet, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): ActivationEvent = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet, Source = Source)
  
    __obj.asInstanceOf[ActivationEvent]
  }
}

