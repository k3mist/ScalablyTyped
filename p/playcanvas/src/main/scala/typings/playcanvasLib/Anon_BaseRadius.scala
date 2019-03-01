package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseRadius extends js.Object {
  var baseRadius: scala.Double
  var capSegments: scala.Double
  var height: scala.Double
  var heightSegments: scala.Double
  var peakRadius: scala.Double
}

object Anon_BaseRadius {
  @scala.inline
  def apply(
    baseRadius: scala.Double,
    capSegments: scala.Double,
    height: scala.Double,
    heightSegments: scala.Double,
    peakRadius: scala.Double
  ): Anon_BaseRadius = {
    val __obj = js.Dynamic.literal(baseRadius = baseRadius, capSegments = capSegments, height = height, heightSegments = heightSegments, peakRadius = peakRadius)
  
    __obj.asInstanceOf[Anon_BaseRadius]
  }
}

