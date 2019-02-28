package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadField
  extends extjsLib.ExtNs.formNs.fieldNs.ITrigger {
  /** [Property] (Ext.button.Button) */
  var button: js.UndefOr[extjsLib.ExtNs.buttonNs.IButton] = js.undefined
  /** [Config Option] (Object) */
  var buttonConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var buttonMargin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var buttonOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnSubmit: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  @JSName("extractFileInput")
  var extractFileInput_IFileUploadField: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  /** [Property] (Ext.Element) */
  var fileInputEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Method] Gets the markup to be inserted into the subTplMarkup  */
  var getTriggerMarkup: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  @JSName("isFileUpload")
  var isFileUpload_IFileUploadField: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IFileUploadField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Overridden to do nothing */
  @JSName("setValue")
  var setValue_IFileUploadField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

