package typings
package chromeLib.chromeNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkChangesArg extends js.Object {
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object BookmarkChangesArg {
  @scala.inline
  def apply(title: java.lang.String = null, url: java.lang.String = null): BookmarkChangesArg = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BookmarkChangesArg]
  }
}

