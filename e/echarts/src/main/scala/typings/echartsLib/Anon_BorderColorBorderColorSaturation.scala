package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorBorderColorSaturation extends js.Object {
  /**
    * The border color and gap color of a node.
    *
    *
    * @default
    * "#fff',"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color saturation of a border or gap.
    * The value range is between 0 ~ 1.
    *
    * Tips:
    *
    * When `borderColorSaturation` is set, the `borderColor`
    * is disabled, and, instead, the final border color is
    * calculated based on the color of this node (this color
    * could be sepcified explicitly or inherited from its parent
    * node) and mixing with `borderColorSaturation`.
    *
    * In this way, a effect can be implemented: different sections
    * have different hue of gap color repectively, which makes
    * users easy to distinguish both sections and levels.
    *
    * **How to avoid confusion by setting border/gap of node**
    *
    * If all of the border/gaps are set with the same color,
    * confusion might occur when rectangulars in different
    * levels display at the same time.
    *
    * See the
    * [example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=doc-example/treemap-borderColor&edit=1&reset=1)
    *
    * Noticed that the child rectangles in the red area are
    * in the deeper level than rectangles that are saparated
    * by white gap.
    * So in the red area, basically we set gap color with red,
    * and use `borderColorSaturation` to lift the saturation.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.borderColorSaturation
    */
  var borderColorSaturation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The border width of a node.
    * There is no border when it is set as `0`.
    *
    * Tip, gaps between child nodes are specified by
    * [gapWidth](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.gapWidth)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of a node. It use global palette
    * [option.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#color)
    * by default.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tranparent rate of a node, the range is between 0
    * ~ 1.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.colorAlpha
    */
  var colorAlpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color saturation of a node.
    * The range is between 0 ~ 1.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.colorSaturation
    */
  var colorSaturation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Gaps between child nodes.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.gapWidth
    */
  var gapWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Stroke color of each rect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.strokeColor
    */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Stroke width of each rect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.itemStyle.strokeWidth
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BorderColorBorderColorSaturation {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    borderColorSaturation: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    colorAlpha: scala.Int | scala.Double = null,
    colorSaturation: scala.Int | scala.Double = null,
    gapWidth: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null
  ): Anon_BorderColorBorderColorSaturation = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderColorSaturation != null) __obj.updateDynamic("borderColorSaturation")(borderColorSaturation)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorAlpha != null) __obj.updateDynamic("colorAlpha")(colorAlpha.asInstanceOf[js.Any])
    if (colorSaturation != null) __obj.updateDynamic("colorSaturation")(colorSaturation.asInstanceOf[js.Any])
    if (gapWidth != null) __obj.updateDynamic("gapWidth")(gapWidth.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColorBorderColorSaturation]
  }
}

