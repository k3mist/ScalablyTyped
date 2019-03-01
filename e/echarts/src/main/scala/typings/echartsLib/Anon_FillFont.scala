package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillFont extends js.Object {
  /**
    * Color filled in this element.
    *
    *
    * @default
    * '#000'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.fill
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Font size, font type, font weight, font color, follow
    * the form of
    * [css font](https://developer.mozilla.org/en-US/docs/Web/CSS/font)
    * .
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.return_text.style)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.font
    */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of stroke.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.lineWidth
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * color of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.shadowColor
    */
  var shadowColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * X offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Y offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Color of stroke.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.stroke
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content. `\n` can be used as a line break.
    *
    *
    * @default
    * ''
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.text
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text horizontal alignment.
    * Optional values: `'left'`, `'center'`, `'right'`.
    *
    * `'left'` means the left side of the text block is
    * specified by the
    * [style.x](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.x)
    * , while `'right'` means the right side of the text
    * block is specified by
    * [style.y](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.y)
    * .
    *
    *
    * @default
    * "left"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.textAlign
    */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text vertical alignment.
    * Optional values: `'top'`, `'middle'`, `'bottom'`.
    *
    * More attributes in `style` (for example,
    * [rich text](https://ecomfe.github.io/echarts-doc/public/en/tutorial.html#Rich%20Text)
    * ), see the `style` related attributes in
    * [zrender/graphic/Displayable](https://ecomfe.github.io/zrender-doc/public/api.html#zrenderdisplayable)
    * .
    *
    * Notice, the attribute names of the `style` of graphic
    * elements is derived from `zrender`, which may be
    * different from the attribute names in `echarts label`,
    * `echarts itemStyle`, etc.,
    * although they have the same meaning. For example:
    *
    * + [itemStyle.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label.color)
    * => `style.fill`
    * + [itemStyle.borderColor](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label.color)
    * => `style.stroke`
    * + [label.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label.color)
    * => `style.textFill`
    * + [label.textBorderColor](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label.textBorderColor)
    * => `style.textStroke`
    * + ...
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.textVerticalAlign
    */
  var textVerticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.x
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text.style.y
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FillFont {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    font: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: scala.Int | scala.Double = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    text: java.lang.String = null,
    textAlign: java.lang.String = null,
    textVerticalAlign: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_FillFont = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textVerticalAlign != null) __obj.updateDynamic("textVerticalAlign")(textVerticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FillFont]
  }
}

