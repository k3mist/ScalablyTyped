package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeOptions extends js.Object {
  var arrowStrikethrough: js.UndefOr[scala.Boolean] = js.undefined
  var arrows: js.UndefOr[java.lang.String | visLib.Anon_From] = js.undefined
  var color: js.UndefOr[java.lang.String | visLib.Anon_Color] = js.undefined
  var dashes: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  var font: js.UndefOr[java.lang.String | visLib.Anon_Align] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var hoverWidth: js.UndefOr[scala.Double] = js.undefined
   // please note, hoverWidth could be also a function. This case is not represented here
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelHighlightBold: js.UndefOr[scala.Boolean] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var physics: js.UndefOr[scala.Boolean] = js.undefined
  var scaling: js.UndefOr[OptionsScaling] = js.undefined
  var selectionWidth: js.UndefOr[scala.Double] = js.undefined
   // please note, selectionWidth could be also a function. This case is not represented here
  var selfReferenceSize: js.UndefOr[scala.Double] = js.undefined
  var shadow: js.UndefOr[scala.Boolean | OptionsShadow] = js.undefined
  var smooth: js.UndefOr[scala.Boolean | visLib.Anon_EnabledForceDirection] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object EdgeOptions {
  @scala.inline
  def apply(
    arrowStrikethrough: js.UndefOr[scala.Boolean] = js.undefined,
    arrows: java.lang.String | visLib.Anon_From = null,
    color: java.lang.String | visLib.Anon_Color = null,
    dashes: scala.Boolean | js.Array[scala.Double] = null,
    font: java.lang.String | visLib.Anon_Align = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hoverWidth: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    labelHighlightBold: js.UndefOr[scala.Boolean] = js.undefined,
    length: scala.Int | scala.Double = null,
    physics: js.UndefOr[scala.Boolean] = js.undefined,
    scaling: OptionsScaling = null,
    selectionWidth: scala.Int | scala.Double = null,
    selfReferenceSize: scala.Int | scala.Double = null,
    shadow: scala.Boolean | OptionsShadow = null,
    smooth: scala.Boolean | visLib.Anon_EnabledForceDirection = null,
    title: java.lang.String = null,
    value: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): EdgeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowStrikethrough)) __obj.updateDynamic("arrowStrikethrough")(arrowStrikethrough)
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashes != null) __obj.updateDynamic("dashes")(dashes.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hoverWidth != null) __obj.updateDynamic("hoverWidth")(hoverWidth.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(labelHighlightBold)) __obj.updateDynamic("labelHighlightBold")(labelHighlightBold)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(physics)) __obj.updateDynamic("physics")(physics)
    if (scaling != null) __obj.updateDynamic("scaling")(scaling)
    if (selectionWidth != null) __obj.updateDynamic("selectionWidth")(selectionWidth.asInstanceOf[js.Any])
    if (selfReferenceSize != null) __obj.updateDynamic("selfReferenceSize")(selfReferenceSize.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeOptions]
  }
}

