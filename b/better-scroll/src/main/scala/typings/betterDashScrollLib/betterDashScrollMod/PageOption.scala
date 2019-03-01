package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageOption extends js.Object {
  var pageX: scala.Double
  var pageY: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object PageOption {
  @scala.inline
  def apply(pageX: scala.Double, pageY: scala.Double, x: scala.Double, y: scala.Double): PageOption = {
    val __obj = js.Dynamic.literal(pageX = pageX, pageY = pageY, x = x, y = y)
  
    __obj.asInstanceOf[PageOption]
  }
}

