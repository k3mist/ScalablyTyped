package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaletteColor extends js.Object {
  var contrastText: java.lang.String
  var dark: java.lang.String
  var light: java.lang.String
  var main: java.lang.String
}

object PaletteColor {
  @scala.inline
  def apply(
    contrastText: java.lang.String,
    dark: java.lang.String,
    light: java.lang.String,
    main: java.lang.String
  ): PaletteColor = {
    val __obj = js.Dynamic.literal(contrastText = contrastText, dark = dark, light = light, main = main)
  
    __obj.asInstanceOf[PaletteColor]
  }
}

