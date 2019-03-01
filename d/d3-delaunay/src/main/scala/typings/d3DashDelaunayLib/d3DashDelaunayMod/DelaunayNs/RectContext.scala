package typings
package d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the rect() method of the CanvasPathMethods API.
  */
trait RectContext extends js.Object {
  /**
    * rect() method of the CanvasPathMethods API.
    */
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit
}

object RectContext {
  @scala.inline
  def apply(rect: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit]): RectContext = {
    val __obj = js.Dynamic.literal(rect = rect)
  
    __obj.asInstanceOf[RectContext]
  }
}

