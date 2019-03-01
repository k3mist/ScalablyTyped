package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the print progress of an {@link XPrintJob} .
  *
  * {@link com.sun.star.lang.EventObject.Source} contains the {@link XPrintJob} having changed its state
  *
  * .
  * @since OOo 1.1.2
  */
trait PrintJobEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  var State: PrintableState
}

object PrintJobEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, State: PrintableState): PrintJobEvent = {
    val __obj = js.Dynamic.literal(Source = Source, State = State)
  
    __obj.asInstanceOf[PrintJobEvent]
  }
}

