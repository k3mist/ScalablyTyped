package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsSelection extends js.Object {
  var handles: js.UndefOr[DiagramConnectionDefaultsSelectionHandles] = js.undefined
}

object DiagramConnectionDefaultsSelection {
  @scala.inline
  def apply(handles: DiagramConnectionDefaultsSelectionHandles = null): DiagramConnectionDefaultsSelection = {
    val __obj = js.Dynamic.literal()
    if (handles != null) __obj.updateDynamic("handles")(handles)
    __obj.asInstanceOf[DiagramConnectionDefaultsSelection]
  }
}

