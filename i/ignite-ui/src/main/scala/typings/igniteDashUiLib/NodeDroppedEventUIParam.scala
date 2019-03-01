package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDroppedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the binding object for the level at which the target node is located.
  	 */
  var binding: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the target node data.
  	 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the draggable element (the node).
  	 */
  var draggable: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the jQuery element of the node.
  	 */
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the helper.
  	 */
  var helper: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the offset.
  	 */
  var offset: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the target node data-path attribute.
  	 */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the current position of the draggable element.
  	 */
  var position: js.UndefOr[js.Any] = js.undefined
}

object NodeDroppedEventUIParam {
  @scala.inline
  def apply(
    binding: js.Any = null,
    data: js.Any = null,
    draggable: java.lang.String = null,
    element: java.lang.String = null,
    helper: java.lang.String = null,
    offset: js.Any = null,
    path: java.lang.String = null,
    position: js.Any = null
  ): NodeDroppedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding)
    if (data != null) __obj.updateDynamic("data")(data)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable)
    if (element != null) __obj.updateDynamic("element")(element)
    if (helper != null) __obj.updateDynamic("helper")(helper)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[NodeDroppedEventUIParam]
  }
}

