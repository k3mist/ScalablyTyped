package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlashCommandCall[T] extends js.Object {
  var headers: SlashCommandHttpHeaders
  var params: T
  var statusCode: scala.Double
  var `type`: SlashCommandCallType
  var url: SlashCommandUrl
}

object SlashCommandCall {
  @scala.inline
  def apply[T](
    headers: SlashCommandHttpHeaders,
    params: T,
    statusCode: scala.Double,
    `type`: SlashCommandCallType,
    url: SlashCommandUrl
  ): SlashCommandCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers, params = params.asInstanceOf[js.Any], statusCode = statusCode, `type` = `type`, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SlashCommandCall[T]]
  }
}

