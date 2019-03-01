package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis extends js.Object {
  /**
    * Horizontal alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'left'`
    * + `'center'`
    * + `'right'`
    *
    * If `align` is not set in `rich`, `align` in parent
    * level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.data.emphasis.upperLabel)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.align
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Background color of the text fregment.
    *
    * Can be color string, like `'#123234'`, `'red'`, `rgba(0,23,11,0.3)'`.
    *
    * Or image can be used, for example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.data.emphasis.upperLabel)
    *
    * `width` or `height` can be specified when using background
    * image, or auto adapted by default.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.backgroundColor
    */
  var backgroundColor: js.UndefOr[js.Object | java.lang.String] = js.undefined
  /**
    * Border color of the text fregment.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.borderColor
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Border radius of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.borderRadius
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Border width of the text fregment.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.borderWidth
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * text color.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * ""#fff""
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Distance to the host graphic element.
    * Works when position is string value (like `'top'`、`'insideRight'`).
    *
    * See:
    * [label position](https://ecomfe.github.io/echarts-examples/public/editor.html?c=doc-example/label-position)
    * .
    *
    *
    * @default
    * 5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.distance
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * When the text is overflow, whether to replace the
    * excess part with apostrophe.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.ellipsis
    */
  var ellipsis: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.fontFamily
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * font size
    *
    *
    * @default
    * 12
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.fontSize
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * font style
    *
    * Options are:
    *
    * + `'normal'`
    * + `'italic'`
    * + `'oblique'`
    *
    *
    * @default
    * "normal"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.fontStyle
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * font thick weight
    *
    * Options are:
    *
    * + `'normal'`
    * + `'bold'`
    * + `'bolder'`
    * + `'lighter'`
    * + 100 | 200 | 300 | 400...
    *
    *
    * @default
    * "normal"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.fontWeight
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data label formatter, which supports string template
    * and callback function.
    * In either form, `\n` is supported to represent a
    * new line.
    *
    * **String template**
    *
    * Model variation includes:
    *
    * + `{a}`: series name.
    * + `{b}`: the name of a data item.
    * + `{c}`: the value of a data item.
    * + `{@xxx}: the value of a dimension named`'xxx'`,
    * for example,`{@product}`refers the value of`'product'\`
    * dimension。
    * + `{@[n]}: the value of a dimension at the index
    * of`n`, for example,`{@\[3\]}\` refers the value at
    * dimensions\[3\].
    *
    * **example:**
    *
    * ```
    * formatter: '{b}: {@score}'
    *
    * ```
    *
    * **Callback function**
    *
    * Callback function is in form of:
    *
    * ```
    * (params: Object|Array) => string
    *
    * ```
    *
    * where `params` is the single dataset needed by formatter,
    * which is formed as:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.data.emphasis.upperLabel)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.formatter
    */
  var formatter: js.UndefOr[js.Function | java.lang.String] = js.undefined
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like using background
    * image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight`
    * in parent level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.data.emphasis.upperLabel)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.lineHeight
    */
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to move text slightly.
    * For example: `[30, 40]` means move `30` horizontally
    * and move `40` vertically.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.offset
    */
  var offset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Padding of the text fregment, for example:
    *
    * + `padding: [3, 4, 5, 6]`: represents padding of
    * `[top, right, bottom, left]`.
    * + `padding: 4`: represents `padding: [4, 4, 4, 4]`.
    * + `padding: [3, 4]`: represents `padding: [3, 4,
    * 3, 4]`.
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.padding
    */
  var padding: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * Label position.
    *
    * **Followings are the options:**
    *
    * + \[x, y\]
    *
    * Use relative percentage, or absolute pixel values
    * to represent position of label relative to top-left
    * corner of bounding box. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.data.emphasis.upperLabel)
    *
    * + 'top'
    *
    * + 'left'
    * + 'right'
    * + 'bottom'
    * + 'inside'
    * + 'insideLeft'
    * + 'insideRight'
    * + 'insideTop'
    * + 'insideBottom'
    * + 'insideTopLeft'
    * + 'insideBottomLeft'
    * + 'insideTopRight'
    * + 'insideBottomRight'
    *
    * See:
    * [label position](https://ecomfe.github.io/echarts-examples/public/view.html?c=doc-example/label-position)
    * .
    *
    *
    * @default
    * "inside"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.position
    */
  var position: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
  /**
    * "Rich text styles" can be defined in this `rich`
    * property. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.data.emphasis.upperLabel)
    *
    * For more details, see
    * [Rich Text](https://ecomfe.github.io/echarts-doc/public/en/option.htmltutorial.html#Rich%20Text)
    * please.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.rich
    */
  var rich: /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E
    */
  js.UndefOr[
    /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E
    */
  org.scalablytyped.runtime.StringDictionary[Anon_Align]
  ] = js.undefined
  /**
    * Rotate label, from -90 degree to 90, positive value
    * represents rotate anti-clockwise.
    *
    * See:
    * [label rotation](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-label-rotation)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.rotate
    */
  var rotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show blur of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color of the text block.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shadow X offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow Y offset of the text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to show label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.show
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Storke color of the text.
    *
    * If set as `'auto'`, the color will assigned as visual
    * color, such as series color.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.textBorderColor
    */
  var textBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Storke line width of the text.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.textShadowColor
    */
  var textShadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Vertical alignment of text, automatic by default.
    *
    * Options are:
    *
    * + `'top'`
    * + `'middle'`
    * + `'bottom'`
    *
    * If `verticalAlign` is not set in `rich`, `verticalAlign`
    * in parent level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.data.emphasis.upperLabel)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.verticalAlign
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify it.
    * You may want to use it in some cases like make simple
    * table or using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * `width` can also be percent string, like `'100%'`,
    * which represents the percent of `contentWidth` (that
    * is, the width without `padding`) of its container
    * box.
    * It is based on `contentWidth` because that each text
    * fregment is layout based on the `content box`, where
    * it makes no sense that calculating width based on
    * `outerWith` in prectice.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.width
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    backgroundColor: js.Object | java.lang.String = null,
    borderColor: java.lang.String = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    distance: scala.Int | scala.Double = null,
    ellipsis: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    formatter: js.Function | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    lineHeight: scala.Int | scala.Double = null,
    offset: js.Array[_] = null,
    padding: js.Array[_] | scala.Double = null,
    position: js.Array[_] | java.lang.String = null,
    rich: /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel.rich.%3Cuser%20defined%20style%20name%3E
    */
  org.scalablytyped.runtime.StringDictionary[Anon_Align] = null,
    rotate: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    textBorderColor: java.lang.String = null,
    textBorderWidth: scala.Int | scala.Double = null,
    textShadowBlur: scala.Int | scala.Double = null,
    textShadowColor: java.lang.String = null,
    textShadowOffsetX: scala.Int | scala.Double = null,
    textShadowOffsetY: scala.Int | scala.Double = null,
    verticalAlign: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rich != null) __obj.updateDynamic("rich")(rich)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor)
    if (textBorderWidth != null) __obj.updateDynamic("textBorderWidth")(textBorderWidth.asInstanceOf[js.Any])
    if (textShadowBlur != null) __obj.updateDynamic("textShadowBlur")(textShadowBlur.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor)
    if (textShadowOffsetX != null) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.asInstanceOf[js.Any])
    if (textShadowOffsetY != null) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis]
  }
}

