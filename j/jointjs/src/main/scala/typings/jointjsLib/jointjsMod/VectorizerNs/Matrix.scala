package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// modifiable Matrix. SVGMatrix doesn't allow set on properties or a constructor.
trait Matrix extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var c: scala.Double
  var d: scala.Double
  var e: scala.Double
  var f: scala.Double
}

object Matrix {
  @scala.inline
  def apply(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): Matrix = {
    val __obj = js.Dynamic.literal(a = a, b = b, c = c, d = d, e = e, f = f)
  
    __obj.asInstanceOf[Matrix]
  }
}

