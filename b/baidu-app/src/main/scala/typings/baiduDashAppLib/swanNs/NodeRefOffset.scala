package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefOffset extends js.Object {
  /** 节点的dataset */
  var dataset: js.Any
  /** 节点的ID */
  var id: java.lang.String
  /** 节点的水平滚动位置 */
  var scrollLeft: scala.Double
  /** 节点的竖直滚动位置 */
  var scrollTop: scala.Double
}

object NodeRefOffset {
  @scala.inline
  def apply(dataset: js.Any, id: java.lang.String, scrollLeft: scala.Double, scrollTop: scala.Double): NodeRefOffset = {
    val __obj = js.Dynamic.literal(dataset = dataset, id = id, scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[NodeRefOffset]
  }
}

