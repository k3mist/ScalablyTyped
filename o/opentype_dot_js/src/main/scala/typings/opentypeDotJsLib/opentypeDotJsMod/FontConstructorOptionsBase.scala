package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontConstructorOptionsBase extends js.Object {
  var ascender: scala.Double
  var descender: scala.Double
  var familyName: java.lang.String
  var styleName: java.lang.String
  var unitsPerEm: scala.Double
}

object FontConstructorOptionsBase {
  @scala.inline
  def apply(
    ascender: scala.Double,
    descender: scala.Double,
    familyName: java.lang.String,
    styleName: java.lang.String,
    unitsPerEm: scala.Double
  ): FontConstructorOptionsBase = {
    val __obj = js.Dynamic.literal(ascender = ascender, descender = descender, familyName = familyName, styleName = styleName, unitsPerEm = unitsPerEm)
  
    __obj.asInstanceOf[FontConstructorOptionsBase]
  }
}

