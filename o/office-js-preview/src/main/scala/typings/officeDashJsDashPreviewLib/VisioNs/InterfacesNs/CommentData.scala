package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "comment.toJSON()". */
trait CommentData extends js.Object {
  /**
    *
    * A string that specifies the name of the author of the comment.
    *
    * [Api set:  1.1]
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * A string that specifies the date when the comment was created.
    *
    * [Api set:  1.1]
    */
  var date: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * A string that contains the comment text.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object CommentData {
  @scala.inline
  def apply(author: java.lang.String = null, date: java.lang.String = null, text: java.lang.String = null): CommentData = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (date != null) __obj.updateDynamic("date")(date)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CommentData]
  }
}

