package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOpacity extends js.Object {
  /**
  			 * Color to tint the image with
  			 * @default #000000
  			 */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity value that controls the tint effect's transparency (0..1) */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColorOpacity {
  @scala.inline
  def apply(color: java.lang.String = null, opacity: scala.Int | scala.Double = null): Anon_ColorOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorOpacity]
  }
}

