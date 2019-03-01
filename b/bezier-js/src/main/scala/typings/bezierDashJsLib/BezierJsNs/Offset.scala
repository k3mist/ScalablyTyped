package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends Point {
  var c: Point
  var n: Point
}

object Offset {
  @scala.inline
  def apply(c: Point, n: Point, x: scala.Double, y: scala.Double, z: scala.Int | scala.Double = null): Offset = {
    val __obj = js.Dynamic.literal(c = c, n = n, x = x, y = y)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

