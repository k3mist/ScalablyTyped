package typings
package gapiDotClientDotAdexchangebuyerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightWidth extends js.Object {
  /** Height in pixels. */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Width in pixels. */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_HeightWidth {
  @scala.inline
  def apply(height: java.lang.String = null, width: java.lang.String = null): Anon_HeightWidth = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_HeightWidth]
  }
}

