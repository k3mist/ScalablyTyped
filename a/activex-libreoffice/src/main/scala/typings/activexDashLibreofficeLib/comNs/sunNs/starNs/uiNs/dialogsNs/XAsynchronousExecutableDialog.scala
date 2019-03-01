package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for an executable dialog in asynchronous mode. */
trait XAsynchronousExecutableDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Sets the title of the dialog.
    * @param aTitle Set an arbitrary title for the dialog, may be an empty string if the dialog should not have a title.
    */
  def setDialogTitle(aTitle: java.lang.String): scala.Unit
  /**
    * Executes (shows) the dialog and returns immediately.
    * @param xListener This listener will be called when the dialog is closed.
    */
  def startExecuteModal(xListener: XDialogClosedListener): scala.Unit
}

object XAsynchronousExecutableDialog {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDialogTitle: js.Function1[java.lang.String, scala.Unit],
    startExecuteModal: js.Function1[XDialogClosedListener, scala.Unit]
  ): XAsynchronousExecutableDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, setDialogTitle = setDialogTitle, startExecuteModal = startExecuteModal)
  
    __obj.asInstanceOf[XAsynchronousExecutableDialog]
  }
}

