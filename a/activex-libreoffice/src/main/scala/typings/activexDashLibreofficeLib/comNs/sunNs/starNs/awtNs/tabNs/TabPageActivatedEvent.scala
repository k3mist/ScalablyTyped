package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XTabPageContainer} to notify changes in tab page activation.
  * @since OOo 3.4
  */
trait TabPageActivatedEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** Contains the ID of the tab page */
  var TabPageID: scala.Double
}

object TabPageActivatedEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, TabPageID: scala.Double): TabPageActivatedEvent = {
    val __obj = js.Dynamic.literal(Source = Source, TabPageID = TabPageID)
  
    __obj.asInstanceOf[TabPageActivatedEvent]
  }
}

