package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillHeight extends js.Object {
  /**
    * Color filled in this element.
    *
    *
    * @default
    * '#000'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.fill
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the shape of the element.
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.height
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify contant of the image, can be a URL, or
    * [dataURI](https://tools.ietf.org/html/rfc2397)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.image
    */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of stroke.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.lineWidth
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * color of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.shadowColor
    */
  var shadowColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * X offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Y offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Color of stroke.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.stroke
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.x
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image.style.y
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FillHeight {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    image: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: scala.Int | scala.Double = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_FillHeight = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FillHeight]
  }
}

