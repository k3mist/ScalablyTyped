package typings
package reactDashVirtualizedLib.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeInfo extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object SizeInfo {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): SizeInfo = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[SizeInfo]
  }
}

