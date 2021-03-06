package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for inplace clients. */
trait XInplaceClient
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets the inplace object clip rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object.
    * @returns specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val ClipRectangle: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * allows to retrieve the container's dispatch provider.
    * @returns reference to object implementing the {@link com.sun.star.frame.XDispatchProvider}
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val InplaceDispatchProvider: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProvider
  /**
    * allows to retrieve the {@link com.sun.star.frame.LayoutManager} of the container.
    * @returns reference to object representing the {@link com.sun.star.frame.LayoutManager} of the container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val LayoutManager: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XLayoutManager
  /**
    * gets the inplace object position rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object. In case the position window has a size that is bigger than object's size, the object should either scale or deactivate.
    * @returns specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val Placement: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * notifies container through the client that the object is to be inplace activated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for activation
    */
  def activatingInplace(): scala.Unit
  /**
    * notifies container through the client that the object is to be UI-activated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for activation
    */
  def activatingUI(): scala.Unit
  /**
    * checks if the container can activate the object inplace.
    * @returns `TRUE` the container can activate the object inplace. `FALSE` otherwise.
    */
  def canInplaceActivate(): scala.Boolean
  /**
    * notifies the container that the position of the object is changed.
    * @param aPosRect specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object state is not correct
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def changedPlacement(aPosRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): scala.Unit
  /**
    * notifies container through the client that the object is deactivated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for deactivation
    */
  def deactivatedInplace(): scala.Unit
  /**
    * notifies container through the client that the object is UI-deactivated.
    *
    * After this notification the container can restore it's own UI and take focus.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for deactivation
    */
  def deactivatedUI(): scala.Unit
  /**
    * gets the inplace object clip rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object.
    * @returns specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getClipRectangle(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * allows to retrieve the container's dispatch provider.
    * @returns reference to object implementing the {@link com.sun.star.frame.XDispatchProvider}
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getInplaceDispatchProvider(): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProvider
  /**
    * allows to retrieve the {@link com.sun.star.frame.LayoutManager} of the container.
    * @returns reference to object representing the {@link com.sun.star.frame.LayoutManager} of the container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getLayoutManager(): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XLayoutManager
  /**
    * gets the inplace object position rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object. In case the position window has a size that is bigger than object's size, the object should either scale or deactivate.
    * @returns specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getPlacement(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * scrolls the object.
    * @param aOffset scrolls the object to specified offset in pixels
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def scrollObject(aOffset: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size): scala.Unit
  /**
    * provides accelerator table the object wants to use while it is inplace active.
    * @param aKeys an accelerator table from object
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def translateAccelerators(
    aKeys: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
  ): scala.Unit
}

object XInplaceClient {
  @scala.inline
  def apply(
    ClipRectangle: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    InplaceDispatchProvider: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProvider,
    LayoutManager: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XLayoutManager,
    Placement: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    acquire: () => scala.Unit,
    activatingInplace: () => scala.Unit,
    activatingUI: () => scala.Unit,
    canInplaceActivate: () => scala.Boolean,
    changedPlacement: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    deactivatedInplace: () => scala.Unit,
    deactivatedUI: () => scala.Unit,
    getClipRectangle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getInplaceDispatchProvider: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProvider,
    getLayoutManager: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XLayoutManager,
    getPlacement: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    scrollObject: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size => scala.Unit,
    translateAccelerators: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent] => scala.Unit
  ): XInplaceClient = {
    val __obj = js.Dynamic.literal(ClipRectangle = ClipRectangle, InplaceDispatchProvider = InplaceDispatchProvider, LayoutManager = LayoutManager, Placement = Placement, acquire = js.Any.fromFunction0(acquire), activatingInplace = js.Any.fromFunction0(activatingInplace), activatingUI = js.Any.fromFunction0(activatingUI), canInplaceActivate = js.Any.fromFunction0(canInplaceActivate), changedPlacement = js.Any.fromFunction1(changedPlacement), deactivatedInplace = js.Any.fromFunction0(deactivatedInplace), deactivatedUI = js.Any.fromFunction0(deactivatedUI), getClipRectangle = js.Any.fromFunction0(getClipRectangle), getInplaceDispatchProvider = js.Any.fromFunction0(getInplaceDispatchProvider), getLayoutManager = js.Any.fromFunction0(getLayoutManager), getPlacement = js.Any.fromFunction0(getPlacement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), scrollObject = js.Any.fromFunction1(scrollObject), translateAccelerators = js.Any.fromFunction1(translateAccelerators))
  
    __obj.asInstanceOf[XInplaceClient]
  }
}

