package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a three-dimensional boundary volume with two positions. */
trait BoundVolume extends js.Object {
  /** this is the maximum position inside the boundary volume. */
  var max: Position3D
  /** this is the minimum position inside the boundary volume. */
  var min: Position3D
}

object BoundVolume {
  @scala.inline
  def apply(max: Position3D, min: Position3D): BoundVolume = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[BoundVolume]
  }
}

