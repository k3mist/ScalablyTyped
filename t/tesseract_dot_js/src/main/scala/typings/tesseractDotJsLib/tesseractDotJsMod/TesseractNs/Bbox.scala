package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bbox extends js.Object {
  var x0: scala.Double
  var x1: scala.Double
  var y0: scala.Double
  var y1: scala.Double
}

object Bbox {
  @scala.inline
  def apply(x0: scala.Double, x1: scala.Double, y0: scala.Double, y1: scala.Double): Bbox = {
    val __obj = js.Dynamic.literal(x0 = x0, x1 = x1, y0 = y0, y1 = y1)
  
    __obj.asInstanceOf[Bbox]
  }
}

