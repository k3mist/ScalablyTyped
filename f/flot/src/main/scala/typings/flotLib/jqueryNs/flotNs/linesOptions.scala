package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait linesOptions extends seriesTypeBase {
  var steps: js.UndefOr[scala.Boolean] = js.undefined
}

object linesOptions {
  @scala.inline
  def apply(
    fill: js.Any = null,
    fillColor: js.Any = null,
    lineWidth: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    steps: js.UndefOr[scala.Boolean] = js.undefined
  ): linesOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[linesOptions]
  }
}

