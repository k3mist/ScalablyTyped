package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the property change or not
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the action is nudge or not
    */
  var cause: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the selected element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new value of the node property that is being changed
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the old value of the property that is being changed
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the name of the property that is changed
    */
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
}

object PropertyChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cause: java.lang.String = null,
    diagramId: java.lang.String = null,
    element: js.Any = null,
    newValue: js.Any = null,
    oldValue: js.Any = null,
    propertyName: java.lang.String = null
  ): PropertyChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName)
    __obj.asInstanceOf[PropertyChangeEventArgs]
  }
}

