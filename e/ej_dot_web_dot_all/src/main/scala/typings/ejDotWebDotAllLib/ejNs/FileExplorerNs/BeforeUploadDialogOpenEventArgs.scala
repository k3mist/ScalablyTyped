package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeUploadDialogOpenEventArgs extends js.Object {
  /** returns Selected FileList objects
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeUploadDialogOpenEventArgs {
  @scala.inline
  def apply(files: js.Any = null, model: js.Any = null, `type`: java.lang.String = null): BeforeUploadDialogOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeUploadDialogOpenEventArgs]
  }
}

