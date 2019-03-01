package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathStep extends js.Object {
  var direction: DirectionConstant
  var dx: scala.Double
  var dy: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object PathStep {
  @scala.inline
  def apply(direction: DirectionConstant, dx: scala.Double, dy: scala.Double, x: scala.Double, y: scala.Double): PathStep = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], dx = dx, dy = dy, x = x, y = y)
  
    __obj.asInstanceOf[PathStep]
  }
}

