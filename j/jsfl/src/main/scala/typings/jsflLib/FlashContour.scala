package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashContour extends js.Object {
  var fill: FlashFill
  var interior: scala.Boolean
  var orientation: scala.Double
  def getHalfEdge(): FlashHalfEdge
}

object FlashContour {
  @scala.inline
  def apply(
    fill: FlashFill,
    getHalfEdge: () => FlashHalfEdge,
    interior: scala.Boolean,
    orientation: scala.Double
  ): FlashContour = {
    val __obj = js.Dynamic.literal(fill = fill, getHalfEdge = js.Any.fromFunction0(getHalfEdge), interior = interior, orientation = orientation)
  
    __obj.asInstanceOf[FlashContour]
  }
}

