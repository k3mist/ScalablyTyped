package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEnterEventArgs extends js.Object {
  /** parameter returns whether to add or remove the symbol from diagram
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node or connector that is dragged into diagram
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object DragEnterEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    diagramId: java.lang.String = null,
    element: js.Any = null
  ): DragEnterEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[DragEnterEventArgs]
  }
}

