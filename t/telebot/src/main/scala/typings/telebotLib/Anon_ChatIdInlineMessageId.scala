package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChatIdInlineMessageId extends js.Object {
  var chatId: js.UndefOr[scala.Double] = js.undefined
  var inlineMessageId: js.UndefOr[java.lang.String] = js.undefined
  var messageId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ChatIdInlineMessageId {
  @scala.inline
  def apply(
    chatId: scala.Int | scala.Double = null,
    inlineMessageId: java.lang.String = null,
    messageId: scala.Int | scala.Double = null
  ): Anon_ChatIdInlineMessageId = {
    val __obj = js.Dynamic.literal()
    if (chatId != null) __obj.updateDynamic("chatId")(chatId.asInstanceOf[js.Any])
    if (inlineMessageId != null) __obj.updateDynamic("inlineMessageId")(inlineMessageId)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChatIdInlineMessageId]
  }
}

