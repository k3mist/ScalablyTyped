package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  /** The author of this Page. */
  var author: js.UndefOr[gapiDotClientDotBloggerLib.Anon_DisplayName] = js.undefined
  /** Data about the blog containing this Page. */
  var blog: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Id] = js.undefined
  /** The body content of this Page, in HTML. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Etag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The identifier for this resource. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of this entity. Always blogger#page */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 date-time when this Page was published. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the page for admin resources (either LIVE or DRAFT). */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this entity. This is the name displayed in the Admin user interface. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 date-time when this Page was last updated. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The URL that this Page is displayed at. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Page {
  @scala.inline
  def apply(
    author: gapiDotClientDotBloggerLib.Anon_DisplayName = null,
    blog: gapiDotClientDotBloggerLib.Anon_Id = null,
    content: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    published: java.lang.String = null,
    selfLink: java.lang.String = null,
    status: java.lang.String = null,
    title: java.lang.String = null,
    updated: java.lang.String = null,
    url: java.lang.String = null
  ): Page = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (blog != null) __obj.updateDynamic("blog")(blog)
    if (content != null) __obj.updateDynamic("content")(content)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (published != null) __obj.updateDynamic("published")(published)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Page]
  }
}

