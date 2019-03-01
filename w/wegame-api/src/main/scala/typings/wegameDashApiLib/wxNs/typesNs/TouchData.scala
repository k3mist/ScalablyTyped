package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchData extends js.Object {
  /**
    * 触发此次事件的触摸点列表
    */
  var changedTouches: js.Array[Touch]
  /**
    * 事件触发时的时间戳
    */
  var timeStamp: scala.Double
  /**
    * 当前所有触摸点的列表
    */
  var touches: js.Array[Touch]
}

object TouchData {
  @scala.inline
  def apply(changedTouches: js.Array[Touch], timeStamp: scala.Double, touches: js.Array[Touch]): TouchData = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, timeStamp = timeStamp, touches = touches)
  
    __obj.asInstanceOf[TouchData]
  }
}

