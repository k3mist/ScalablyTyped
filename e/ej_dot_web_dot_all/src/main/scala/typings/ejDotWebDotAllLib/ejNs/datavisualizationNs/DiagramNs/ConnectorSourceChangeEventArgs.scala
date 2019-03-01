package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorSourceChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the change or not
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the state of connection end point dragging(starting, dragging, completed)
    */
  var dragState: js.UndefOr[java.lang.String] = js.undefined
  /** returns the connector, the source point of which is being dragged
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the source node of the element
    */
  var node: js.UndefOr[js.Any] = js.undefined
  /** returns the source point of the element
    */
  var point: js.UndefOr[js.Any] = js.undefined
  /** returns the source port of the element
    */
  var port: js.UndefOr[js.Any] = js.undefined
}

object ConnectorSourceChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    diagramId: java.lang.String = null,
    dragState: java.lang.String = null,
    element: js.Any = null,
    node: js.Any = null,
    point: js.Any = null,
    port: js.Any = null
  ): ConnectorSourceChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (dragState != null) __obj.updateDynamic("dragState")(dragState)
    if (element != null) __obj.updateDynamic("element")(element)
    if (node != null) __obj.updateDynamic("node")(node)
    if (point != null) __obj.updateDynamic("point")(point)
    if (port != null) __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[ConnectorSourceChangeEventArgs]
  }
}

