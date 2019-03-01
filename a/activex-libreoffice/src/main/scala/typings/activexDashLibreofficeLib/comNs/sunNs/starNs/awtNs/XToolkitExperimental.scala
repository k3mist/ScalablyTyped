package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Work in progress, don't use unless you know what you are doing. */
trait XToolkitExperimental extends XToolkit2 {
  /** Get the number of OpenGL buffer swaps. */
  val OpenGLBufferSwapCounter: scala.Double
  /** Get the number of OpenGL buffer swaps. */
  def getOpenGLBufferSwapCounter(): scala.Double
  /** Pause the main thread of LibreOffice for the requested amount of time. */
  def pause(nMilliseconds: scala.Double): scala.Unit
  /** Process all pending idle events */
  def processEventsToIdle(): scala.Unit
  /** Turn on or off deterministic scheduling (off is the default). */
  def setDeterministicScheduling(bDeterministicMode: scala.Boolean): scala.Unit
}

object XToolkitExperimental {
  @scala.inline
  def apply(
    ActiveTopWindow: XTopWindow,
    DesktopWindow: XWindowPeer,
    OpenGLBufferSwapCounter: scala.Double,
    TopWindowCount: scala.Double,
    WorkArea: Rectangle,
    acquire: js.Function0[scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addKeyHandler: js.Function1[XKeyHandler, scala.Unit],
    addTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    createMessageBox: js.Function5[XWindowPeer, MessageBoxType, scala.Double, java.lang.String, java.lang.String, XMessageBox],
    createRegion: js.Function0[XRegion],
    createScreenCompatibleDevice: js.Function2[scala.Double, scala.Double, XDevice],
    createSystemChild: js.Function3[
      js.Any, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Double, 
      XWindowPeer
    ],
    createWindow: js.Function1[WindowDescriptor, XWindowPeer],
    createWindows: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[WindowDescriptor], 
      activexDashInteropLib.SafeArray[XWindowPeer]
    ],
    fireFocusGained: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    fireFocusLost: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    getActiveTopWindow: js.Function0[XTopWindow],
    getClipboard: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.XClipboard
    ],
    getDesktopWindow: js.Function0[XWindowPeer],
    getDragGestureRecognizer: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragGestureRecognizer
    ],
    getDragSource: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragSource
    ],
    getDropTarget: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDropTarget
    ],
    getOpenGLBufferSwapCounter: js.Function0[scala.Double],
    getTopWindow: js.Function1[scala.Double, XTopWindow],
    getTopWindowCount: js.Function0[scala.Double],
    getWorkArea: js.Function0[Rectangle],
    pause: js.Function1[scala.Double, scala.Unit],
    processEventsToIdle: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeKeyHandler: js.Function1[XKeyHandler, scala.Unit],
    removeTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    reschedule: js.Function0[scala.Unit],
    setDeterministicScheduling: js.Function1[scala.Boolean, scala.Unit]
  ): XToolkitExperimental = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow, DesktopWindow = DesktopWindow, OpenGLBufferSwapCounter = OpenGLBufferSwapCounter, TopWindowCount = TopWindowCount, WorkArea = WorkArea, acquire = acquire, addFocusListener = addFocusListener, addKeyHandler = addKeyHandler, addTopWindowListener = addTopWindowListener, createMessageBox = createMessageBox, createRegion = createRegion, createScreenCompatibleDevice = createScreenCompatibleDevice, createSystemChild = createSystemChild, createWindow = createWindow, createWindows = createWindows, fireFocusGained = fireFocusGained, fireFocusLost = fireFocusLost, getActiveTopWindow = getActiveTopWindow, getClipboard = getClipboard, getDesktopWindow = getDesktopWindow, getDragGestureRecognizer = getDragGestureRecognizer, getDragSource = getDragSource, getDropTarget = getDropTarget, getOpenGLBufferSwapCounter = getOpenGLBufferSwapCounter, getTopWindow = getTopWindow, getTopWindowCount = getTopWindowCount, getWorkArea = getWorkArea, pause = pause, processEventsToIdle = processEventsToIdle, queryInterface = queryInterface, release = release, removeFocusListener = removeFocusListener, removeKeyHandler = removeKeyHandler, removeTopWindowListener = removeTopWindowListener, reschedule = reschedule, setDeterministicScheduling = setDeterministicScheduling)
  
    __obj.asInstanceOf[XToolkitExperimental]
  }
}

