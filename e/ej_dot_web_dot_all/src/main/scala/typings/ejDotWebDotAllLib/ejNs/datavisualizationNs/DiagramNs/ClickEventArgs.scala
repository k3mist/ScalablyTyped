package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventArgs extends js.Object {
  /** parameter returns the object that is actually clicked
    */
  var actualObject: js.UndefOr[scala.Double] = js.undefined
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the count of how many times the mouse button is pressed
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the clicked node, connector or diagram
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the event triggered
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the horizontal coordinate of the mouse pointer, relative to the diagram
    */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /** parameter returns  the vertical coordinate of the mouse pointer, relative to the diagram
    */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
}

object ClickEventArgs {
  @scala.inline
  def apply(
    actualObject: scala.Int | scala.Double = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    diagramId: java.lang.String = null,
    element: js.Any = null,
    event: js.Any = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null
  ): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actualObject != null) __obj.updateDynamic("actualObject")(actualObject.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (event != null) __obj.updateDynamic("event")(event)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickEventArgs]
  }
}

