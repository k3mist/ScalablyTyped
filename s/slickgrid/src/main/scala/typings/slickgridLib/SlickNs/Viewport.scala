package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var bottom: scala.Double
  var leftPx: scala.Double
  var rightPx: scala.Double
  var top: scala.Double
}

object Viewport {
  @scala.inline
  def apply(bottom: scala.Double, leftPx: scala.Double, rightPx: scala.Double, top: scala.Double): Viewport = {
    val __obj = js.Dynamic.literal(bottom = bottom, leftPx = leftPx, rightPx = rightPx, top = top)
  
    __obj.asInstanceOf[Viewport]
  }
}

