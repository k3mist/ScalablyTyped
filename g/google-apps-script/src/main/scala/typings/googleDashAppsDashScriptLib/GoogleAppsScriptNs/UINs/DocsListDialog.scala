package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocsListDialog extends js.Object {
  def addCloseHandler(handler: Handler): DocsListDialog
  def addSelectionHandler(handler: Handler): DocsListDialog
  def addView(fileType: FileType): DocsListDialog
  def getId(): java.lang.String
  def getType(): java.lang.String
  def setDialogTitle(title: java.lang.String): DocsListDialog
  def setHeight(height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DocsListDialog
  def setInitialView(fileType: FileType): DocsListDialog
  def setMultiSelectEnabled(multiSelectEnabled: scala.Boolean): DocsListDialog
  def setOAuthToken(oAuthToken: java.lang.String): DocsListDialog
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DocsListDialog
  def showDocsPicker(): DocsListDialog
}

object DocsListDialog {
  @scala.inline
  def apply(
    addCloseHandler: js.Function1[Handler, DocsListDialog],
    addSelectionHandler: js.Function1[Handler, DocsListDialog],
    addView: js.Function1[FileType, DocsListDialog],
    getId: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setDialogTitle: js.Function1[java.lang.String, DocsListDialog],
    setHeight: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, DocsListDialog],
    setInitialView: js.Function1[FileType, DocsListDialog],
    setMultiSelectEnabled: js.Function1[scala.Boolean, DocsListDialog],
    setOAuthToken: js.Function1[java.lang.String, DocsListDialog],
    setWidth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, DocsListDialog],
    showDocsPicker: js.Function0[DocsListDialog]
  ): DocsListDialog = {
    val __obj = js.Dynamic.literal(addCloseHandler = addCloseHandler, addSelectionHandler = addSelectionHandler, addView = addView, getId = getId, getType = getType, setDialogTitle = setDialogTitle, setHeight = setHeight, setInitialView = setInitialView, setMultiSelectEnabled = setMultiSelectEnabled, setOAuthToken = setOAuthToken, setWidth = setWidth, showDocsPicker = showDocsPicker)
  
    __obj.asInstanceOf[DocsListDialog]
  }
}

