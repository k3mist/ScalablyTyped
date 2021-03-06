package typings
package geometryDashDomLib.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectList extends js.Object {
  /**
    * total number of DOMRect objects associated with the object.
    * readonly unsigned long length
    */
  var length: scala.Double
  /**
    * the DOMRect object at index must be returned.
    * @param index
    */
  def item(index: scala.Double): DOMRect
}

object DOMRectList {
  @scala.inline
  def apply(item: scala.Double => DOMRect, length: scala.Double): DOMRectList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length)
  
    __obj.asInstanceOf[DOMRectList]
  }
}

