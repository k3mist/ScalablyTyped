package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerType extends js.Object {
  var coordinates: Point
}

object MarkerType {
  @scala.inline
  def apply(coordinates: Point): MarkerType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
  
    __obj.asInstanceOf[MarkerType]
  }
}

