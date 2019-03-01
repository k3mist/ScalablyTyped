package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var SVGHeight: scala.Double
  var SVGWidth: scala.Double
  var a: scala.Double
  var b: scala.Double
  var c: scala.Double
  var d: scala.Double
  var e: scala.Double
  var endX: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var endY: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var f: scala.Double
  var focus: scala.Boolean
  var mode: Mode
  var startX: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var startY: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var version: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibNumbers.`2`
  var viewerHeight: scala.Double
  var viewerWidth: scala.Double
}

object Value {
  @scala.inline
  def apply(
    SVGHeight: scala.Double,
    SVGWidth: scala.Double,
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double,
    focus: scala.Boolean,
    mode: Mode,
    version: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibNumbers.`2`,
    viewerHeight: scala.Double,
    viewerWidth: scala.Double,
    endX: scala.Int | scala.Double = null,
    endY: scala.Int | scala.Double = null,
    startX: scala.Int | scala.Double = null,
    startY: scala.Int | scala.Double = null
  ): Value = {
    val __obj = js.Dynamic.literal(SVGHeight = SVGHeight, SVGWidth = SVGWidth, a = a, b = b, c = c, d = d, e = e, f = f, focus = focus, mode = mode, version = version, viewerHeight = viewerHeight, viewerWidth = viewerWidth)
    if (endX != null) __obj.updateDynamic("endX")(endX.asInstanceOf[js.Any])
    if (endY != null) __obj.updateDynamic("endY")(endY.asInstanceOf[js.Any])
    if (startX != null) __obj.updateDynamic("startX")(startX.asInstanceOf[js.Any])
    if (startY != null) __obj.updateDynamic("startY")(startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

