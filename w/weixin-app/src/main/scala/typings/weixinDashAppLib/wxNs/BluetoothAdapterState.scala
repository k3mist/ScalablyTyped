package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothAdapterState extends js.Object {
  /**
  		 * 蓝牙适配器是否可用
  		 */
  var available: scala.Boolean
  /**
  		 * 蓝牙适配器是否处于搜索状态
  		 */
  var discovering: scala.Boolean
}

object BluetoothAdapterState {
  @scala.inline
  def apply(available: scala.Boolean, discovering: scala.Boolean): BluetoothAdapterState = {
    val __obj = js.Dynamic.literal(available = available, discovering = discovering)
  
    __obj.asInstanceOf[BluetoothAdapterState]
  }
}

