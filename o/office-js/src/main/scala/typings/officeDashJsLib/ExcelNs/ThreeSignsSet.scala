package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeSignsSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var greenCircle: Icon
  var redDiamond: Icon
  var yellowTriangle: Icon
}

object ThreeSignsSet {
  @scala.inline
  def apply(
    greenCircle: Icon,
    redDiamond: Icon,
    yellowTriangle: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): ThreeSignsSet = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle, redDiamond = redDiamond, yellowTriangle = yellowTriangle)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeSignsSet]
  }
}

