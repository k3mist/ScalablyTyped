package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents x- and y-coordinate values that define a point in a two-dimensional plane. */
trait Point extends js.Object {
  /** The horizontal position of the point. */
  var x: scala.Double
  /** The vertical position of the point. */
  var y: scala.Double
}

object Point {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Point = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

