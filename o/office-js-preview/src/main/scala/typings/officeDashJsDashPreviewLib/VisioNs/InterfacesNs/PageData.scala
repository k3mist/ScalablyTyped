package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "page.toJSON()". */
trait PageData extends js.Object {
  /**
    *
    * All shapes in the Page, including subshapes. Read-only.
    *
    * [Api set:  1.1]
    */
  var allShapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
  /**
    *
    * Returns the Comments Collection.  Read-only.
    *
    * [Api set:  1.1]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.undefined
  /**
    *
    * Returns the height of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Index of the Page. Read-only.
    *
    * [Api set:  1.1]
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Whether the page is a background page or not. Read-only.
    *
    * [Api set:  1.1]
    */
  var isBackground: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Page name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * All top-level shapes in the Page.Read-only.
    *
    * [Api set:  1.1]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
  /**
    *
    * Returns the view of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewData] = js.undefined
  /**
    *
    * Returns the width of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PageData {
  @scala.inline
  def apply(
    allShapes: js.Array[ShapeData] = null,
    comments: js.Array[CommentData] = null,
    height: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    isBackground: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    shapes: js.Array[ShapeData] = null,
    view: PageViewData = null,
    width: scala.Int | scala.Double = null
  ): PageData = {
    val __obj = js.Dynamic.literal()
    if (allShapes != null) __obj.updateDynamic("allShapes")(allShapes)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isBackground)) __obj.updateDynamic("isBackground")(isBackground)
    if (name != null) __obj.updateDynamic("name")(name)
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageData]
  }
}

