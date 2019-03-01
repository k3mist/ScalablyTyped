package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgEllipseProps extends SvgCommonProps {
  var cx: scala.Double | java.lang.String
  var cy: scala.Double | java.lang.String
  var rx: scala.Double | java.lang.String
  var ry: scala.Double | java.lang.String
}

object SvgEllipseProps {
  @scala.inline
  def apply(
    cx: scala.Double | java.lang.String,
    cy: scala.Double | java.lang.String,
    rx: scala.Double | java.lang.String,
    ry: scala.Double | java.lang.String,
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    fillOpacity: scala.Double | java.lang.String = null,
    fillRule: expoLib.expoLibStrings.nonzero | expoLib.expoLibStrings.evenodd = null,
    id: java.lang.String = null,
    onLongPress: js.Function0[_] = null,
    onPress: js.Function0[_] = null,
    onPressIn: js.Function0[_] = null,
    onPressOut: js.Function0[_] = null,
    opacity: scala.Double | java.lang.String = null,
    origin: scala.Double | java.lang.String = null,
    originX: scala.Double | java.lang.String = null,
    originY: scala.Double | java.lang.String = null,
    rotate: scala.Double | java.lang.String = null,
    rotation: scala.Double | java.lang.String = null,
    scale: scala.Double | java.lang.String = null,
    stroke: java.lang.String = null,
    strokeDasharray: js.Array[_] = null,
    strokeDashoffset: js.Any = null,
    strokeLineJoin: java.lang.String = null,
    strokeLinecap: java.lang.String = null,
    strokeOpacity: scala.Double | java.lang.String = null,
    strokeWidth: scala.Double | java.lang.String = null,
    transform: java.lang.String | js.Object = null,
    x: scala.Double | java.lang.String = null,
    y: scala.Double | java.lang.String = null
  ): SvgEllipseProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(onPressIn)
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(onPressOut)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray)
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset)
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin)
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgEllipseProps]
  }
}

