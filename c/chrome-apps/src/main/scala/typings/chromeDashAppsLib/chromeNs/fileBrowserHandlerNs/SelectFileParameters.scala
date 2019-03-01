package typings
package chromeDashAppsLib.chromeNs.fileBrowserHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectFileParameters extends js.Object {
  /**
    * List of file extensions that the selected file can have.
    * The list is also used to specify what files to be shown in the select file dialog.
    * Files with the listed extensions are only shown in the dialog.
    * Extensions should not include the leading '.'.
    * @example ['jpg', 'png']
    */
  var allowedFileExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Suggested name for the file. */
  var suggestedName: java.lang.String
}

object SelectFileParameters {
  @scala.inline
  def apply(suggestedName: java.lang.String, allowedFileExtensions: js.Array[java.lang.String] = null): SelectFileParameters = {
    val __obj = js.Dynamic.literal(suggestedName = suggestedName)
    if (allowedFileExtensions != null) __obj.updateDynamic("allowedFileExtensions")(allowedFileExtensions)
    __obj.asInstanceOf[SelectFileParameters]
  }
}

