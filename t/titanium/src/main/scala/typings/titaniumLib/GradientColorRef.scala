package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object consisting of a color and an offset.
  */
trait GradientColorRef extends js.Object {
  /**
  	 * Color value at this point in the gradient, as a color name or hex triplet.
  	 */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The color's normalized position within the gradient, ranging from 0 (start) to 1 (end).
  	 */
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object GradientColorRef {
  @scala.inline
  def apply(color: java.lang.String = null, offset: scala.Int | scala.Double = null): GradientColorRef = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientColorRef]
  }
}

