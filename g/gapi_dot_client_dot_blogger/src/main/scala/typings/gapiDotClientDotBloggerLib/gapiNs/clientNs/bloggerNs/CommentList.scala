package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentList extends js.Object {
  /** Etag of the response. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The List of Comments for a Post. */
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  /** The kind of this entry. Always blogger#commentList */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to fetch the previous page, if one exists. */
  var prevPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object CommentList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Comment] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    prevPageToken: java.lang.String = null
  ): CommentList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken)
    __obj.asInstanceOf[CommentList]
  }
}

