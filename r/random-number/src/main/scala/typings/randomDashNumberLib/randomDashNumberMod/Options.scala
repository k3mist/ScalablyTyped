package typings
package randomDashNumberLib.randomDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var integer: scala.Boolean
  var max: scala.Double
  var min: scala.Double
}

object Options {
  @scala.inline
  def apply(integer: scala.Boolean, max: scala.Double, min: scala.Double): Options = {
    val __obj = js.Dynamic.literal(integer = integer, max = max, min = min)
  
    __obj.asInstanceOf[Options]
  }
}

