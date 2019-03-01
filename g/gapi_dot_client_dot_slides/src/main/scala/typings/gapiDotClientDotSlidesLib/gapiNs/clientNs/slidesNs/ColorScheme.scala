package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScheme extends js.Object {
  /** The ThemeColorType and corresponding concrete color pairs. */
  var colors: js.UndefOr[js.Array[ThemeColorPair]] = js.undefined
}

object ColorScheme {
  @scala.inline
  def apply(colors: js.Array[ThemeColorPair] = null): ColorScheme = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    __obj.asInstanceOf[ColorScheme]
  }
}

