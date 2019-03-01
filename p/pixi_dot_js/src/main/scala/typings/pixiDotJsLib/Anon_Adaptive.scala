package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adaptive extends js.Object {
  var adaptive: scala.Boolean
  var maxLength: scala.Double
  var maxSegments: scala.Double
  var minSegments: scala.Double
}

object Anon_Adaptive {
  @scala.inline
  def apply(
    adaptive: scala.Boolean,
    maxLength: scala.Double,
    maxSegments: scala.Double,
    minSegments: scala.Double
  ): Anon_Adaptive = {
    val __obj = js.Dynamic.literal(adaptive = adaptive, maxLength = maxLength, maxSegments = maxSegments, minSegments = minSegments)
  
    __obj.asInstanceOf[Anon_Adaptive]
  }
}

