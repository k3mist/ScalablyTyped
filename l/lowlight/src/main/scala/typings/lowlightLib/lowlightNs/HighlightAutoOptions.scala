package typings
package lowlightLib.lowlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightAutoOptions extends HighlightOptions {
  var subset: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object HighlightAutoOptions {
  @scala.inline
  def apply(prefix: java.lang.String = null, subset: js.Array[java.lang.String] = null): HighlightAutoOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (subset != null) __obj.updateDynamic("subset")(subset)
    __obj.asInstanceOf[HighlightAutoOptions]
  }
}

