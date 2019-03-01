package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Resizable //////////////////////////////////////////////////
trait ResizableOptions extends ResizableEvents {
  var alsoResize: js.UndefOr[js.Any] = js.undefined
   // Selector, JQuery or Element
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var animateDuration: js.UndefOr[js.Any] = js.undefined
   // number or string
  var animateEasing: js.UndefOr[java.lang.String] = js.undefined
  var aspectRatio: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var containment: js.UndefOr[js.Any] = js.undefined
   // Selector, Element or string
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var ghost: js.UndefOr[scala.Boolean] = js.undefined
  var grid: js.UndefOr[js.Any] = js.undefined
  var handles: js.UndefOr[js.Any] = js.undefined
   // string or object
  var helper: js.UndefOr[java.lang.String] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
}

object ResizableOptions {
  @scala.inline
  def apply(
    alsoResize: js.Any = null,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animateDuration: js.Any = null,
    animateEasing: java.lang.String = null,
    aspectRatio: js.Any = null,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: java.lang.String = null,
    containment: js.Any = null,
    create: ResizableEvent = null,
    delay: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    distance: scala.Int | scala.Double = null,
    ghost: js.UndefOr[scala.Boolean] = js.undefined,
    grid: js.Any = null,
    handles: js.Any = null,
    helper: java.lang.String = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    resize: ResizableEvent = null,
    start: ResizableEvent = null,
    stop: ResizableEvent = null
  ): ResizableOptions = {
    val __obj = js.Dynamic.literal()
    if (alsoResize != null) __obj.updateDynamic("alsoResize")(alsoResize)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animateDuration != null) __obj.updateDynamic("animateDuration")(animateDuration)
    if (animateEasing != null) __obj.updateDynamic("animateEasing")(animateEasing)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (create != null) __obj.updateDynamic("create")(create)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (handles != null) __obj.updateDynamic("handles")(handles)
    if (helper != null) __obj.updateDynamic("helper")(helper)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[ResizableOptions]
  }
}

