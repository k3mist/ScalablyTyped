package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait datapoints extends js.Object {
  var format: js.Array[datapointFormat]
  var points: js.Array[scala.Double]
  var pointsize: scala.Double
}

object datapoints {
  @scala.inline
  def apply(format: js.Array[datapointFormat], points: js.Array[scala.Double], pointsize: scala.Double): datapoints = {
    val __obj = js.Dynamic.literal(format = format, points = points, pointsize = pointsize)
  
    __obj.asInstanceOf[datapoints]
  }
}

