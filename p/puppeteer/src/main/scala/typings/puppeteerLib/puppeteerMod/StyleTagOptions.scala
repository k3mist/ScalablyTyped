package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleTagOptions extends js.Object {
  /** Raw CSS content to be injected into frame. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Path to the CSS file to be injected into frame. If `path` is a relative path, then it is resolved relative to current working directory. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Url of the <link> tag. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object StyleTagOptions {
  @scala.inline
  def apply(content: java.lang.String = null, path: java.lang.String = null, url: java.lang.String = null): StyleTagOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (path != null) __obj.updateDynamic("path")(path)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[StyleTagOptions]
  }
}

