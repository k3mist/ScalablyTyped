package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clockwise extends js.Object {
  /**
    * Whether draw clockwise.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc.shape.clockwise
    */
  var clockwise: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The x value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc.shape.cx
    */
  var cx: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc.shape.cy
    */
  var cy: js.UndefOr[scala.Double] = js.undefined
  /**
    * end anble, in radian.
    *
    *
    * @default
    * "Math.PI * 2"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc.shape.endAngle
    */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Outside radius.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc.shape.r
    */
  var r: js.UndefOr[scala.Double] = js.undefined
  /**
    * Inside radius.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc.shape.r0
    */
  var r0: js.UndefOr[scala.Double] = js.undefined
  /**
    * start angle, in radian.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc.shape.startAngle
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Clockwise {
  @scala.inline
  def apply(
    clockwise: js.UndefOr[scala.Boolean] = js.undefined,
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    endAngle: scala.Int | scala.Double = null,
    r: scala.Int | scala.Double = null,
    r0: scala.Int | scala.Double = null,
    startAngle: scala.Int | scala.Double = null
  ): Anon_Clockwise = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise)
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (r0 != null) __obj.updateDynamic("r0")(r0.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clockwise]
  }
}

