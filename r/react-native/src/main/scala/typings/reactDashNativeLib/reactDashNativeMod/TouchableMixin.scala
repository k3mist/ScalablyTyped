package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\Components\Touchable\Touchable.js
  */
trait TouchableMixin extends js.Object {
  /**
    * Returns the number of millis to wait before triggering a highlight.
    */
  def touchableGetHighlightDelayMS(): scala.Double
  def touchableGetHitSlop(): Insets
  // These methods are undocumented but still being used by TouchableMixin internals
  def touchableGetLongPressDelayMS(): scala.Double
  def touchableGetPressOutDelayMS(): scala.Double
  /**
    * Returns the amount to extend the `HitRect` into the `PressRect`. Positive
    * numbers mean the size expands outwards.
    */
  def touchableGetPressRectOffset(): Insets
  /**
    * Invoked when the item should be highlighted. Mixers should implement this
    * to visually distinguish the `VisualRect` so that the user knows that
    * releasing a touch will result in a "selection" (analog to click).
    */
  def touchableHandleActivePressIn(e: GestureResponderEvent): scala.Unit
  /**
    * Invoked when the item is "active" (in that it is still eligible to become
    * a "select") but the touch has left the `PressRect`. Usually the mixer will
    * want to unhighlight the `VisualRect`. If the user (while pressing) moves
    * back into the `PressRect` `touchableHandleActivePressIn` will be invoked
    * again and the mixer should probably highlight the `VisualRect` again. This
    * event will not fire on an `touchEnd/mouseUp` event, only move events while
    * the user is depressing the mouse/touch.
    */
  def touchableHandleActivePressOut(e: GestureResponderEvent): scala.Unit
  /**
    * Invoked when the item is long pressed - meaning the interaction ended by
    * letting up while the item was in `RESPONDER_ACTIVE_LONG_PRESS_IN`. If
    * `touchableHandleLongPress` is *not* provided, `touchableHandlePress` will
    * be called as it normally is. If `touchableHandleLongPress` is provided, by
    * default any `touchableHandlePress` callback will not be invoked. To
    * override this default behavior, override `touchableLongPressCancelsPress`
    * to return false. As a result, `touchableHandlePress` will be called when
    * lifting up, even if `touchableHandleLongPress` has also been called.
    */
  def touchableHandleLongPress(e: GestureResponderEvent): scala.Unit
  /**
    * Invoked when the item is "selected" - meaning the interaction ended by
    * letting up while the item was either in the state
    * `RESPONDER_ACTIVE_PRESS_IN` or `RESPONDER_INACTIVE_PRESS_IN`.
    */
  def touchableHandlePress(e: GestureResponderEvent): scala.Unit
}

object TouchableMixin {
  @scala.inline
  def apply(
    touchableGetHighlightDelayMS: js.Function0[scala.Double],
    touchableGetHitSlop: js.Function0[Insets],
    touchableGetLongPressDelayMS: js.Function0[scala.Double],
    touchableGetPressOutDelayMS: js.Function0[scala.Double],
    touchableGetPressRectOffset: js.Function0[Insets],
    touchableHandleActivePressIn: js.Function1[GestureResponderEvent, scala.Unit],
    touchableHandleActivePressOut: js.Function1[GestureResponderEvent, scala.Unit],
    touchableHandleLongPress: js.Function1[GestureResponderEvent, scala.Unit],
    touchableHandlePress: js.Function1[GestureResponderEvent, scala.Unit]
  ): TouchableMixin = {
    val __obj = js.Dynamic.literal(touchableGetHighlightDelayMS = touchableGetHighlightDelayMS, touchableGetHitSlop = touchableGetHitSlop, touchableGetLongPressDelayMS = touchableGetLongPressDelayMS, touchableGetPressOutDelayMS = touchableGetPressOutDelayMS, touchableGetPressRectOffset = touchableGetPressRectOffset, touchableHandleActivePressIn = touchableHandleActivePressIn, touchableHandleActivePressOut = touchableHandleActivePressOut, touchableHandleLongPress = touchableHandleLongPress, touchableHandlePress = touchableHandlePress)
  
    __obj.asInstanceOf[TouchableMixin]
  }
}

