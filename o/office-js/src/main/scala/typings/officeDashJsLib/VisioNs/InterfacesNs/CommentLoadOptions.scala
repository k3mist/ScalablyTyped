package typings
package officeDashJsLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Comment.
  *
  * [Api set:  1.1]
  */
trait CommentLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * A string that specifies the name of the author of the comment.
    *
    * [Api set:  1.1]
    */
  var author: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * A string that specifies the date when the comment was created.
    *
    * [Api set:  1.1]
    */
  var date: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * A string that contains the comment text.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[scala.Boolean] = js.undefined
}

object CommentLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    author: js.UndefOr[scala.Boolean] = js.undefined,
    date: js.UndefOr[scala.Boolean] = js.undefined,
    text: js.UndefOr[scala.Boolean] = js.undefined
  ): CommentLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(author)) __obj.updateDynamic("author")(author)
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CommentLoadOptions]
  }
}

