package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogUserInfo extends js.Object {
  /** The Blog resource. */
  var blog: js.UndefOr[Blog] = js.undefined
  /** Information about a User for the Blog. */
  var blog_user_info: js.UndefOr[BlogPerUserInfo] = js.undefined
  /** The kind of this entity. Always blogger#blogUserInfo */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object BlogUserInfo {
  @scala.inline
  def apply(blog: Blog = null, blog_user_info: BlogPerUserInfo = null, kind: java.lang.String = null): BlogUserInfo = {
    val __obj = js.Dynamic.literal()
    if (blog != null) __obj.updateDynamic("blog")(blog)
    if (blog_user_info != null) __obj.updateDynamic("blog_user_info")(blog_user_info)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[BlogUserInfo]
  }
}

