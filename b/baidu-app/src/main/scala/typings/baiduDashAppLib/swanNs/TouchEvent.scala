package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEvent[T /* <: TouchEventType */]
  extends BaseEvent[T, baiduDashAppLib.Anon_X] {
  var changedTouches: js.Array[Touch]
  var touches: js.Array[Touch]
}

object TouchEvent {
  @scala.inline
  def apply[T /* <: TouchEventType */](
    changedTouches: js.Array[Touch],
    currentTarget: EventTarget,
    detail: baiduDashAppLib.Anon_X,
    target: EventTarget,
    timeStamp: scala.Double,
    touches: js.Array[Touch],
    `type`: T
  ): TouchEvent[T] = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, currentTarget = currentTarget, detail = detail, target = target, timeStamp = timeStamp, touches = touches, `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TouchEvent[T]]
  }
}

