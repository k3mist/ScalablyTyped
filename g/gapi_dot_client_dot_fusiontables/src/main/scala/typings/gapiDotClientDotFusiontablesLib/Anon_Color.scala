package typings
package gapiDotClientDotFusiontablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  /** Color in #RRGGBB format. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the color: 0.0 (transparent) to 1.0 (opaque). */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: java.lang.String = null, opacity: scala.Int | scala.Double = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

