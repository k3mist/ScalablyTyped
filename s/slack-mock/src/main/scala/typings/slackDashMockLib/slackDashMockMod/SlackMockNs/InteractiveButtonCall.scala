package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveButtonCall[T] extends js.Object {
  var headers: InteractiveButtonHttpHeaders
  var params: T
  var statusCode: scala.Double
  var `type`: InteractiveButtonCallType
  var url: InteractiveButtonUrl
}

object InteractiveButtonCall {
  @scala.inline
  def apply[T](
    headers: InteractiveButtonHttpHeaders,
    params: T,
    statusCode: scala.Double,
    `type`: InteractiveButtonCallType,
    url: InteractiveButtonUrl
  ): InteractiveButtonCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers, params = params.asInstanceOf[js.Any], statusCode = statusCode, `type` = `type`, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InteractiveButtonCall[T]]
  }
}

