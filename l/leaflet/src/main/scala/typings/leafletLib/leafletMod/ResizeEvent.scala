package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEvent extends LeafletEvent {
  var newSize: Point
  var oldSize: Point
}

object ResizeEvent {
  @scala.inline
  def apply(newSize: Point, oldSize: Point, target: js.Any, `type`: java.lang.String): ResizeEvent = {
    val __obj = js.Dynamic.literal(newSize = newSize, oldSize = oldSize, target = target, `type` = `type`)
  
    __obj.asInstanceOf[ResizeEvent]
  }
}

