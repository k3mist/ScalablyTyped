package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service connects the Java-like UNO drag and drop protocol to the protocol used on window platforms. It realized the drag source.
  * @see XDragSource
  */
trait OleDragSource
  extends XDragSource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object OleDragSource {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    getDefaultCursor: scala.Double => scala.Double,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    isDragImageSupported: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    startDrag: (DragGestureEvent, scala.Double, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, XDragSourceListener) => scala.Unit
  ): OleDragSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getDefaultCursor = js.Any.fromFunction1(getDefaultCursor), initialize = js.Any.fromFunction1(initialize), isDragImageSupported = js.Any.fromFunction0(isDragImageSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), startDrag = js.Any.fromFunction6(startDrag))
  
    __obj.asInstanceOf[OleDragSource]
  }
}

