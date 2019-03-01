package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends NodeOptions {
  var id: js.UndefOr[IdType] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    borderWidth: scala.Int | scala.Double = null,
    borderWidthSelected: scala.Int | scala.Double = null,
    brokenImage: java.lang.String = null,
    color: java.lang.String | Color = null,
    fixed: scala.Boolean | visLib.Anon_X = null,
    font: java.lang.String | visLib.Anon_Align = null,
    group: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    icon: visLib.Anon_Code = null,
    id: IdType = null,
    image: java.lang.String | Image = null,
    label: java.lang.String = null,
    labelHighlightBold: js.UndefOr[scala.Boolean] = js.undefined,
    level: scala.Int | scala.Double = null,
    mass: scala.Int | scala.Double = null,
    physics: js.UndefOr[scala.Boolean] = js.undefined,
    scaling: OptionsScaling = null,
    shadow: scala.Boolean | OptionsShadow = null,
    shape: java.lang.String = null,
    shapeProperties: visLib.Anon_BorderDashes = null,
    size: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    value: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (borderWidthSelected != null) __obj.updateDynamic("borderWidthSelected")(borderWidthSelected.asInstanceOf[js.Any])
    if (brokenImage != null) __obj.updateDynamic("brokenImage")(brokenImage)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(labelHighlightBold)) __obj.updateDynamic("labelHighlightBold")(labelHighlightBold)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (!js.isUndefined(physics)) __obj.updateDynamic("physics")(physics)
    if (scaling != null) __obj.updateDynamic("scaling")(scaling)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

