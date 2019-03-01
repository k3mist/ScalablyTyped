package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var dark: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var light: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[
    grommetLib.grommetLibStrings.weak | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.strong | scala.Boolean
  ] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dark: scala.Boolean | java.lang.String = null,
    image: java.lang.String = null,
    light: java.lang.String = null,
    opacity: grommetLib.grommetLibStrings.weak | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.strong | scala.Boolean = null,
    position: java.lang.String = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (light != null) __obj.updateDynamic("light")(light)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Color]
  }
}

