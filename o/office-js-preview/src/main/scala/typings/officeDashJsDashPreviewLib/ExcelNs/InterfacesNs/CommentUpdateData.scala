package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Comment object, for use in "comment.set({ ... })". */
trait CommentUpdateData extends js.Object {
  /**
    *
    * Get/Set the content.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
}

object CommentUpdateData {
  @scala.inline
  def apply(content: java.lang.String = null): CommentUpdateData = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[CommentUpdateData]
  }
}

