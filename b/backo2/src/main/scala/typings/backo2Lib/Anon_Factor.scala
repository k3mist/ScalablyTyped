package typings
package backo2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factor extends js.Object {
  var factor: scala.Double
  var jitter: scala.Double
  var max: scala.Double
  var min: scala.Double
}

object Anon_Factor {
  @scala.inline
  def apply(factor: scala.Double, jitter: scala.Double, max: scala.Double, min: scala.Double): Anon_Factor = {
    val __obj = js.Dynamic.literal(factor = factor, jitter = jitter, max = max, min = min)
  
    __obj.asInstanceOf[Anon_Factor]
  }
}

