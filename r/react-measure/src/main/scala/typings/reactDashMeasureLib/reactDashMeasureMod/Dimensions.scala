package typings
package reactDashMeasureLib.reactDashMeasureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  val height: scala.Double
  val width: scala.Double
}

object Dimensions {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Dimensions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Dimensions]
  }
}

