package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaCircleProps extends AreaBaseProps {
  /**
    * The circle's radius. Percentage values use the Area's width.
    */
  var r: scala.Double | java.lang.String
  /**
    * The x coordinate of the center of the cirle.
    */
  var x: scala.Double | java.lang.String
  /**
    * The y coordinate of the center of the cirle.
    */
  var y: scala.Double | java.lang.String
}

object AreaCircleProps {
  @scala.inline
  def apply(
    r: scala.Double | java.lang.String,
    x: scala.Double | java.lang.String,
    y: scala.Double | java.lang.String,
    align: protonDashNativeLib.Anon_H = null,
    column: scala.Int | scala.Double = null,
    expand: protonDashNativeLib.Anon_H = null,
    fill: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    row: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: java.lang.String = null,
    strokeLinecap: protonDashNativeLib.protonDashNativeLibStrings.flat | protonDashNativeLib.protonDashNativeLibStrings.round | protonDashNativeLib.protonDashNativeLibStrings.bevel = null,
    strokeLinejoin: protonDashNativeLib.protonDashNativeLibStrings.miter | protonDashNativeLib.protonDashNativeLibStrings.round | protonDashNativeLib.protonDashNativeLibStrings.bevel = null,
    strokeMiterlimit: scala.Int | scala.Double = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeWidth: scala.Int | scala.Double = null,
    transform: java.lang.String = null
  ): AreaCircleProps = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[AreaCircleProps]
  }
}

