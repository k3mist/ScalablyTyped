package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFileResponse extends js.Object {
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: scala.Double
  /** 文件的临时路径 */
  var tempFilePath: java.lang.String
}

object TempFileResponse {
  @scala.inline
  def apply(statusCode: scala.Double, tempFilePath: java.lang.String): TempFileResponse = {
    val __obj = js.Dynamic.literal(statusCode = statusCode, tempFilePath = tempFilePath)
  
    __obj.asInstanceOf[TempFileResponse]
  }
}

