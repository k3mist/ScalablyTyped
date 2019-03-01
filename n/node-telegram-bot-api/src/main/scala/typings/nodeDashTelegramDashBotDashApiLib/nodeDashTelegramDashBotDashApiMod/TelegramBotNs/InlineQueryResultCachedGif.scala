package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultCachedGif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var gif_file_id: java.lang.String
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.gif
}

object InlineQueryResultCachedGif {
  @scala.inline
  def apply(
    gif_file_id: java.lang.String,
    id: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.gif,
    caption: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    title: java.lang.String = null
  ): InlineQueryResultCachedGif = {
    val __obj = js.Dynamic.literal(gif_file_id = gif_file_id, id = id, `type` = `type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[InlineQueryResultCachedGif]
  }
}

