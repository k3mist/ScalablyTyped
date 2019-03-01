package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * central interface to query for, create, destroy and manipulate user interface elements which are bound to a layout manager.
  *
  * Every user interface element which is controlled by a layout manager has a unique identifier called resource URL.
  *
  * A resource URL must meet the following syntax: "private:resource/$type/$name". It is only allowed to use ASCII characters for type and name.
  *
  * Currently the following user interface element types are defined: **menubar** A configurable user interface element representing a menu
  * bar.**popupmenu** A configurable user interface element representing a pop-up menu.**toolbar** A configurable user interface element a tool
  * bar.**statusbar** A configurable user interface element representing a status bar.**floater** A basic user interface element representing a floating
  * window.
  * @see com.sun.star.ui.UIElementTypes
  * @see com.sun.star.frame.XFrame
  * @since OOo 2.0
  */
trait XLayoutManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides the current docking area size of the layout manager.
    * @returns The {@link com.sun.star.awt.Rectangle} contains pixel values. The members of {@link com.sun.star.awt.Rectangle} are filled as following: X = dock
    */
  val CurrentDockingArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * retrieves the current docking area acceptor that controls the border space of the frame's container window.
    * @returns current docking area acceptor which controls the border space of frame's container window.  A docking area acceptor retrieved by this method is o
    */
  var DockingAreaAcceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor
  /**
    * retrieves all user interface elements which are currently instantiated.
    * @returns a sequence of user interface elements providing {@link com.sun.star.ui.XUIElement} interface.  The layout manager instance is owner of the return
    */
  val Elements: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement]
  /**
    * attaches a {@link com.sun.star.frame.XFrame} to a layout manager.
    * @param Frame specifies the frame that should be attached to the layout manager  A layout manager needs a {@link com.sun.star.frame.XFrame} to be able to
    */
  def attachFrame(Frame: XFrame): scala.Unit
  /**
    * creates a new user interface element.
    * @param ResourceURL specifies which user interface element should be created. A resource URL must meet the following syntax: "private:resource/$type/$nam
    */
  def createElement(ResourceURL: java.lang.String): scala.Unit
  /**
    * destroys a user interface element.
    * @param ResourceURL specifies which user interface element should be destroyed. A resource URL must meet the following syntax: "private:resource/$type/$n
    */
  def destroyElement(ResourceURL: java.lang.String): scala.Unit
  /** forces a complete new layouting of all user interface elements. */
  def doLayout(): scala.Unit
  /**
    * docks all windows which are member of the provided user interface element type.
    * @param nElementType specifies which user interface element type should be docked.
    * @returns returns `TRUE` if all user interface elements of the requested type could be docked, otherwise `FALSE` will be returned.
    * @see com.sun.star.ui.UIElementType
    */
  def dockAllWindows(nElementType: scala.Double): scala.Boolean
  /**
    * docks a window based user interface element to a specified docking area.
    * @param ResourceURL specifies which user interface element should be docked. A resource URL must meet the following syntax: "private:resource/$type/$name
    * @param DockingArea specifies on which docking area the window based user interface element should docked.
    * @param Pos specifies the position inside the docking area.
    * @returns returns `TRUE` if the user interface element has been docked, otherwise `FALSE` will be returned.
    * @see com.sun.star.ui.DockingArea
    */
  def dockWindow(
    ResourceURL: java.lang.String,
    DockingArea: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea,
    Pos: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  ): scala.Boolean
  /**
    * forces a window based user interface element to float.
    * @param ResourceURL specifies which user interface element should be float. A resource URL must meet the following syntax: "private:resource/$type/$name"
    * @returns returns `TRUE` if the user interface element has been docked, otherwise `FALSE` will be returned.
    */
  def floatWindow(ResourceURL: java.lang.String): scala.Boolean
  /**
    * provides the current docking area size of the layout manager.
    * @returns The {@link com.sun.star.awt.Rectangle} contains pixel values. The members of {@link com.sun.star.awt.Rectangle} are filled as following: X = dock
    */
  def getCurrentDockingArea(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * retrieves the current docking area acceptor that controls the border space of the frame's container window.
    * @returns current docking area acceptor which controls the border space of frame's container window.  A docking area acceptor retrieved by this method is o
    */
  def getDockingAreaAcceptor(): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor
  /**
    * retrieves a user interface element which has been created before.
    * @param ResourceURL specifies which user interface element should be retrieved. A resource URL must meet the following syntax: "private:resource/$type/$n
    */
  def getElement(ResourceURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement
  /**
    * retrieves the current pixel position of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the current position should be retrieved. A resource URL must meet the following syntax: "
    * @returns the size in pixel of the user interface element. A non-window based user interface element provides a zero size.
    */
  def getElementPos(ResourceURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * retrieves the current size of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the current size should be retrieved. A resource URL must meet the following syntax: "priv
    * @returns the size in pixel of the user interface element. A non-window based user interface element provides a zero size.
    */
  def getElementSize(ResourceURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * retrieves all user interface elements which are currently instantiated.
    * @returns a sequence of user interface elements providing {@link com.sun.star.ui.XUIElement} interface.  The layout manager instance is owner of the return
    */
  def getElements(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement]
  /**
    * hides a user interface element.
    * @param ResourceURL specifies which user interface element should be hidden. A resource URL must meet the following syntax: "private:resource/$type/$name
    * @returns returns `TRUE` if the user interface element has been hidden, otherwise `FALSE` will be returned.
    */
  def hideElement(ResourceURL: java.lang.String): scala.Boolean
  /**
    * retrieves the current docking state of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the docking state should be retrieved. A resource URL must meet the following syntax: "pri
    * @returns `TRUE` if the user interface element is docked, otherwise `FALSE` .
    */
  def isElementDocked(ResourceURL: java.lang.String): scala.Boolean
  /**
    * retrieves the current floating state of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the floating state should be retrieved. A resource URL must meet the following syntax: "pr
    * @returns `TRUE` if the user interface element is floating, otherwise `FALSE` .
    */
  def isElementFloating(ResourceURL: java.lang.String): scala.Boolean
  /**
    * retrieves the current lock state of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the lock state should be retrieved. A resource URL must meet the following syntax: "privat
    * @returns `TRUE` if the user interface element is locked, otherwise `FALSE` .
    */
  def isElementLocked(ResourceURL: java.lang.String): scala.Boolean
  /**
    * retrieves the current visibility state of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the visibility state should be retrieved. A resource URL must meet the following syntax: "
    * @returns `TRUE` if the user interface element is visible, otherwise `FALSE` .
    */
  def isElementVisible(ResourceURL: java.lang.String): scala.Boolean
  /**
    * retrieves the visibility state of a layout manager.
    *
    * A layout manager can be set to invisible state to force it to hide all of its user interface elements. If another component wants to use the window
    * for its own user interface elements it can use this function. This function is normally used to implement inplace editing.
    */
  def isVisible(): scala.Boolean
  /**
    * prohibit all layout updates until unlock is called again.
    *
    * This call can be used to speed up the creation process of several user interface elements. Otherwise the layout manager would calculate the layout for
    * every creation.
    */
  def lock(): scala.Unit
  /**
    * locks a window based user interface element if it's in a docked state.
    * @param ResourceURL specifies which user interface element should be locked. A resource URL must meet the following syntax: "private:resource/$type/$name
    * @returns returns `TRUE` if the user interface element has been locked, otherwise `FALSE` will be returned.
    */
  def lockWindow(ResourceURL: java.lang.String): scala.Boolean
  /**
    * request to make a user interface element visible if it is not in hidden state.
    * @param ResourceURL specifies which user interface element should be made visible. A resource URL must meet the following syntax: "private:resource/$type
    * @returns returns `TRUE` if the user interface element could be made visible, otherwise `FALSE` will be returned.  If a user interface element should force
    */
  def requestElement(ResourceURL: java.lang.String): scala.Boolean
  /**
    * resets the layout manager and remove all of its internal user interface elements.
    *
    * This call should be handled with care as all user interface elements will be destroyed and the layout manager is reseted to a state after a {@link
    * attachFrame()} has been made. That means an attached frame which has been set by {@link attachFrame()} is not released. The layout manager itself
    * calls reset after a component has been attached or reattached to a frame.
    */
  def reset(): scala.Unit
  /**
    * sets a docking area acceptor that controls the border space of the frame's container window.
    * @param xDockingAreaAcceptor a docking area acceptor which controls the border space of frame's container window.  A docking area acceptor decides if the
    */
  def setDockingAreaAcceptor(xDockingAreaAcceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor): scala.Unit
  /**
    * sets a new position for a window based user interface element.
    * @param ResourceURL specifies which user interface element should be moved. A resource URL must meet the following syntax: "private:resource/$type/$name"
    * @param Pos specifies the new position in pixel.  It is up to the layout manager to decide if the user interface element can be moved. The new position c
    */
  def setElementPos(ResourceURL: java.lang.String, Pos: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Unit
  /**
    * sets a new position and size for a window based user interface element.
    * @param ResourceURL specifies which user interface element should be moved and resized. A resource URL must meet the following syntax: "private:resource/
    * @param Pos specifies the new position in pixel.
    * @param Size specifies the new position in pixel.  It is up to the layout manager to decide if the user interface element can be moved and resized. The n
    */
  def setElementPosSize(
    ResourceURL: java.lang.String,
    Pos: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  ): scala.Unit
  /**
    * sets a new size for a window based user interface element.
    * @param ResourceURL specifies which user interface element should be resized. A resource URL must meet the following syntax: "private:resource/$type/$nam
    * @param Size specifies the new size in pixel.  It is up to the layout manager to decide if the user interface element can be resized. The new size can be
    */
  def setElementSize(ResourceURL: java.lang.String, Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size): scala.Unit
  /**
    * sets the layout manager to invisible state and hides all user interface elements.
    *
    * A layout manager can be set to invisible state to force it to hide all of its user interface elements. If another component wants to use the window
    * for its own user interface elements it can use this function. This function is normally used to implement inplace editing.
    * @param Visible provide `FALSE` to make layout manager invisible otherwise this must be set to `TRUE` .
    */
  def setVisible(Visible: scala.Boolean): scala.Unit
  /**
    * shows a user interface element.
    * @param ResourceURL specifies which user interface element should be shown. A resource URL must meet the following syntax: "private:resource/$type/$name"
    * @returns returns `TRUE` if the user interface element has been shown, otherwise `FALSE` will be returned.
    */
  def showElement(ResourceURL: java.lang.String): scala.Boolean
  /**
    * permit layout updates again.
    *
    * This function should be called to permit layout updates. The layout manager starts to calculate the new layout after this call.
    */
  def unlock(): scala.Unit
  /**
    * unlocks a window based user interface element if it's in a docked state.
    * @param ResourceURL specifies which user interface element should be unlocked. A resource URL must meet the following syntax: "private:resource/$type/$na
    * @returns returns `TRUE` if the user interface element has been unlocked, otherwise `FALSE` will be returned.
    */
  def unlockWindow(ResourceURL: java.lang.String): scala.Boolean
}

object XLayoutManager {
  @scala.inline
  def apply(
    CurrentDockingArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    DockingAreaAcceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor,
    Elements: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement],
    acquire: js.Function0[scala.Unit],
    attachFrame: js.Function1[XFrame, scala.Unit],
    createElement: js.Function1[java.lang.String, scala.Unit],
    destroyElement: js.Function1[java.lang.String, scala.Unit],
    doLayout: js.Function0[scala.Unit],
    dockAllWindows: js.Function1[scala.Double, scala.Boolean],
    dockWindow: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      scala.Boolean
    ],
    floatWindow: js.Function1[java.lang.String, scala.Boolean],
    getCurrentDockingArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getDockingAreaAcceptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor],
    getElement: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement],
    getElementPos: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getElementSize: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getElements: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement]
    ],
    hideElement: js.Function1[java.lang.String, scala.Boolean],
    isElementDocked: js.Function1[java.lang.String, scala.Boolean],
    isElementFloating: js.Function1[java.lang.String, scala.Boolean],
    isElementLocked: js.Function1[java.lang.String, scala.Boolean],
    isElementVisible: js.Function1[java.lang.String, scala.Boolean],
    isVisible: js.Function0[scala.Boolean],
    lock: js.Function0[scala.Unit],
    lockWindow: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    requestElement: js.Function1[java.lang.String, scala.Boolean],
    reset: js.Function0[scala.Unit],
    setDockingAreaAcceptor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor, scala.Unit],
    setElementPos: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      scala.Unit
    ],
    setElementPosSize: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      scala.Unit
    ],
    setElementSize: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      scala.Unit
    ],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    showElement: js.Function1[java.lang.String, scala.Boolean],
    unlock: js.Function0[scala.Unit],
    unlockWindow: js.Function1[java.lang.String, scala.Boolean]
  ): XLayoutManager = {
    val __obj = js.Dynamic.literal(CurrentDockingArea = CurrentDockingArea, DockingAreaAcceptor = DockingAreaAcceptor, Elements = Elements, acquire = acquire, attachFrame = attachFrame, createElement = createElement, destroyElement = destroyElement, doLayout = doLayout, dockAllWindows = dockAllWindows, dockWindow = dockWindow, floatWindow = floatWindow, getCurrentDockingArea = getCurrentDockingArea, getDockingAreaAcceptor = getDockingAreaAcceptor, getElement = getElement, getElementPos = getElementPos, getElementSize = getElementSize, getElements = getElements, hideElement = hideElement, isElementDocked = isElementDocked, isElementFloating = isElementFloating, isElementLocked = isElementLocked, isElementVisible = isElementVisible, isVisible = isVisible, lock = lock, lockWindow = lockWindow, queryInterface = queryInterface, release = release, requestElement = requestElement, reset = reset, setDockingAreaAcceptor = setDockingAreaAcceptor, setElementPos = setElementPos, setElementPosSize = setElementPosSize, setElementSize = setElementSize, setVisible = setVisible, showElement = showElement, unlock = unlock, unlockWindow = unlockWindow)
  
    __obj.asInstanceOf[XLayoutManager]
  }
}

