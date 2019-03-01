package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageInfo extends js.Object {
  /**
    * 当前占用的空间大小, 单位 KB
    */
  var currentSize: scala.Double
  /**
    * 当前 storage 中所有的 key
    */
  var keys: js.Array[java.lang.String]
  /**
    * 限制的空间大小，单位 KB
    */
  var limitSize: scala.Double
}

object StorageInfo {
  @scala.inline
  def apply(currentSize: scala.Double, keys: js.Array[java.lang.String], limitSize: scala.Double): StorageInfo = {
    val __obj = js.Dynamic.literal(currentSize = currentSize, keys = keys, limitSize = limitSize)
  
    __obj.asInstanceOf[StorageInfo]
  }
}

