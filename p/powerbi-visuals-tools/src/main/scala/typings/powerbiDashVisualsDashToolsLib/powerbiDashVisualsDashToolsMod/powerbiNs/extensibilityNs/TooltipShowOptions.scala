package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipShowOptions extends TooltipMoveOptions {
  @JSName("dataItems")
  var dataItems_TooltipShowOptions: js.Array[VisualTooltipDataItem]
}

object TooltipShowOptions {
  @scala.inline
  def apply(
    coordinates: js.Array[scala.Double],
    dataItems: js.Array[VisualTooltipDataItem],
    identities: js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
    ],
    isTouchEvent: scala.Boolean
  ): TooltipShowOptions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates, dataItems = dataItems, identities = identities, isTouchEvent = isTouchEvent)
  
    __obj.asInstanceOf[TooltipShowOptions]
  }
}

