package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoData extends js.Object {
  /** 选定视频的时间长度 */
  var duration: scala.Double
  /** 返回选定视频的长 */
  var height: scala.Double
  /** 选定视频的数据量大小 */
  var size: scala.Double
  /** 选定视频的临时文件路径 */
  var tempFilePath: java.lang.String
  /** 返回选定视频的宽 */
  var width: scala.Double
}

object VideoData {
  @scala.inline
  def apply(
    duration: scala.Double,
    height: scala.Double,
    size: scala.Double,
    tempFilePath: java.lang.String,
    width: scala.Double
  ): VideoData = {
    val __obj = js.Dynamic.literal(duration = duration, height = height, size = size, tempFilePath = tempFilePath, width = width)
  
    __obj.asInstanceOf[VideoData]
  }
}

