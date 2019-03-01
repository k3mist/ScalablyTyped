package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var anchor: js.UndefOr[Anchor] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var offset: js.UndefOr[PointLike] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    anchor: Anchor = null,
    color: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    element: stdLib.HTMLElement = null,
    offset: PointLike = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (element != null) __obj.updateDynamic("element")(element)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

