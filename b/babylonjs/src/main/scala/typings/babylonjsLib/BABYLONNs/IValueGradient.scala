package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface used by value gradients (color, factor, ...) */
trait IValueGradient extends js.Object {
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  var gradient: scala.Double
}

object IValueGradient {
  @scala.inline
  def apply(gradient: scala.Double): IValueGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient)
  
    __obj.asInstanceOf[IValueGradient]
  }
}

