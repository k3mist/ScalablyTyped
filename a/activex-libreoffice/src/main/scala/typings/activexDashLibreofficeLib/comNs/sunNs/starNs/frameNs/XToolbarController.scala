package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an abstract service for a component which offers a more complex user interface to users within a toolbar.
  *
  * A generic toolbar function is represented as a button which has a state (enabled,disabled and selected, not selected). A toolbar controller can be
  * added to a toolbar and provide information or functions with a more sophisticated user interface. ;  A typical example for toolbar controller is a
  * font chooser on a toolbar. It provides all available fonts in a dropdown box and shows the current chosen font.
  * @see com.sun.star.frame.XDispatchProvider
  * @since OOo 2.0
  */
trait XToolbarController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** notifies a component that a single click has been made on the toolbar item. */
  def click(): scala.Unit
  /**
    * requests to create an item window which can be added to the toolbar.
    * @param Parent a {@link com.sun.star.awt.XWindow} which must be used as a parent for the requested item window.
    * @returns a {@link com.sun.star.awt.XWindow} which can be added to a toolbar. The reference must be empty if a component does not want to provide an item w
    */
  def createItemWindow(Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * requests to create a pop-up window for additional functions.
    * @returns a {@link com.sun.star.awt.XWindow} which provides additional functions to the user. The reference must be empty if component does not want to pro
    */
  def createPopupWindow(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /** notifies a component that a double click has been made on the toolbar item. */
  def doubleClick(): scala.Unit
  /**
    * provides a function to execute the command which is bound to the toolbar controller.
    * @param KeyModifier a combination of {@link com.sun.star.awt.KeyModifier} value that represent the current state of the modifier keys.  This function is
    */
  def execute(KeyModifier: scala.Double): scala.Unit
}

object XToolbarController {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    click: () => scala.Unit,
    createItemWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    createPopupWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    doubleClick: () => scala.Unit,
    execute: scala.Double => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XToolbarController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), click = js.Any.fromFunction0(click), createItemWindow = js.Any.fromFunction1(createItemWindow), createPopupWindow = js.Any.fromFunction0(createPopupWindow), doubleClick = js.Any.fromFunction0(doubleClick), execute = js.Any.fromFunction1(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XToolbarController]
  }
}

