package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSize extends js.Object {
  var fontFamily: java.lang.String
  var fontSize: java.lang.String
  var fontWeight: scala.Double
  var letterSpacing: scala.Double
  var lineHeight: java.lang.String
}

object Anon_FontFamilyFontSize {
  @scala.inline
  def apply(
    fontFamily: java.lang.String,
    fontSize: java.lang.String,
    fontWeight: scala.Double,
    letterSpacing: scala.Double,
    lineHeight: java.lang.String
  ): Anon_FontFamilyFontSize = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, fontSize = fontSize, fontWeight = fontWeight, letterSpacing = letterSpacing, lineHeight = lineHeight)
  
    __obj.asInstanceOf[Anon_FontFamilyFontSize]
  }
}

