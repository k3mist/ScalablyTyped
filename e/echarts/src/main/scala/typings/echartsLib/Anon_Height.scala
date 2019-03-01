package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_rect.shape.height
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify border radius of the rectangular here.
    * Generally, `r` should be `[topLeftRadius, topRightRadius,
    * BottomRightRadius, bottomLeftRadius]`, where each
    * item is a number.
    *
    * Abbreviation is enabled, for example:
    *
    * + `r`: `1` means `[1, 1, 1, 1]`
    * + `r`: `[1]` means `[1, 1, 1, 1]`
    * + `r`: `[1, 2]` means `[1, 2, 1, 2]`
    * + `r`: `[1, 2, 3]` means `[1, 2, 3, 2]`
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_rect.shape.r
    */
  var r: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_rect.shape.width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_rect.shape.x
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_rect.shape.y
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    r: js.Array[_] = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

