package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCollectionChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the collection change or not
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns whether the node is to be added or removed
    */
  var changeType: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node which needs to be added or deleted
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** triggers before and after adding the node in the diagram which can be differentiated through `state` argument. We can cancel the event only before adding the node
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object NodeCollectionChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    changeType: java.lang.String = null,
    diagramId: java.lang.String = null,
    element: js.Any = null,
    state: java.lang.String = null
  ): NodeCollectionChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (changeType != null) __obj.updateDynamic("changeType")(changeType)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[NodeCollectionChangeEventArgs]
  }
}

