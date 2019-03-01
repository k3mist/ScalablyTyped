package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeDragAndDropSettings
  extends /**
	 * Option for IgTreeDragAndDropSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets whether the widget will accept drag and drop from other controls.
  	 *
  	 */
  var allowDrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the containment for the drag helper. The area inside of which thehelper is contained would be scrollable while dragging.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" If set to false, then the draggable elements will be contained in their window.
  	 * "selector" The draggable element will be contained to the bounding box of the first element found by the selector. If no element is found, no containment will be set.
  	 * "element" The draggable element will be contained to the bounding box of this element.
  	 * "string" Possible values: "parent", "document", "window".
  	 * "array" An array defining a bounding box in the form [ x1, y1, x2, y2 ].
  	 */
  var containment: js.UndefOr[scala.Boolean | java.lang.String | js.Object | js.Array[_]] = js.undefined
  /**
  	 * Gets the HTML markup for the "copy after" helper.
  	 *
  	 */
  var copyAfterMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the HTML markup for the "copy before" helper.
  	 *
  	 */
  var copyBeforeMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the HTML markup for the "copy between" helper.
  	 *
  	 */
  var copyBetweenMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the HTML markup for the "copy to" helper.
  	 *
  	 */
  var copyToMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the method for custom drop point validation. Returning true from this function would render the drop point valid, while false would make it invalid. The function has one parameter which is the current drop point and the context (this) of the function is the drag element.
  	 *
  	 *
  	 * Valid values:
  	 * "function" A function that will be used for validating drop points.
  	 * "null" Only built-in validation is applied.
  	 */
  var customDropValidation: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Gets the drag and drop mode.
  	 *
  	 *
  	 * Valid values:
  	 * "default" Performs "copy" when holding the Ctrl key, otherwise "move" is performed.
  	 * "copy" Makes a copy of the dragged node at the drop location.
  	 * "move" Moves the dragged node at the drop location.
  	 */
  var dragAndDropMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the opacity of the drag helper: 0 is fully transparent while 1 is fully opaque.
  	 *
  	 */
  var dragOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the delay between mousedown and the start of the actual drag. Smaller values make the nodes
  	 * more sensitive to drag and may interfere with selection.
  	 *
  	 */
  var dragStartDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the delay after hovering a parent node before expanding that node during drag when [expandOnDragOver](ui.igtree#options:dragAndDropSettings.expandOnDragOver) is set to true.
  	 *
  	 */
  var expandDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets whether when dragging over a collapsed node with children will trigger the node to expand.
  	 *
  	 */
  var expandOnDragOver: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the type of helper to be rendered for the drag operation.
  	 *
  	 *
  	 * Valid values:
  	 * "function" A function that will return a DOMElement to use while dragging.
  	 * "default" would render the default igTree helper.
  	 */
  var helper: js.UndefOr[js.Function | java.lang.String] = js.undefined
  /**
  	 * Gets the HTML markup for the invalid helper.
  	 *
  	 */
  var invalidMoveToMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the HTML markup for the "move after" helper.
  	 *
  	 */
  var moveAfterMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the HTML markup for the "move before" helper.
  	 *
  	 */
  var moveBeforeMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the HTML markup for the "move between" helper.
  	 *
  	 */
  var moveBetweenMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the HTML markup for the "move to" helper.
  	 *
  	 */
  var moveToMarkup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets whether the helper would revert to its original position upon an invalid drop.
  	 *
  	 */
  var revert: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the duration of the revert animation.
  	 *
  	 */
  var revertDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the z-index that would be set for the drag helper.
  	 *
  	 */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object IgTreeDragAndDropSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeDragAndDropSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowDrop: js.UndefOr[scala.Boolean] = js.undefined,
    containment: scala.Boolean | java.lang.String | js.Object | js.Array[_] = null,
    copyAfterMarkup: java.lang.String = null,
    copyBeforeMarkup: java.lang.String = null,
    copyBetweenMarkup: java.lang.String = null,
    copyToMarkup: java.lang.String = null,
    customDropValidation: js.Function = null,
    dragAndDropMode: java.lang.String = null,
    dragOpacity: scala.Int | scala.Double = null,
    dragStartDelay: scala.Int | scala.Double = null,
    expandDelay: scala.Int | scala.Double = null,
    expandOnDragOver: js.UndefOr[scala.Boolean] = js.undefined,
    helper: js.Function | java.lang.String = null,
    invalidMoveToMarkup: java.lang.String = null,
    moveAfterMarkup: java.lang.String = null,
    moveBeforeMarkup: java.lang.String = null,
    moveBetweenMarkup: java.lang.String = null,
    moveToMarkup: java.lang.String = null,
    revert: js.UndefOr[scala.Boolean] = js.undefined,
    revertDuration: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): IgTreeDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop)
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (copyAfterMarkup != null) __obj.updateDynamic("copyAfterMarkup")(copyAfterMarkup)
    if (copyBeforeMarkup != null) __obj.updateDynamic("copyBeforeMarkup")(copyBeforeMarkup)
    if (copyBetweenMarkup != null) __obj.updateDynamic("copyBetweenMarkup")(copyBetweenMarkup)
    if (copyToMarkup != null) __obj.updateDynamic("copyToMarkup")(copyToMarkup)
    if (customDropValidation != null) __obj.updateDynamic("customDropValidation")(customDropValidation)
    if (dragAndDropMode != null) __obj.updateDynamic("dragAndDropMode")(dragAndDropMode)
    if (dragOpacity != null) __obj.updateDynamic("dragOpacity")(dragOpacity.asInstanceOf[js.Any])
    if (dragStartDelay != null) __obj.updateDynamic("dragStartDelay")(dragStartDelay.asInstanceOf[js.Any])
    if (expandDelay != null) __obj.updateDynamic("expandDelay")(expandDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnDragOver)) __obj.updateDynamic("expandOnDragOver")(expandOnDragOver)
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (invalidMoveToMarkup != null) __obj.updateDynamic("invalidMoveToMarkup")(invalidMoveToMarkup)
    if (moveAfterMarkup != null) __obj.updateDynamic("moveAfterMarkup")(moveAfterMarkup)
    if (moveBeforeMarkup != null) __obj.updateDynamic("moveBeforeMarkup")(moveBeforeMarkup)
    if (moveBetweenMarkup != null) __obj.updateDynamic("moveBetweenMarkup")(moveBetweenMarkup)
    if (moveToMarkup != null) __obj.updateDynamic("moveToMarkup")(moveToMarkup)
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert)
    if (revertDuration != null) __obj.updateDynamic("revertDuration")(revertDuration.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeDragAndDropSettings]
  }
}

