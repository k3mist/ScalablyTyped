package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  var clip: js.UndefOr[Path] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var fill: js.UndefOr[FillOptions] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[StrokeOptions] = js.undefined
  var tooltip: js.UndefOr[TooltipOptions] = js.undefined
  var transform: js.UndefOr[kendoDashUiLib.kendoNs.geometryNs.Transformation] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    clip: Path = null,
    cursor: java.lang.String = null,
    fill: FillOptions = null,
    font: java.lang.String = null,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    stroke: StrokeOptions = null,
    tooltip: TooltipOptions = null,
    transform: kendoDashUiLib.kendoNs.geometryNs.Transformation = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TextOptions]
  }
}

