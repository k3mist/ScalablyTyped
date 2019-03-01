package typings
package lowlightLib.lowlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightOptions extends js.Object {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object HighlightOptions {
  @scala.inline
  def apply(prefix: java.lang.String = null): HighlightOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[HighlightOptions]
  }
}

