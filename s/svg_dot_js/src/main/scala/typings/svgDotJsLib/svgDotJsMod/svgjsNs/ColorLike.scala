package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// color.js
trait ColorLike extends js.Object {
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object ColorLike {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, r: scala.Double): ColorLike = {
    val __obj = js.Dynamic.literal(b = b, g = g, r = r)
  
    __obj.asInstanceOf[ColorLike]
  }
}

