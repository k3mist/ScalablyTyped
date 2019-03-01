package typings
package bootstrap3DashDialogLib.BootstrapDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContext extends js.Object {
  /**  	Close the dialog. Usage: dialogInstance.close() */
  def close(): scala.Unit
  /** Disable all buttons in dialog footer when it's false, enable all when it's true. */
  def enableButtons(enable: scala.Boolean): scala.Unit
  def getButton(buttonId: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement]
  /** Get data entry according to the given key, returns null if no data entry found. */
  def getData(dataName: java.lang.String): js.Any
  /** Return the raw modal, equivalent to $('<div class='modal fade'...></div>') */
  def getModal(): jqueryLib.JQuery[stdLib.HTMLElement]
  /** Return the raw modal body. */
  def getModalBody(): jqueryLib.JQuery[stdLib.HTMLElement]
  /** Return the raw modal content. */
  def getModalContent(): jqueryLib.JQuery[stdLib.HTMLElement]
  /** Return the raw modal dialog. */
  def getModalDialog(): jqueryLib.JQuery[stdLib.HTMLElement]
  /** Return the raw modal footer. */
  def getModalFooter(): jqueryLib.JQuery[stdLib.HTMLElement]
  /** Return the raw modal header. */
  def getModalHeader(): jqueryLib.JQuery[stdLib.HTMLElement]
  def getTitle(): java.lang.String
  /** Open the dialog. Usage: dialogInstance.open() */
  def open(): scala.Unit
  /**
    * Calling dialog.open() will automatically get this method called first, but if you want to do something on your dialog
    * before it's shown, you can manually call dialog.realize() before calling dialog.open().
    */
  def realize(): scala.Unit
  /**
    * When set to true (default), dialog can be closed by clicking close icon in dialog header,
    * or by clicking outside the dialog, or, ESC key is pressed.
    */
  def setClosable(closable: scala.Boolean): scala.Unit
  /** Bind data entry to dialog instance, value can be any types that javascript supports. */
  def setData(dataName: java.lang.String, value: js.Any): scala.Unit
  def setMessage(message: java.lang.String): scala.Unit
  def setTitle(title: java.lang.String): scala.Unit
  /** See BootstrapDialog.TYPE_xxx constants. */
  def setType(dialogType: java.lang.String): scala.Unit
}

object DialogContext {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    enableButtons: js.Function1[scala.Boolean, scala.Unit],
    getButton: js.Function1[java.lang.String, jqueryLib.JQuery[stdLib.HTMLElement]],
    getData: js.Function1[java.lang.String, js.Any],
    getModal: js.Function0[jqueryLib.JQuery[stdLib.HTMLElement]],
    getModalBody: js.Function0[jqueryLib.JQuery[stdLib.HTMLElement]],
    getModalContent: js.Function0[jqueryLib.JQuery[stdLib.HTMLElement]],
    getModalDialog: js.Function0[jqueryLib.JQuery[stdLib.HTMLElement]],
    getModalFooter: js.Function0[jqueryLib.JQuery[stdLib.HTMLElement]],
    getModalHeader: js.Function0[jqueryLib.JQuery[stdLib.HTMLElement]],
    getTitle: js.Function0[java.lang.String],
    open: js.Function0[scala.Unit],
    realize: js.Function0[scala.Unit],
    setClosable: js.Function1[scala.Boolean, scala.Unit],
    setData: js.Function2[java.lang.String, js.Any, scala.Unit],
    setMessage: js.Function1[java.lang.String, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    setType: js.Function1[java.lang.String, scala.Unit]
  ): DialogContext = {
    val __obj = js.Dynamic.literal(close = close, enableButtons = enableButtons, getButton = getButton, getData = getData, getModal = getModal, getModalBody = getModalBody, getModalContent = getModalContent, getModalDialog = getModalDialog, getModalFooter = getModalFooter, getModalHeader = getModalHeader, getTitle = getTitle, open = open, realize = realize, setClosable = setClosable, setData = setData, setMessage = setMessage, setTitle = setTitle, setType = setType)
  
    __obj.asInstanceOf[DialogContext]
  }
}

