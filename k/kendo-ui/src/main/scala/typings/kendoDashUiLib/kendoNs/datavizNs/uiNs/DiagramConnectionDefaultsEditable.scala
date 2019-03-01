package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsEditable extends js.Object {
  var drag: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  var tools: js.UndefOr[js.Array[DiagramConnectionDefaultsEditableTool]] = js.undefined
}

object DiagramConnectionDefaultsEditable {
  @scala.inline
  def apply(
    drag: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    tools: js.Array[DiagramConnectionDefaultsEditableTool] = null
  ): DiagramConnectionDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (tools != null) __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[DiagramConnectionDefaultsEditable]
  }
}

