package typings
package ejDotWebDotAllLib.ejNs.ScrollerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the swipe scrolling speed(in millisecond).
    * @Default {600}
    */
  var animationSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Set true to hides the scrollbar, when mouseout the content area.
    * @Default {false}
    */
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the height and width of button in the scrollbar.
    * @Default {18}
    */
  var buttonSize: js.UndefOr[scala.Double] = js.undefined
  /** Fires when Scroller control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Fires when Scroller control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates the Right to Left direction to scroller
    * @Default {undefined}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disable the touch Scroll
    * @Default {true}
    */
  var enableTouchScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies to enable or disable the scroller
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the height of Scroll panel and scrollbars.
    * @Default {250}
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** The Scroller content and scrollbars move left with given value.
    * @Default {0}
    */
  var scrollLeft: js.UndefOr[scala.Double] = js.undefined
  /** While press on the arrow key the scrollbar position added to the given pixel value.
    * @Default {57}
    */
  var scrollOneStepBy: js.UndefOr[scala.Double] = js.undefined
  /** The Scroller content and scrollbars move to top position with specified value.
    * @Default {0}
    */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /** If the scrollbar has vertical it set as width, else it will set as height of the handler.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[scala.Double] = js.undefined
  /** Indicates the target area to which scroller have to appear.
    * @Default {null}
    */
  var targetPane: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when a thumb point is removed from the touch surface.
    */
  var thumbEnd: js.UndefOr[js.Function1[/* e */ ThumbEndEventArgs, scala.Unit]] = js.undefined
  /** Fires when a thumb point is moved along the touch surface.
    */
  var thumbMove: js.UndefOr[js.Function1[/* e */ ThumbMoveEventArgs, scala.Unit]] = js.undefined
  /** Fires when a thumb point is placed on the touch surface.
    */
  var thumbStart: js.UndefOr[js.Function1[/* e */ ThumbStartEventArgs, scala.Unit]] = js.undefined
  /** It fires whenever the mouse wheel is rotated either in upwards or downwards.
    */
  var wheelMove: js.UndefOr[js.Function1[/* e */ WheelMoveEventArgs, scala.Unit]] = js.undefined
  /** It will fire when mouse trackball has been start to wheel.
    */
  var wheelStart: js.UndefOr[js.Function1[/* e */ WheelStartEventArgs, scala.Unit]] = js.undefined
  /** It will fire when mouse trackball has been stop to wheel.
    */
  var wheelStop: js.UndefOr[js.Function1[/* e */ WheelStopEventArgs, scala.Unit]] = js.undefined
  /** Specifies the width of Scroll panel and scrollbars.
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    animationSpeed: scala.Int | scala.Double = null,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    buttonSize: scala.Int | scala.Double = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableTouchScroll: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    scrollLeft: scala.Int | scala.Double = null,
    scrollOneStepBy: scala.Int | scala.Double = null,
    scrollTop: scala.Int | scala.Double = null,
    scrollerSize: scala.Int | scala.Double = null,
    targetPane: java.lang.String = null,
    thumbEnd: js.Function1[/* e */ ThumbEndEventArgs, scala.Unit] = null,
    thumbMove: js.Function1[/* e */ ThumbMoveEventArgs, scala.Unit] = null,
    thumbStart: js.Function1[/* e */ ThumbStartEventArgs, scala.Unit] = null,
    wheelMove: js.Function1[/* e */ WheelMoveEventArgs, scala.Unit] = null,
    wheelStart: js.Function1[/* e */ WheelStartEventArgs, scala.Unit] = null,
    wheelStop: js.Function1[/* e */ WheelStopEventArgs, scala.Unit] = null,
    width: scala.Double | java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (buttonSize != null) __obj.updateDynamic("buttonSize")(buttonSize.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableTouchScroll)) __obj.updateDynamic("enableTouchScroll")(enableTouchScroll)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollOneStepBy != null) __obj.updateDynamic("scrollOneStepBy")(scrollOneStepBy.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollerSize != null) __obj.updateDynamic("scrollerSize")(scrollerSize.asInstanceOf[js.Any])
    if (targetPane != null) __obj.updateDynamic("targetPane")(targetPane)
    if (thumbEnd != null) __obj.updateDynamic("thumbEnd")(thumbEnd)
    if (thumbMove != null) __obj.updateDynamic("thumbMove")(thumbMove)
    if (thumbStart != null) __obj.updateDynamic("thumbStart")(thumbStart)
    if (wheelMove != null) __obj.updateDynamic("wheelMove")(wheelMove)
    if (wheelStart != null) __obj.updateDynamic("wheelStart")(wheelStart)
    if (wheelStop != null) __obj.updateDynamic("wheelStop")(wheelStop)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

