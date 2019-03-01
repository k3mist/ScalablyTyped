package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsFill extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var gradient: js.UndefOr[DiagramShapeDefaultsFillGradient] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object DiagramShapeDefaultsFill {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    gradient: DiagramShapeDefaultsFillGradient = null,
    opacity: scala.Int | scala.Double = null
  ): DiagramShapeDefaultsFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsFill]
  }
}

