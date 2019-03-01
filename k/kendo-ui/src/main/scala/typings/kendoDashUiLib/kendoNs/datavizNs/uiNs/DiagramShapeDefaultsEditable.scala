package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsEditable extends js.Object {
  var connect: js.UndefOr[scala.Boolean] = js.undefined
  var drag: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  var tools: js.UndefOr[js.Array[DiagramShapeDefaultsEditableTool]] = js.undefined
}

object DiagramShapeDefaultsEditable {
  @scala.inline
  def apply(
    connect: js.UndefOr[scala.Boolean] = js.undefined,
    drag: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    tools: js.Array[DiagramShapeDefaultsEditableTool] = null
  ): DiagramShapeDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect)
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (tools != null) __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[DiagramShapeDefaultsEditable]
  }
}

