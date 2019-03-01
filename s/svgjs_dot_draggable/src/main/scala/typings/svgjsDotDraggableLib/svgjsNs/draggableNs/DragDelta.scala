package typings
package svgjsDotDraggableLib.svgjsNs.draggableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDelta extends js.Object {
  var x: scala.Double
  var y: scala.Double
  var zoom: scala.Double
}

object DragDelta {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, zoom: scala.Double): DragDelta = {
    val __obj = js.Dynamic.literal(x = x, y = y, zoom = zoom)
  
    __obj.asInstanceOf[DragDelta]
  }
}

