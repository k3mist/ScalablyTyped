package typings
package webcolaLib.distSrcRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNode extends Leaf {
  var fixed: scala.Boolean
  var fixedWeight: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var px: scala.Double
  var py: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object GraphNode {
  @scala.inline
  def apply(
    bounds: Rectangle,
    fixed: scala.Boolean,
    height: scala.Double,
    px: scala.Double,
    py: scala.Double,
    variable: webcolaLib.distSrcVpscMod.Variable,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    fixedWeight: scala.Int | scala.Double = null
  ): GraphNode = {
    val __obj = js.Dynamic.literal(bounds = bounds, fixed = fixed, height = height, px = px, py = py, variable = variable, width = width, x = x, y = y)
    if (fixedWeight != null) __obj.updateDynamic("fixedWeight")(fixedWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNode]
  }
}

