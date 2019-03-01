package typings
package jqueryDotScrolltoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions extends js.Object {
  /**
    * Which axis must be scrolled, use 'x', 'y', 'xy' or 'yx'.
    */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The OVERALL length of the animation.
    */
  var duration: js.UndefOr[js.Any] = js.undefined
  /**
    * The easing method for the animation.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the margin of the target element will be deducted from the final position.
    */
  var margin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add/deduct from the end position. 
    * One number for both axes or { top:x, left:y }.
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /**
    * Function to be called after the scrolling ends. 
    */
  var onAfter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    *  If queuing is activated, this function will be called after the first scrolling ends.
    */
  var onAfterFirst: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Add/deduct the height/width multiplied by 'over'.
    * Can be { top:x, left:y } when using both axes.
    */
  var over: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, and both axis are given.
    * The 2nd axis will only be animated after the first one ends.
    */
  var queue: js.UndefOr[scala.Boolean] = js.undefined
}

object ScrollToOptions {
  @scala.inline
  def apply(
    axis: java.lang.String = null,
    duration: js.Any = null,
    easing: java.lang.String = null,
    margin: js.UndefOr[scala.Boolean] = js.undefined,
    offset: js.Any = null,
    onAfter: js.Function0[scala.Unit] = null,
    onAfterFirst: js.Function0[scala.Unit] = null,
    over: js.Any = null,
    queue: js.UndefOr[scala.Boolean] = js.undefined
  ): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onAfterFirst != null) __obj.updateDynamic("onAfterFirst")(onAfterFirst)
    if (over != null) __obj.updateDynamic("over")(over)
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue)
    __obj.asInstanceOf[ScrollToOptions]
  }
}

