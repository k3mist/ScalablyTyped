package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusOptions extends ViewPortOptions {
  /**
    * Locked denotes whether or not the view remains locked to
    * the node once the zoom-in animation is finished.
    * Default value is true.
    */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
}

object FocusOptions {
  @scala.inline
  def apply(
    animation: AnimationOptions | scala.Boolean = null,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    offset: Position = null,
    scale: scala.Int | scala.Double = null
  ): FocusOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOptions]
  }
}

