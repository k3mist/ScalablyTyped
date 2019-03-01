package typings
package reactDashColorLib.reactDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBColor extends _Color {
  var a: js.UndefOr[scala.Double] = js.undefined
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object RGBColor {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, r: scala.Double, a: scala.Int | scala.Double = null): RGBColor = {
    val __obj = js.Dynamic.literal(b = b, g = g, r = r)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
}

