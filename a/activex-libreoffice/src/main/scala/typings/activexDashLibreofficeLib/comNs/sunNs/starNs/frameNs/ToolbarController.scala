package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an abstract service for a component which offers a more complex user interface to users within a toolbar.
  *
  * A generic toolbar function is represented as a button which has a state (enabled,disabled and selected, not selected). A toolbar controller can be
  * added to a toolbar and provide information or functions within a more sophisticated user interface. ;  A typical example for toolbar controller is the
  * font chooser within the toolbar. It provides all available fonts in a dropdown box and shows the current chosen font.
  * @see com.sun.star.frame.XDispatchProvider
  * @since OOo 2.0
  */
trait ToolbarController
  extends XStatusListener
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XUpdatable
     with XToolbarController
     with XSubToolbarController

object ToolbarController {
  @scala.inline
  def apply(
    SubToolbarName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    click: js.Function0[scala.Unit],
    createItemWindow: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
    ],
    createPopupWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    doubleClick: js.Function0[scala.Unit],
    execute: js.Function1[scala.Double, scala.Unit],
    functionSelected: js.Function1[java.lang.String, scala.Unit],
    getSubToolbarName: js.Function0[java.lang.String],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    opensSubToolbar: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    statusChanged: js.Function1[FeatureStateEvent, scala.Unit],
    update: js.Function0[scala.Unit],
    updateImage: js.Function0[scala.Unit]
  ): ToolbarController = {
    val __obj = js.Dynamic.literal(SubToolbarName = SubToolbarName, acquire = acquire, click = click, createItemWindow = createItemWindow, createPopupWindow = createPopupWindow, disposing = disposing, doubleClick = doubleClick, execute = execute, functionSelected = functionSelected, getSubToolbarName = getSubToolbarName, initialize = initialize, opensSubToolbar = opensSubToolbar, queryInterface = queryInterface, release = release, statusChanged = statusChanged, update = update, updateImage = updateImage)
  
    __obj.asInstanceOf[ToolbarController]
  }
}

