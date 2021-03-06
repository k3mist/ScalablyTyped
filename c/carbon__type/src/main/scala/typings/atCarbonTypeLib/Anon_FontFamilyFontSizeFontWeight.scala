package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSizeFontWeight extends js.Object {
  var `@media (min-width: 42rem)`: Anon_FontSize
  var `@media (min-width: 66rem)`: Anon_FontSize
  var `@media (min-width: 82rem)`: Anon_FontSizeLineHeight
  var `@media (min-width: 99rem)`: Anon_FontSizeLineHeight
  var fontFamily: java.lang.String
  var fontSize: java.lang.String
  var fontWeight: scala.Double
  var letterSpacing: scala.Double
  var lineHeight: java.lang.String
}

object Anon_FontFamilyFontSizeFontWeight {
  @scala.inline
  def apply(
    `@media (min-width: 42rem)`: Anon_FontSize,
    `@media (min-width: 66rem)`: Anon_FontSize,
    `@media (min-width: 82rem)`: Anon_FontSizeLineHeight,
    `@media (min-width: 99rem)`: Anon_FontSizeLineHeight,
    fontFamily: java.lang.String,
    fontSize: java.lang.String,
    fontWeight: scala.Double,
    letterSpacing: scala.Double,
    lineHeight: java.lang.String
  ): Anon_FontFamilyFontSizeFontWeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, fontSize = fontSize, fontWeight = fontWeight, letterSpacing = letterSpacing, lineHeight = lineHeight)
    __obj.updateDynamic("@media (min-width: 42rem)")(`@media (min-width: 42rem)`)
    __obj.updateDynamic("@media (min-width: 66rem)")(`@media (min-width: 66rem)`)
    __obj.updateDynamic("@media (min-width: 82rem)")(`@media (min-width: 82rem)`)
    __obj.updateDynamic("@media (min-width: 99rem)")(`@media (min-width: 99rem)`)
    __obj.asInstanceOf[Anon_FontFamilyFontSizeFontWeight]
  }
}

