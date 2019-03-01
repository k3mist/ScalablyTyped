package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelOption extends js.Object {
  var adjustTime: scala.Double
  var rotate: scala.Double
  var selectedIndex: scala.Double
  var wheelItemClass: java.lang.String
  var wheelWrapperClass: java.lang.String
}

object WheelOption {
  @scala.inline
  def apply(
    adjustTime: scala.Double,
    rotate: scala.Double,
    selectedIndex: scala.Double,
    wheelItemClass: java.lang.String,
    wheelWrapperClass: java.lang.String
  ): WheelOption = {
    val __obj = js.Dynamic.literal(adjustTime = adjustTime, rotate = rotate, selectedIndex = selectedIndex, wheelItemClass = wheelItemClass, wheelWrapperClass = wheelWrapperClass)
  
    __obj.asInstanceOf[WheelOption]
  }
}

