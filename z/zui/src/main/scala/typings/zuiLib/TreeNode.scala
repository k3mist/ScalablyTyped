package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * treeview
  */
trait TreeNode extends js.Object {
  var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object TreeNode {
  @scala.inline
  def apply(
    children: js.Array[TreeNode] = null,
    html: java.lang.String = null,
    id: java.lang.String = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): TreeNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (html != null) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TreeNode]
  }
}

