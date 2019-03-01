package typings
package angularDashUiDashSortableLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOptions[T] extends SortableEvents[T] {
  /**
    * jQuery, Element, Selector or string
    * Default: "parent"
    */
  var appendTo: js.UndefOr[js.Any] = js.undefined
  /**
    * "X", "Y" or false
    * Default: false
    */
  var axis: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Selector
    * Default: "input,textarea,button,select,option"
    */
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Selector or false
    * Default: false
    */
  var connectWith: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Element, Selector, string or false
    * Default: false
    */
  var containment: js.UndefOr[js.Any] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash using a combination of one or two keys SortableCursorAtOptions: { top, left, right, bottom }
    * Default: false
    */
  var cursorAt: js.UndefOr[SortableCursorAtOptions | scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var dropOnEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var forceHelperSize: js.UndefOr[scala.Boolean] = js.undefined
  var forcePlaceholderSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of numbers or false
    * Default: false
    */
  var grid: js.UndefOr[js.Array[scala.Double] | scala.Boolean] = js.undefined
  /**
    * Selector or Element
    */
  var handle: js.UndefOr[js.Any] = js.undefined
  /**
    * "original", "clone" or Function()
    * Default: "original"
    */
  var helper: js.UndefOr[java.lang.String | SortableHelperFunctionOption] = js.undefined
  /**
    * Selector
    */
  var items: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number or false
    * Default: false
    */
  var opacity: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * string or false
    * Default: false
    */
  var placeholder: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * boolean or number
    * Default: false
    */
  var revert: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  var scrollSensitivity: js.UndefOr[scala.Double] = js.undefined
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
    * "intersect" or "pointer"
    * Default: "intersect"
    */
  var tolerance: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object SortableOptions {
  @scala.inline
  def apply[T](
    activate: SortableEvent[T] = null,
    appendTo: js.Any = null,
    axis: java.lang.String | scala.Boolean = null,
    beforeStop: SortableEvent[T] = null,
    cancel: java.lang.String = null,
    change: SortableEvent[T] = null,
    connectWith: java.lang.String | scala.Boolean = null,
    containment: js.Any = null,
    cursor: java.lang.String = null,
    cursorAt: SortableCursorAtOptions | scala.Boolean = null,
    deactivate: SortableEvent[T] = null,
    delay: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    distance: scala.Int | scala.Double = null,
    dropOnEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    forceHelperSize: js.UndefOr[scala.Boolean] = js.undefined,
    forcePlaceholderSize: js.UndefOr[scala.Boolean] = js.undefined,
    grid: js.Array[scala.Double] | scala.Boolean = null,
    handle: js.Any = null,
    helper: java.lang.String | SortableHelperFunctionOption = null,
    items: java.lang.String = null,
    opacity: scala.Double | scala.Boolean = null,
    out: SortableEvent[T] = null,
    over: SortableEvent[T] = null,
    placeholder: java.lang.String | scala.Boolean = null,
    receive: SortableEvent[T] = null,
    remove: SortableEvent[T] = null,
    revert: scala.Double | scala.Boolean = null,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    scrollSensitivity: scala.Int | scala.Double = null,
    scrollSpeed: scala.Int | scala.Double = null,
    sort: SortableEvent[T] = null,
    start: SortableEvent[T] = null,
    stop: SortableEvent[T] = null,
    tolerance: java.lang.String = null,
    update: SortableEvent[T] = null,
    zIndex: scala.Int | scala.Double = null
  ): SortableOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(beforeStop)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (change != null) __obj.updateDynamic("change")(change)
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnEmpty)) __obj.updateDynamic("dropOnEmpty")(dropOnEmpty)
    if (!js.isUndefined(forceHelperSize)) __obj.updateDynamic("forceHelperSize")(forceHelperSize)
    if (!js.isUndefined(forcePlaceholderSize)) __obj.updateDynamic("forcePlaceholderSize")(forcePlaceholderSize)
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out)
    if (over != null) __obj.updateDynamic("over")(over)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (receive != null) __obj.updateDynamic("receive")(receive)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (revert != null) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance)
    if (update != null) __obj.updateDynamic("update")(update)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableOptions[T]]
  }
}

