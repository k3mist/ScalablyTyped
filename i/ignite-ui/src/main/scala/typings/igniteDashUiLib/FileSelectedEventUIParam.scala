package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSelectedEventUIParam extends js.Object {
  /**
  	 * Gets the unique identifier of the file.
  	 */
  var fileId: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the name of the uploaded file.
  	 */
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FileSelectedEventUIParam {
  @scala.inline
  def apply(fileId: scala.Int | scala.Double = null, filePath: java.lang.String = null, owner: js.Any = null): FileSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FileSelectedEventUIParam]
  }
}

