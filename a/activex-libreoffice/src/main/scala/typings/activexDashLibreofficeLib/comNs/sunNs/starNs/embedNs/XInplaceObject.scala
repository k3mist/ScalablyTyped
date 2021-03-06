package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for inplace embedded objects. */
trait XInplaceObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * enables or disables modeless dialogs of the object.
    *
    * In case container wants to show a modal dialog it should disable modeless of embedded object dialogs with this call. Later the same call can be used
    * to enable it.
    * @param bEnable `TRUE` to enable object modeless `FALSE` to disable it
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def enableModeless(bEnable: scala.Boolean): scala.Unit
  /**
    * sets the visible part of the inplace object.
    *
    * Both rectangles are provided in object's parent window coordinates in pixels. The intersection of rectangles specifies the visible part of the object.
    * In case the position window has a size that is different from object's visual area size, the object should either scale or deactivate.
    *
    * The method must activate object repainting.
    * @param aPosRect specifies a new position rectangle
    * @param aClipRect specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in invalid state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def setObjectRectangles(
    aPosRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    aClipRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  ): scala.Unit
  /**
    * provides accelerator table the container wants to use during inplace editing.
    * @returns an accelerator table from container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def translateAccelerators(
    aKeys: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
  ): scala.Unit
}

object XInplaceObject {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    enableModeless: scala.Boolean => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setObjectRectangles: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle) => scala.Unit,
    translateAccelerators: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent] => scala.Unit
  ): XInplaceObject = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), enableModeless = js.Any.fromFunction1(enableModeless), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setObjectRectangles = js.Any.fromFunction2(setObjectRectangles), translateAccelerators = js.Any.fromFunction1(translateAccelerators))
  
    __obj.asInstanceOf[XInplaceObject]
  }
}

