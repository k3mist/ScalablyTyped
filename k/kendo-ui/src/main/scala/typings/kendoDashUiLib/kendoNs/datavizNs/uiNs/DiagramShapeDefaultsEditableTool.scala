package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsEditableTool extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object DiagramShapeDefaultsEditableTool {
  @scala.inline
  def apply(name: java.lang.String = null, step: scala.Int | scala.Double = null): DiagramShapeDefaultsEditableTool = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsEditableTool]
  }
}

